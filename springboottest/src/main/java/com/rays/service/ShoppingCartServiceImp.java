package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ShoppingCartDAOInt;
import com.rays.dto.ShoppingCartDTO;


@Service
@Transactional
public class ShoppingCartServiceImp extends BaseServiceImpl<ShoppingCartDTO, ShoppingCartDAOInt> implements ShoppingCartServiceInt{

}
