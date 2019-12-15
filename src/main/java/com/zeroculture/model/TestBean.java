package com.zeroculture.model;


import java.io.Serializable;

/**
 * Description: 实体类
 * @author: Richard
 * @version: 1.0
 * Create Date:
 * @Company: 零点文化（深圳）有限公司
 * @Copyright: Zero  Culture (ShenZhen) Co., LTD. Rights Reserved
 **/
public class TestBean implements Serializable {

    private static final long serialVersionUID = -3502181128455650518L;

    private int id;

    private String name;

    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TestBean{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
