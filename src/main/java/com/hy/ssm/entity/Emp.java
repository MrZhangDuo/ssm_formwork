package com.hy.ssm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangduo
 * @since 2020-03-24
 */
@TableName(value = "emp")
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "empno",type = IdType.UUID)
    private String empno;

    private String empname;

    private String empsex;

    private Integer deptno;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date emptime;

    private String image;

    public String getEmpno() {
        return empno;
    }
    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }
    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpsex() {
        return empsex;
    }
    public void setEmpsex(String empsex) {
        this.empsex = empsex;
    }

    public Integer getDeptno() {
        return deptno;
    }
    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public Date getEmptime() {
        return emptime;
    }
    public void setEmptime(Date emptime) {
        this.emptime = emptime;
    }

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Emp{" +
        "empno=" + empno +
        ", empname=" + empname +
        ", empsex=" + empsex +
        ", deptno=" + deptno +
        ", emptime=" + emptime +
        ", image=" + image +
        "}";
    }
}
