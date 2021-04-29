package com.tmg.entity.auth;


import java.util.Date;

/**
 * 该类为自动生成
 *
 * @author garmbrood
 * @version 1.0
 * @Company 天极传媒集团
 * @Descripion 角色拥有的权限表 (cms_role_privilege)
 * @since 2009-04-30 14:21:43
 */
public class RolePrivilege {


    /**
     * 角色ID
     */
    private int roleId;


    /**
     * 权限ID
     */
    private int privilegeId;


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
     * 角色名称
     */
    private String name;
    

    /**
     * 站点名称
     */
    private String sitemapname;
    
    
    public String getSitemapname() {
		return sitemapname;
	}

	public void setSitemapname(String sitemapname) {
		this.sitemapname = sitemapname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
     * @return 角色ID
     */
    public int getRoleId() {
        return this.roleId;
    }

    /**
     * @param _roleId 角色ID
     */
    public void setRoleId(int _roleId) {
        this.roleId = _roleId;
    }


    /**
     * @return 权限ID
     */
    public int getPrivilegeId() {
        return this.privilegeId;
    }

    /**
     * @param _privilegeId 权限ID
     */
    public void setPrivilegeId(int _privilegeId) {
        this.privilegeId = _privilegeId;
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
        sb.append("CMS_ROLE_PRIVILEGE{").
                append(",roleId=").append(roleId).
                append(",privilegeId=").append(privilegeId).
                append(",creator=").append(creator).
                append(",createdTime=").append(createdTime).
                append(",updator=").append(updator).
                append(",updatedTime=").append(updatedTime).
                append('}');
        return sb.toString();
    }
}