package com.zj.company.service.impl;

import com.zj.company.dao.DepartmentDao;
import com.zj.company.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Department)表服务实现类
 *
 * @author makejava
 * @since 2024-03-04 12:33:57
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentDao departmentDao;


}
