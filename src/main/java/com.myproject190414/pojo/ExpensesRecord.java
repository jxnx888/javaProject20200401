package com.myproject190414.pojo;

import java.util.Date;

public class ExpensesRecord {
    private Integer id;

    private Integer user;

    private Double amount;

    private Integer type;

    private Date createtime;

    private Integer effective;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getEffective() {
        return effective;
    }

    public void setEffective(Integer effective) {
        this.effective = effective;
    }
}