package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.TicketDTO;

@Repository
public class TicketDAOImp extends BaseDAOImpl<TicketDTO> implements TicketDAOInt{

	
	@Override
	protected List<Predicate> getWhereClause(TicketDTO dto, CriteriaBuilder builder, Root<TicketDTO> qRoot) {

		// Create where conditions
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isZeroNumber(dto.getId())) {

			whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
		}

		if (!isEmptyString(dto.getPassengerName())) {

			whereCondition.add(builder.like(qRoot.get("passengerName"), dto.getPassengerName() + "%"));
		}

		if (!isEmptyString(dto.getTicketNo())) {

			whereCondition.add(builder.equal(qRoot.get("ticketNo"), dto.getTicketNo()));
		}
		if (!isEmptyString(dto.getFromStation())) {

			whereCondition.add(builder.like(qRoot.get("fromStation"), dto.getFromStation()));
		}
		if (!isEmptyString(dto.getToStation())) {

			whereCondition.add(builder.like(qRoot.get("toStation"), dto.getToStation()));
		}

		if (isNotNull(dto.getDob())) {

			whereCondition.add(builder.equal(qRoot.get("dob"), dto.getDob()));
		}

		return whereCondition;
	}

	@Override
	public Class<TicketDTO> getDTOClass() {
		return TicketDTO.class;
	}

}
