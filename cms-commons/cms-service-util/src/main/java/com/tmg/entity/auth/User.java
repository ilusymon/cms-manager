package com.tmg.entity.auth;


import com.tmg.annotation.Original;

import java.util.Arrays;
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
public class User {

    public static final int ZHUBIAN_PERMISSION=1;//主编权限
    public static final int ZONGJIAN_PERMISSION=2;//总监权限
    public static final int CHANGSHANGGAO_PERMISSION=3;//厂商稿权限


    /**
     * id
     */
    @Original
    private int id;

    /**
     * 笔名
     */
    private String pin;

    /**
     * 用户名称
     */
    private String username;


    /**
     * 性别
     */
	@Original
    private int sex;


    /**
     * 笔名
     */
    private String penname;



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
     * 部门ID
     */
	@Original
    private int departmentId;


	/**
	 * 岗位ID
	 */
	@Original
	private int positionId;

	/**
	 * 岗位ID
	 */
	private String positionName;


    /**
     * 部门名称
     */
    private String departmentname;


    /**
     * 地区
     */
    private String area;

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
	 * 状态
	 */
	@Original
	private int state;

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
     * 父id
     */
	@Original
    private int fatherId;

    /**
     * 子叶分枝
     */
    private String leaf_branch;


    /**
     * 角色ID
     */
	@Original
    private int roleId;

    /**
     * 多个pins
     */
    private String[] pins;

    /**
     * 系统级权限的id为-1
     */
	@Original
    private int sitemapId;

	/**
	 * 把多个部门值拼为字符串.
	 */
	private String strDepartmentValues;

    /**
     * 视图中的权限ID
     */
	@Original
    private int privilegeId;

    /**
     * 权限查询项
     */
    private String searchString;

    /**
     * 站点ID
     */
	@Original
    private int siteId;

    /**
     * 频道ID
     */
	@Original
    private int channelId;


    /**
     * 主节点名称
     */
    private String sitemapname;

    /**
     * 密码
     */
    private String passWord;


    /**
     * 新密码
     */
    private String newPassword;


    /**
     * 站点名称
     */
    private String sitename;

    /**
     * 频道名称
     */
    private String channelname;

    private String jobduties;
	@Original
    private int permission;//审稿的权限 1主编权限  2总监权限  3厂商稿权限  0无权限

    private String scoreboard;

    private String editorboard;

	private String email;

	private String phone;

	private String handset;

	private String weibo;

	private String address;

	private String headUrl;

	private String signature;

	private Integer pwdReset;

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public String getJobduties() {
        return jobduties;
    }

    public void setJobduties(String jobduties) {
        this.jobduties = jobduties;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getChannelname() {
		return channelname;
	}

	public void setChannelname(String channelname) {
		this.channelname = channelname;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getSitemapname() {
		return sitemapname;
	}

	public void setSitemapname(String sitemapname) {
		this.sitemapname = sitemapname;
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public int getSitemapId() {
		return sitemapId;
	}

	public void setSitemapId(int sitemapId) {
		this.sitemapId = sitemapId;
	}

	public String[] getPins() {
		return pins;
	}

	public void setPins(String[] pins) {
		this.pins = pins;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getLeaf_branch() {
		return leaf_branch;
	}

	public void setLeaf_branch(String leaf_branch) {
		this.leaf_branch = leaf_branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getPenname() {
		return penname;
	}

	public void setPenname(String penname) {
		this.penname = penname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getUpdator() {
		return updator;
	}

	public void setUpdator(String updator) {
		this.updator = updator;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
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

	public String getStrSiteIds() {
		return strSiteIds;
	}

	public void setStrSiteIds(String strSiteIds) {
		this.strSiteIds = strSiteIds;
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

	public int[] getPrivilegeids() {
		return privilegeids;
	}

	public void setPrivilegeids(int[] privilegeids) {
		this.privilegeids = privilegeids;
	}

	public int getFatherId() {
		return fatherId;
	}

	public void setFatherId(int fatherId) {
		this.fatherId = fatherId;
	}

	public String getStrDepartmentValues() {
		return strDepartmentValues;
	}

	public void setStrDepartmentValues(String strDepartmentValues) {
		this.strDepartmentValues = strDepartmentValues;
	}

	public int getPrivilegeId() {
		return privilegeId;
	}

	public void setPrivilegeId(int privilegeId) {
		this.privilegeId = privilegeId;
	}

	public int getSiteId() {
		return siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

    public String getScoreboard() {
        return scoreboard;
    }

    public void setScoreboard(String scoreboard) {
        this.scoreboard = scoreboard;
    }

    public String getEditorboard() {
        return editorboard;
    }

    public void setEditorboard(String editorboard) {
        this.editorboard = editorboard;
    }

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHandset() {
		return handset;
	}

	public void setHandset(String handset) {
		this.handset = handset;
	}

	public String getWeibo() {
		return weibo;
	}

	public void setWeibo(String weibo) {
		this.weibo = weibo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Integer getPwdReset() {
		return pwdReset;
	}

	public void setPwdReset(Integer pwdReset) {
		this.pwdReset = pwdReset;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", pin='" + pin + '\'' +
				", username='" + username + '\'' +
				", sex=" + sex +
				", penname='" + penname + '\'' +
				", description='" + description + '\'' +
				", creator='" + creator + '\'' +
				", createdTime=" + createdTime +
				", updator='" + updator + '\'' +
				", updatedTime=" + updatedTime +
				", departmentId=" + departmentId +
				", positionId=" + positionId +
				", positionName='" + positionName + '\'' +
				", departmentname='" + departmentname + '\'' +
				", area='" + area + '\'' +
				", ids=" + Arrays.toString(ids) +
				", typename='" + typename + '\'' +
				", strSiteIds='" + strSiteIds + '\'' +
				", result=" + result +
				", state=" + state +
				", strCategoryValues='" + strCategoryValues + '\'' +
				", privilegeids=" + Arrays.toString(privilegeids) +
				", fatherId=" + fatherId +
				", leaf_branch='" + leaf_branch + '\'' +
				", roleId=" + roleId +
				", pins=" + Arrays.toString(pins) +
				", sitemapId=" + sitemapId +
				", strDepartmentValues='" + strDepartmentValues + '\'' +
				", privilegeId=" + privilegeId +
				", searchString='" + searchString + '\'' +
				", siteId=" + siteId +
				", channelId=" + channelId +
				", sitemapname='" + sitemapname + '\'' +
				", passWord='" + passWord + '\'' +
				", newPassword='" + newPassword + '\'' +
				", sitename='" + sitename + '\'' +
				", channelname='" + channelname + '\'' +
				", jobduties='" + jobduties + '\'' +
				", permission=" + permission +
				", scoreboard='" + scoreboard + '\'' +
				", editorboard='" + editorboard + '\'' +
				", email='" + email + '\'' +
				", phone='" + phone + '\'' +
				", handset='" + handset + '\'' +
				", weibo='" + weibo + '\'' +
				", address='" + address + '\'' +
				", headUrl='" + headUrl + '\'' +
				", signature='" + signature + '\'' +
				", pwdReset=" + pwdReset +
				'}';
	}

}