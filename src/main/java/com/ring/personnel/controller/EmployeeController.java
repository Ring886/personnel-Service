package com.ring.personnel.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ring.personnel.common.Result;
import com.ring.personnel.entity.Employee;
import com.ring.personnel.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin // 允许 Vue 跨域访问
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    // 1. 获取所有员工
    @GetMapping("/list")
    public Result<List<Employee>> list() {
        return Result.success(employeeService.list());
    }

    // 2. 根据 ID 查询
    @GetMapping("/{id}")
    public Result<Employee> getById(@PathVariable Long id) {
        return Result.success(employeeService.getById(id));
    }

    // 3. 新增员工
    @PostMapping("/add")
    public Result<Boolean> add(@RequestBody Employee employee) {
        // 这里可以加一些校验逻辑，比如工号是否重复
        return Result.success(employeeService.save(employee));
    }

    // 4. 修改员工
    @PutMapping("/update")
    public Result<Boolean> update(@RequestBody Employee employee) {
        return Result.success(employeeService.updateById(employee));
    }

    // 5. 删除员工
    @DeleteMapping("/{id}")
    public Result<Boolean> delete(@PathVariable Long id) {
        return Result.success(employeeService.removeById(id));
    }

    // 6. 搜索接口 (例如：根据姓名模糊搜索)
    @GetMapping("/search")
    public Result<List<Employee>> search(@RequestParam String name) {
        LambdaQueryWrapper<Employee> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(Employee::getName, name);
        return Result.success(employeeService.list(wrapper));
    }
}