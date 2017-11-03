package com.company.project.service.impl;

import com.company.project.dao.ProductInfoMapper;
import com.company.project.model.ProductInfo;
import com.company.project.service.ProductInfoService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ergou on 2017/11/03.
 */
@Service
@Transactional
public class ProductInfoServiceImpl extends AbstractService<ProductInfo> implements ProductInfoService {
    @Resource
    private ProductInfoMapper productInfoMapper;

}
