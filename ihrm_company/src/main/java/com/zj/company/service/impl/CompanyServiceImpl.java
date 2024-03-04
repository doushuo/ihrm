package com.zj.company.service.impl;

import com.zj.company.dao.CompanyDao;
import com.zj.company.entity.Company;
import com.zj.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (Company)表服务实现类
 *
 * @author makejava
 * @since 2024-03-04 09:31:13
 */
@Service("companyService")
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;


    @Override
    public Company getCompanyById(Long id) {
        return companyDao.getCompanyById(String.valueOf(id));
    }
}
