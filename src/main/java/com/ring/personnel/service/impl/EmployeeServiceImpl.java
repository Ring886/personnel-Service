package com.ring.personnel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ring.personnel.entity.Employee;
import com.ring.personnel.mapper.EmployeeMapper;
import com.ring.personnel.service.IEmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {
}