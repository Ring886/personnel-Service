package com.ring.personnel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@TableName("sys_employee") // 对应数据库表名
public class Employee {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String workId;
    private String gender;
    private String email;
    private String phone;
    private String jobTitle;
    private LocalDate hireDate;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}