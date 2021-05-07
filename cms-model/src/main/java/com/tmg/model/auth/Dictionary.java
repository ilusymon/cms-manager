package com.tmg.model.auth;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 该类为自动生成
 *
 * @author garmbrood
 * @version 1.0
 * @Company 天极传媒集团
 * @Descripion 管理系统的一些列表定义
 * @since 2009-04-30 14:21:43
 */
@Data
@TableName("cms_dictionary")
public class Dictionary {


    /**
     * id
     */
    private int id;


    /**
     * 1 权限分类　2 资源分类　。。。
     */
    private int type;


    /**
     * 名称
     */
    private String name;


    /**
     * 值
     */
    private String value;


    /**
     * 描述信息
     */
    private String description;


    /**
     * 创建人
     */
    private String creator;


    /**
     * 创建日期
     */
    private Date createdTime;


    /**
     * 更新人
     */
    private String updator;


    /**
     * 更新日期
     */
    private Date updatedTime;


    /**
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * @param _id id
     */
    public void setId(int _id) {
        this.id = _id;
    }


    /**
     * @return 1 权限分类　2 资源分类　。。。
     */
    public int getType() {
        return this.type;
    }

    /**
     * @param _type 1 权限分类　2 资源分类　。。。
     */
    public void setType(int _type) {
        this.type = _type;
    }


    /**
     * @return 名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param _name 名称
     */
    public void setName(String _name) {
        this.name = _name;
    }


    /**
     * @return 值
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @param _value 值
     */
    public void setValue(String _value) {
        this.value = _value;
    }


    /**
     * @return 描述信息
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param _description 描述信息
     */
    public void setDescription(String _description) {
        this.description = _description;
    }


    /**
     * @return 创建人
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @param _creator 创建人
     */
    public void setCreator(String _creator) {
        this.creator = _creator;
    }


    /**
     * @return 创建日期
     */
    public Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @param _createdTime 创建日期
     */
    public void setCreatedTime(Date _createdTime) {
        this.createdTime = _createdTime;
    }


    /**
     * @return 更新人
     */
    public String getUpdator() {
        return this.updator;
    }

    /**
     * @param _updator 更新人
     */
    public void setUpdator(String _updator) {
        this.updator = _updator;
    }


    /**
     * @return 更新日期
     */
    public Date getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * @param _updatedTime 更新日期
     */
    public void setUpdatedTime(Date _updatedTime) {
        this.updatedTime = _updatedTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("CMS_DICTIONARY{").
                append(",id=").append(id).
                append(",type=").append(type).
                append(",name=").append(name).
                append(",value=").append(value).
                append(",description=").append(description).
                append(",creator=").append(creator).
                append(",createdTime=").append(createdTime).
                append(",updator=").append(updator).
                append(",updatedTime=").append(updatedTime).
                append('}');
        return sb.toString();
    }
}