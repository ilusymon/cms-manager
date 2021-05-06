package com.tmg.model.auth;

import java.util.Date;
import java.util.List;

/**
 * ����Ϊ�Զ�����
 *
 * @author garmbrood
 * @version 1.0
 * @Company �켫��ý����
 * @Descripion �û���ɫ������(cms_user_role)
 * @since 2009-04-30 14:21:43
 */
public class UserRole {

    /**
     * id
     */
    private int id;
    /**
     * �û�pin
     */
    private String pin;


    /**
     * ϵͳ��Ȩ�޵�idΪ-1
     */
    private int sitemapId;


    /**
     * ��ɫID
     */
    private int roleId;


    private Role role;

    /**
     * ������
     */
    private String creator;


    /**
     * ��������
     */
    private Date createdTime;


    /**
     * ������
     */
    private String updator;


    /**
     * ��������
     */
    private Date updatedTime;

    /**
     * Ȩ��ID
     */
    private int privilegeId;

    
    /**
     * �û�����
     */
    private String name;
    
    /**
     * վ������
     */
    private String sitemapname;
    
    
    /**
     * ��ɫ����
     */
    private String rolename;
    
    /**
     * Ȩ������
     */
    private List<Privilege> privileges;
    
    
    /**
     * ���ID
     */
    private int[] Ids;
    
    /**
     * �����ɫID
     */
    private int[] roleIds;
    
    
    /**
     * վ������
     */
    private String departmentname;
    
    /**
     * ����
     */
    private int type;


    /**
     * վ�㵼����.
     */
    private String sitemaplink;
    
    /**
     * �ڵ�ids.
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
     * @return �û�pin
     */
    public String getPin() {
        return this.pin;
    }

    /**
     * @param _pin �û�pin
     */
    public void setPin(String _pin) {
        this.pin = _pin;
    }


    /**
     * @return ϵͳ��Ȩ�޵�idΪ-1
     */
    public int getSitemapId() {
        return this.sitemapId;
    }

    /**
     * @param _sitemapId ϵͳ��Ȩ�޵�idΪ-1
     */
    public void setSitemapId(int _sitemapId) {
        this.sitemapId = _sitemapId;
    }


    /**
     * @return ��ɫID
     */
    public int getRoleId() {
        return this.roleId;
    }

    /**
     * @param _roleId ��ɫID
     */
    public void setRoleId(int _roleId) {
        this.roleId = _roleId;
    }


    /**
     * @return ������
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @param _creator ������
     */
    public void setCreator(String _creator) {
        this.creator = _creator;
    }


    /**
     * @return ��������
     */
    public Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @param _createdTime ��������
     */
    public void setCreatedTime(Date _createdTime) {
        this.createdTime = _createdTime;
    }


    /**
     * @return ������
     */
    public String getUpdator() {
        return this.updator;
    }

    /**
     * @param _updator ������
     */
    public void setUpdator(String _updator) {
        this.updator = _updator;
    }


    /**
     * @return ��������
     */
    public Date getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * @param _updatedTime ��������
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