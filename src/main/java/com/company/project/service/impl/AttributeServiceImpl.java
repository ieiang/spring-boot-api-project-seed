package com.company.project.service.impl;

import com.company.project.dao.AttributeMapper;
import com.company.project.model.Attribute;
import com.company.project.service.AttributeService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ergou on 2017/11/03.
 */
@Service
@Transactional
public class AttributeServiceImpl extends AbstractService<Attribute> implements AttributeService {
    @Resource
    private AttributeMapper attributeMapper;

}
