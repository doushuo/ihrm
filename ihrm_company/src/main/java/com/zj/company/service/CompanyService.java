package com.zj.company.service;

import com.zj.company.entity.Company;

/**
 * (Company)表服务接口
 *
 * @author makejava
 * @since 2024-03-04 09:31:13
 */
public interface CompanyService {


    Company getCompanyById(Long id);
}
