package com.zj.company.controller;

import com.zj.common.entity.Result;
import com.zj.common.entity.ResultCode;
import com.zj.company.service.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Company)表控制层
 *
 * @author makejava
 * @since 2024-03-04 09:31:13
 */
@RestController
@RequestMapping("company")
public class CompanyController {
    /**
     * 服务对象
     */
    @Resource
    private CompanyService companyService;


    @GetMapping("/get/{id}")
    public Result getCompanyInfo(@PathVariable("id") Long id) {
        return new Result(ResultCode.SUCCESS,companyService.getCompanyById(id));
    }


}

