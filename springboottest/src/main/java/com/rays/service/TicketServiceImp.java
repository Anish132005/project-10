package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.TicketDAOInt;
import com.rays.dto.TicketDTO;

@Service
@Transactional
public class TicketServiceImp extends BaseServiceImpl<TicketDTO, TicketDAOInt> implements TicketServiceInt{

}
