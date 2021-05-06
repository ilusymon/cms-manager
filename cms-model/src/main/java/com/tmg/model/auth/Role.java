package com.tmg.model.auth;


import com.tmg.model.annotation.Original;

import java.util.Date;

/**
 * 该类为自动生成
 *
 * @author garmbrood
 * @version 1.0
 * @Company 天极传媒集团
 * @Descripion 角色表(cms_role)
 * @since 2009-04-30 14:21:43
 */
public class Role {


    /**
     * id
     */
    @Original
    private int id;


    /**
     * 角色名称
     */
    private String name;


    /**
     * 站点ID
     */
    @Original
    private int siteId;


    /**
     * 1 系统级权限 2 站点级权限 3 节点级权限
     */
    @Original
    private int type;


    /**
     * 1 启用 2 停用
     */
    @Original
    private int status;


    /**
     * 描述
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
     * 权限ID
     */
    @Original
    private int privilegeId;

    /**
     * 用户有用的权限id
     */
    @Original
    private int sitemapId;

    /**
     * 站点名称
     */
    private String sitemapname;
    
    /**
     * 多个id
     */
    @Original
    private int[] ids;
    
    /**
     * 类型名称
     */
    private String typename;
    
	/**
	 * 把多个siteid拼为字符串
	 */
	private String strSiteIds;

    /**
     * 结果
     */
    @Original
    private int result;
    
	/**
	 * 把多个分类值拼为字符串,从此cms_dictionary表中取数据.
	 */
	private String strCategoryValues;
	
    /**
     * 多个角色ids
     */
    @Original
    private int[] privilegeids;
    
    /**
     *   是否拥有权限,当该参数大于零时,默认用户只有添加节点的权限
     */
    @Original
    private int istype;
    
    
	/**
	 * 把多个role类型type拼为字符串
	 */
	private String strTypeIds;
	
    /**
     * 权限查询项
     */
    private String searchString;
    
    private String searchLevelCodes;

    public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
    
    public String getStrTypeIds() {
		return strTypeIds;
	}

	public void setStrTypeIds(String strTypeIds) {
		this.strTypeIds = strTypeIds;
	}

	public int getResult() {
		return result;
	}

	public int getIstype() {
		return istype;
	}

	public void setIstype(int istype) {
		this.istype = istype;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getStrSiteIds() {
		return strSiteIds;
	}

	public void setStrSiteIds(String strSiteIds) {
		this.strSiteIds = strSiteIds;
	}

	public String getSitemapname() {
		return sitemapname;
	}

	public void setSitemapname(String sitemapname) {
		this.sitemapname = sitemapname;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public int[] getIds() {
		return ids;
	}

	public void setIds(int[] ids) {
		this.ids = ids;
	}

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
     * @return 角色名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param _name 角色名称
     */
    public void setName(String _name) {
        this.name = _name;
    }


    /**
     * @return 站点ID
     */
    public int getSiteId() {
        return this.siteId;
    }

    /**
     * @param _siteId 站点ID
     */
    public void setSiteId(int _siteId) {
        this.siteId = _siteId;
    }


    /**
     * @return 1 系统级权限 2 站点级权限 3 节点级权限
     */
    public int getType() {
        return this.type;
    }

    /**
     * @param _type 1 系统级权限 2 站点级权限 3 节点级权限
     */
    public void setType(int _type) {
        this.type = _type;
    }


    /**
     * @return 1 启用 2 停用
     */
    public int getStatus() {
        return this.status;
    }

    /**
     * @param _status 1 启用 2 停用
     */
    public void setStatus(int _status) {
        this.status = _status;
    }


    /**
     * @return 描述
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param _description 描述
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
        sb.append("CMS_ROLE{").
                append(",id=").append(id).
                append(",name=").append(name).
                append(",siteId=").append(siteId).
                append(",type=").append(type).
                append(",status=").append(status).
                append(",description=").append(description).
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

	public String getStrCategoryValues() {
		return strCategoryValues;
	}

	public void setStrCategoryValues(String strCategoryValues) {
		this.strCategoryValues = strCategoryValues;
	}

	public int[] getPrivilegeids() {
		return privilegeids;
	}

	public void setPrivilegeids(int[] privilegeids) {
		this.privilegeids = privilegeids;
	}

    public String getSearchLevelCodes() {
        return searchLevelCodes;
    }

    public void setSearchLevelCodes(String searchLevelCodes) {
        this.searchLevelCodes = searchLevelCodes;
    }
}