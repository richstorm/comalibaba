package com.zeroculture.service.impl;

import com.zeroculture.dao.TestBeanMapper;
import com.zeroculture.model.TestBean;
import com.zeroculture.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestBeanMapper testBeanMapper;

    @Override
    public List<TestBean> getUserList(){
        return testBeanMapper.getUserList();
    }

}
