package com.tmg.entity.auth;

import java.util.Date;
import java.util.List;

/**
 * 该类为自动生成
 *
 * @author garmbrood
 * @version 1.0
 * @Company 天极传媒集团
 * @Descripion 用户角色关联表(cms_user_role)
 * @since 2009-04-30 14:21:43
 */
public class UserRole {

    /**
     * id
     */
    private int id;
    /**
     * 用户pin
     */
    private String pin;


    /**
     * 系统级权限的id为-1
     */
    private int sitemapId;


    /**
     * 角色ID
     */
    private int roleId;


    private Role role;

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
     * 权限ID
     */
    private int privilegeId;

    
    /**
     * 用户名称
     */
    private String name;
    
    /**
     * 站点名称
     */
    private String sitemapname;
    
    
    /**
     * 角色名称
     */
    private String rolename;
    
    /**
     * 权限数据
     */
    private List<Privilege> privileges;
    
    
    /**
     * 多个ID
     */
    private int[] Ids;
    
    /**
     * 多个角色ID
     */
    private int[] roleIds;
    
    
    /**
     * 站点名称
     */
    private String departmentname;
    
    /**
     * 类型
     */
    private int type;


    /**
     * 站点导航条.
     */
    private String sitemaplink;
    
    /**
     * 节点ids.
     */
    private String sitemapids;
    
    
    public String getSitemapids() {
		return sitemapids;
	}

	public void setSitemapids(String sitemapids) {
		this.sitemapids = sitemapids;
	}

	public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	/**
     * @return 用户pin
     */
    public String getPin() {
        return this.pin;
    }

    /**
     * @param _pin 用户pin
     */
    public void setPin(String _pin) {
        this.pin = _pin;
    }


    /**
     * @return 系统级权限的id为-1
     */
    public int getSitemapId() {
        return this.sitemapId;
    }

    /**
     * @param _sitemapId 系统级权限的id为-1
     */
    public void setSitemapId(int _sitemapId) {
        this.sitemapId = _sitemapId;
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
        sb.append("CMS_USER_ROLE{").
                append(",pin=").append(pin).
                append(",sitemapId=").append(sitemapId).
                append(",roleId=").append(roleId).
                append(",creator=").append(creator).
                append(",createdTime=").append(createdTime).
                append(",updator=").append(updator).
                append(",updatedTime=").append(updatedTime).
                append('}');
        return sb.toString();
    }

	public int getPrivilegeId() {
		return privilegeId;
	}

	public void setPrivilegeId(int privilegeId) {
		this.privilegeId = privilegeId;
	}

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

	public String getSitemapname() {
		return sitemapname;
	}

	public void setSitemapname(String sitemapname) {
		this.sitemapname = sitemapname;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public List<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}

	public int[] getIds() {
		return Ids;
	}

	public void setIds(int[] ids) {
		Ids = ids;
	}

	public int[] getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(int[] roleIds) {
		this.roleIds = roleIds;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getSitemaplink() {
		return sitemaplink;
	}

	public void setSitemaplink(String sitemaplink) {
		this.sitemaplink = sitemaplink;
	}
}