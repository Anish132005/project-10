package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PaymentDTO;

@Repository
public class PaymentDAOImp extends BaseDAOImpl<PaymentDTO> implements PaymentDAOInt {
	
	@Override
	protected List<Predicate> getWhereClause(PaymentDTO dto, CriteriaBuilder builder, Root<PaymentDTO> qRoot) {

		// Create where conditions
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isZeroNumber(dto.getId())) {

			whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
		}
		
		if (!isEmptyString(dto.getCustomerName())) {

			whereCondition.add(builder.like(qRoot.get("customerName"), dto.getCustomerName() + "%"));
		}

		if (!isEmptyString(dto.getAmount())) {

			whereCondition.add(builder.like(qRoot.get("amount"), dto.getAmount() + "%"));
		}
		if (!isEmptyString(dto.getPaymentMethod())) {

			whereCondition.add(builder.like(qRoot.get("paymentMethod"), dto.getPaymentMethod() + "%"));
		}

		if (!isEmptyString(dto.getTransactionId())) {

			whereCondition.add(builder.like(qRoot.get("transactionId"), dto.getTransactionId() + "%"));
		}

		return whereCondition;
	}

	@Override
	public Class<PaymentDTO> getDTOClass() {
		return PaymentDTO.class;
	}


}
