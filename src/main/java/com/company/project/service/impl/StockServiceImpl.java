package com.company.project.service.impl;

import com.company.project.dao.StockMapper;
import com.company.project.model.Stock;
import com.company.project.service.StockService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ergou on 2017/11/03.
 */
@Service
@Transactional
public class StockServiceImpl extends AbstractService<Stock> implements StockService {
    @Resource
    private StockMapper stockMapper;

}
