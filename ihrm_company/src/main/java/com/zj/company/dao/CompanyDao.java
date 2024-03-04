package com.zj.company.dao;

import com.zj.company.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * (Company)表数据库访问层
 *
 * @author makejava
 * @since 2024-03-04 09:31:13
 */
public interface CompanyDao extends JpaRepository<Company, String>,
        JpaSpecificationExecutor<Company> {


    Company getCompanyById(String id);
}

