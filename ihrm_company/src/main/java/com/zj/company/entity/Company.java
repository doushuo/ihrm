package com.zj.company.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * (Company)实体类
 *
 * @author makejava
 * @since 2024-03-04 09:31:13
 */
@Entity
@Table(name = "co_company")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company implements Serializable {
    private static final long serialVersionUID = -52636851543403570L;
    /**
     * ID
     */
    @Id
    private String id;
    /**
     * 公司名称
     */
    private String name;
    /**
     * 企业登录账号ID
     */
    private String managerId;
    /**
     * 当前版本
     */
    private String version;
    /**
     * 续期时间
     */
    private Date renewalDate;
    /**
     * 到期时间
     */
    private Date expirationDate;
    /**
     * 公司地区
     */
    private String companyArea;
    /**
     * 公司地址
     */
    private String companyAddress;
    /**
     * 营业执照-图片ID
     */
    private String businessLicenseId;
    /**
     * 法人代表
     */
    private String legalRepresentative;
    /**
     * 公司电话
     */
    private String companyPhone;
    /**
     * 邮箱
     */
    private String mailbox;
    /**
     * 公司规模
     */
    private String companySize;
    /**
     * 所属行业
     */
    private String industry;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 审核状态
     */
    private String auditState;
    /**
     * 状态
     */
    private Integer state;
    /**
     * 当前余额
     */
    private String balance;
    /**
     * 创建时间
     */
    private Date createTime;


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setCompanyArea(String companyArea) {
        this.companyArea = companyArea;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public void setBusinessLicenseId(String businessLicenseId) {
        this.businessLicenseId = businessLicenseId;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

