package com.ring.personnel.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ring.personnel.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
    // 基础的 CRUD 已经自动继承了
}