package com.company.project.service.impl;

import com.company.project.dao.McUserMapper;
import com.company.project.model.McUser;
import com.company.project.service.McUserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ergou on 2017/11/03.
 */
@Service
@Transactional
public class McUserServiceImpl extends AbstractService<McUser> implements McUserService {
    @Resource
    private McUserMapper mcUserMapper;

}
