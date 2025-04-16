package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ShoppingCartDTO;

@Repository
public class ShoppingCartDAOImp extends BaseDAOImpl<ShoppingCartDTO> implements ShoppingCartDAOInt{
	
	@Override
	protected List<Predicate> getWhereClause(ShoppingCartDTO dto, CriteriaBuilder builder, Root<ShoppingCartDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();
		

		if (!isZeroNumber(dto.getId())) {

			whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
		}

		if (!isEmptyString(dto.getProductName())) {

			whereCondition.add(builder.like(qRoot.get("productName"), dto.getProductName() + "%"));
		}

		if (isNotNull(dto.getDate())) {

			whereCondition.add(builder.equal(qRoot.get("date"), dto.getDate()));
		}
		if (!isEmptyString(dto.getQuantity())) {

			whereCondition.add(builder.equal(qRoot.get("quantity"), dto.getQuantity()));
		}

		if (!isEmptyString(dto.getAmount())) {

			whereCondition.add(builder.equal(qRoot.get("Amount"), dto.getAmount()));
		}


		return whereCondition;
	}

	@Override
	public Class<ShoppingCartDTO> getDTOClass() {
		return ShoppingCartDTO.class;
	}


}
