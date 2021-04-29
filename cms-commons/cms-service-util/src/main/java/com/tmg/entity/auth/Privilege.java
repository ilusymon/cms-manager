package com.tmg.entity.auth;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;
import java.util.List;

/**
 * 该类为自动生成
 *
 * @author garmbrood
 * @version 1.0
 * @Company 天极传媒集团
 * @Descripion 用户权限表 ， 如 编辑 ，删除，修改文章等
 * @since 2009-04-30 14:21:43
 */
@TableName("cms_privilege")
public class Privilege {


    /**
     * 权限ID
     */
    private int id;


    /**
     * 1 系统级权限 2 站点级权限 3 节点级权限
     */
    private int type;


    /**  */
    private int categoryId;


    /**
     * 权限名称
     */
    private String name;


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
     * 类型名称
     */
    @TableField(exist = false)
    private String typename;
    
    
    /**
     * 分类名称
     */
    @TableField(exist = false)
    private String categoryname;
    
    /**
     * 多个ids
     */
    @TableField(exist = false)
    private int[] ids;
    
    /**
     * 多个角色ids
     */
    @TableField(exist = false)
    private int[] roleids;
    
    /**
     * 角色树型数据
     */
    @TableField(exist = false)
    private List<Role> roles;
    
    /**
     * 角色ID
     */
    @TableField(exist = false)
    private int roleId;
    
    /**
     * 结果
     */
    @TableField(exist = false)
    private int result;
    
	/**
	 * 把多个siteid拼为字符串
	 */
    @TableField(exist = false)
	private String strSiteIds;
	
	/**
	 * 把多个分类值拼为字符串,从此cms_dictionary表中取数据.
	 */
    @TableField(exist = false)
	private String strCategoryValues;
	
	/**
	 * 把多个角色值拼为字符串.
	 */
    @TableField(exist = false)
	private String strRoleValues;
	
    /**
     * 站点ID
     */
    @TableField(exist = false)
    private int siteId;
	
    /**
     *   是否拥有权限,当该参数大于零时,默认用户只有添加节点的权限
     */
    @TableField(exist = false)
    private int istype;
	
	/**
	 * 把多个role类型type拼为字符串
	 */
    @TableField(exist = false)
	private String strTypeIds;
	
    /**
     * 权限查询项
     */
    @TableField(exist = false)
    private String searchString;
    
    
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

	public int getIstype() {
		return istype;
	}

	public void setIstype(int istype) {
		this.istype = istype;
	}

	public String getStrSiteIds() {
		return strSiteIds;
	}

	public void setStrSiteIds(String strSiteIds) {
		this.strSiteIds = strSiteIds;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int[] getIds() {
		return ids;
	}

	public void setIds(int[] ids) {
		this.ids = ids;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	/**
     * @return 权限ID
     */
    public int getId() {
        return this.id;
    }

    /**
     * @param _id 权限ID
     */
    public void setId(int _id) {
        this.id = _id;
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
     * @return
     */
    public int getCategoryId() {
        return this.categoryId;
    }

    /**
     * @param _categoryId
     */
    public void setCategoryId(int _categoryId) {
        this.categoryId = _categoryId;
    }


    /**
     * @return 权限名称
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param _name 权限名称
     */
    public void setName(String _name) {
        this.name = _name;
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
        sb.append("CMS_PRIVILEGE{").
                append(",id=").append(id).
                append(",type=").append(type).
                append(",categoryId=").append(categoryId).
                append(",name=").append(name).
                append(",description=").append(description).
                append(",creator=").append(creator).
                append(",createdTime=").append(createdTime).
                append(",updator=").append(updator).
                append(",updatedTime=").append(updatedTime).
                append('}');
        return sb.toString();
    }

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public int[] getRoleids() {
		return roleids;
	}

	public void setRoleids(int[] roleids) {
		this.roleids = roleids;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getStrCategoryValues() {
		return strCategoryValues;
	}

	public void setStrCategoryValues(String strCategoryValues) {
		this.strCategoryValues = strCategoryValues;
	}

	public String getStrRoleValues() {
		return strRoleValues;
	}

	public void setStrRoleValues(String strRoleValues) {
		this.strRoleValues = strRoleValues;
	}

	public int getSiteId() {
		return siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}


}