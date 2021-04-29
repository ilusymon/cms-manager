package com.tmg.auth.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tmg.entity.auth.*;

import java.util.Dictionary;
import java.util.List;



/**
 * Created by IntelliJ IDEA.
 * User: garmbrood
 * Time: 2009-5-5 12:13:20
 * Company: 天极传媒集团
 * Descripion:
 */
public interface PrivilegeService {

    
    /**
     * 取得用户权限详细信息
     * @param  pin
     * @return 用户权限的详细信息
     */
    public List<UserPrivilegeView> getUserPrivilegeView(String pin);
    
    /**
     * 取得角色与权限关系信息
     * @param  privilege
     * @return 角色与权限的详细信息
     */
    public List<UserPrivilegeView> getRolePrivilegeView(Privilege privilege);
    
    /**
     * 取得用户权限详细信息
     * @param  pin
     * @return 用户权限的详细信息
     */
    public List<UserPrivilegeView> loadUserPrivilegeView(UserPrivilegeView userprivilegeview);
    /**
     * 取得权限详细信息
     * @param id
     * @return 权限的详细信息, 不存在权限时，返回 null
     */
    public Privilege getPrivilegeByid(int id);
    
    /**
     * 插入权限信息
     * @param Privilege privilege对象
     * @return 返回自增长主健
     */
    public int insert(Privilege privilege);
    

    /**
     * 删除权限信息
     * @param Privilege privilege对象
     * @return 返回 true 或者 false
     */
    public boolean delete(Privilege privilege);
    
    /**
     * 更新权限信息
     * @param Privilege privilege对象
     * @return 返回 true 或者 false
     */
    public boolean update(Privilege privilege);
    
    /**
     * 通过权限ID取得该权限下角色信息.
     * @param PrivilegeId
     * @return 返回角色信息
     */
    public List<Role> getRoleByPrivilegeId(Role role);
    
    /**
     * 通过权限ID取得该权限下用户角色信息.
     * @param PrivilegeId
     * @return 返回用户角色信息
     */
    public List<UserRole> getUserRole(UserRole userrole);
    
    /**
     * 通过权限ID取得该权限下角色信息.
     * @param Role role对象
     * @return 返回角色信息
     */
    public List<Privilege> load(Privilege privilege);
    
    /**
     * 通过权限ID取得该权限下角色信息.
     * @param Role role对象
     * @return 返回角色信息
     */
    public List<Role> loadRold(Role role);
    
    /**
     * 单独的树 返回角色树
     */
    public List getSitemapTree();
    
    /**
     * 单独的树 返回角色树,合并站点表与角色表的数据.
     */
    public List getRoleTree();
    
    /**
     * 查询角色权限表中的记录
     * @param RolePrivilege roleprivilege对象
     * @return 返回总数
     */   
	public int countRole(RolePrivilege roleprivilege) ;
    /**
     * 插入角色权限信息,操作表:cms_role_privilege
     * @param RolePrivilege roleprivilege对象
     * @return 返回自增长主健
     */
    public int insertRole(RolePrivilege roleprivilege);
    
    /**
     * 删除角色权限信息
     * @param RolePrivilege roleprivilege对象
     * @return 返回 true 或者 false
     */
    public boolean deleteRole(RolePrivilege roleprivilege);
    
    /**
     * 通过权限ID取得该权限下角色信息.
     * @param RolePrivilege roleprivilege对象
     * @return 返回角色信息
     */
    public List<RolePrivilege> getRolePrivilege(RolePrivilege roleprivilege);
    
    /**
     * 插入角色分类信息,操作表:cms_dictionary
     * @param Dictionary dictionary对象
     * @return 返回自增长主健
     */
    public int insertRoleCategory(Dictionary dictionary);
    
    /**
     * 删除角色分类信息
     * @param Dictionary dictionary对象
     * @return 返回 true 或者 false
     */
    public boolean delRoleCategory(Dictionary dictionary);
    
    /**
     * 合计角色分类数据
     * @param Privilege privilege对象
     * @return 返回合计数据
     */
    public int countRoleCategory(Dictionary dictionary);
    
    /**
     * 取得用户权限下对应的唯一节点,去除重复的节点
     * @param  pin
     * @return 节点信息
     */
    public List<UserPrivilegeView> getUserSitemapIdView(String pin);

    IPage<Privilege> query(Privilege privilege);
}
