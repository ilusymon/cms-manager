package com.tmg.entity.auth;


/**
 * 该类为自动生成
 * @author garmbrood
 * @since  2009-05-05 11:34:48
 * @version 1.0
 * Company 天极传媒集团
 * Descripion 用户权限视图信息(cms_user_privilege_view)
 */
public class UserPrivilegeView {

    public static final String ADMIN_CODE = "super_manage";
    public static final String LIMIT_CODE = "limit_manage";

        
    /** 登录名 */
	private String pin;

        
    /** 节点号 */
	private int sitemapId;

        
    /** 权限id */
	private int privilegeId;

    /** 权限编码**/
    private String privilegeCode;

        
    /** 权限名称 */
	private String privilegeName;

        
    /** 权限类型 */
	private int privilegeType;

        
    /** 权限分类id */
	private int privilegeCategoryId;

    /** 站点名称 */
	private String sitemapname;

    /** 角色id */
	private int roleId;
	
    /** 角色名称 */
	private String rolename;
	
    /** 站点id */
	private int siteId;
	
    /** 部门名称 */
	private String departmentname;


    /**
     * 层次编码
     */
    private long levelCode;


    public long getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(long levelCode) {
        this.levelCode = levelCode;
    }

    public String getSitemapname() {
		return sitemapname;
	}
	public void setSitemapname(String sitemapname) {
		this.sitemapname = sitemapname;
	}
	/**
     * @return 
     */
	public String getPin() {
    	return this.pin;
    }
    /**
     * @param _pin 
     */
	public void setPin(String _pin) {
    	this.pin = _pin;
    }


    /**
     * @return 
     */
	public int getSitemapId() {
    	return this.sitemapId;
    }
    /**
     * @param _sitemapId 
     */
	public void setSitemapId(int _sitemapId) {
    	this.sitemapId = _sitemapId;
    }


    /**
     * @return 
     */
	public int getPrivilegeId() {
    	return this.privilegeId;
    }
    /**
     * @param _privilegeId 
     */
	public void setPrivilegeId(int _privilegeId) {
    	this.privilegeId = _privilegeId;
    }


    /**
     * @return 
     */
	public String getPrivilegeName() {
    	return this.privilegeName;
    }
    /**
     * @param _privilegeName 
     */
	public void setPrivilegeName(String _privilegeName) {
    	this.privilegeName = _privilegeName;
    }


    /**
     * @return 
     */
	public int getPrivilegeType() {
    	return this.privilegeType;
    }
    /**
     * @param _privilegeType 
     */
	public void setPrivilegeType(int _privilegeType) {
    	this.privilegeType = _privilegeType;
    }


    /**
     * @return 
     */
	public int getPrivilegeCategoryId() {
    	return this.privilegeCategoryId;
    }
    /**
     * @param _privilegeCategoryId 
     */
	public void setPrivilegeCategoryId(int _privilegeCategoryId) {
    	this.privilegeCategoryId = _privilegeCategoryId;
    }

    public String getPrivilegeCode() {
        return privilegeCode;
    }

    public void setPrivilegeCode(String privilegeCode) {
        this.privilegeCode = privilegeCode;
    }

	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public int getSiteId() {
		return siteId;
	}
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof UserPrivilegeView)){
           return false;
        }else{
           UserPrivilegeView o = (UserPrivilegeView)obj;
           if(o.getSitemapId() == this.getSitemapId() && o.getPrivilegeId()==this.getPrivilegeId()){
              return true;
           }
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("UserPrivilegeView");
        sb.append("{pin='").append(pin).append('\'');
        sb.append(", sitemapId=").append(sitemapId);
        sb.append(", privilegeId=").append(privilegeId);
        sb.append(", privilegeCode='").append(privilegeCode).append('\'');
        sb.append(", privilegeName='").append(privilegeName).append('\'');
        sb.append(", privilegeType=").append(privilegeType);
        sb.append(", privilegeCategoryId=").append(privilegeCategoryId);
        sb.append(", sitemapname='").append(sitemapname).append('\'');
        sb.append(", roleId=").append(roleId);
        sb.append(", rolename='").append(rolename).append('\'');
        sb.append(", siteId=").append(siteId);
        sb.append(", departmentname='").append(departmentname).append('\'');
        sb.append(", levelCode=").append(levelCode);
        sb.append('}');
        return sb.toString();
    }
}