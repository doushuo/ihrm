package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.io.Serializable;

/**
 * (Department)实体类
 *
 * @author makejava
 * @since 2024-03-04 12:33:56
 */
@Entity
@Table(name = "co_department")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable {
    private static final long serialVersionUID = -66621623489786507L;

    @Id
    private String id;
    /**
     * 企业ID
     */
    private String companyId;
    /**
     * 父级部门ID
     */
    private String parentId;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 部门编码
     */
    private String code;
    /**
     * 部门类别
     */
    private String category;
    /**
     * 负责人ID
     */
    private String managerId;
    /**
     * 城市
     */
    private String city;
    /**
     * 介绍
     */
    private String introduce;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 部门负责人
     */
    private String manager;


    public void setId(String id) {
        this.id = id;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

}

