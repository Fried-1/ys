package com.service.impl;


import com.bean.Dept;
import com.mapper.EmpTest;
import com.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {


    @Autowired
    private EmpTest empTest;

    @Override
    public List getDept() {
        List<Dept> depts = empTest.selectDept();
        return depts;
    }
}
