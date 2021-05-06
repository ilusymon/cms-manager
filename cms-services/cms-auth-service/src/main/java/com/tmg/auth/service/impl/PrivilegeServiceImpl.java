package com.tmg.auth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tmg.auth.mapper.PrivilegeMapper;
import com.tmg.auth.service.PrivilegeService;
import com.tmg.model.auth.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Dictionary;
import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 * @className PrivilegeServiceImpl
 * @description TODO
 * @date 2021/4/29 10:11
 */
@Service
public class PrivilegeServiceImpl implements PrivilegeService {

    @Resource
    private PrivilegeMapper privilegeMapper;

    @Override
    public List<UserPrivilegeView> getUserPrivilegeView(String pin) {
        return null;
    }

    @Override
    public List<UserPrivilegeView> getRolePrivilegeView(Privilege privilege) {
        return null;
    }

    @Override
    public List<UserPrivilegeView> loadUserPrivilegeView(UserPrivilegeView userprivilegeview) {
        return null;
    }

    @Override
    public Privilege getPrivilegeByid(int id) {
        return null;
    }

    @Override
    public int insert(Privilege privilege) {
        return 0;
    }

    @Override
    public boolean delete(Privilege privilege) {
        return false;
    }

    @Override
    public boolean update(Privilege privilege) {
        return false;
    }

    @Override
    public List<Role> getRoleByPrivilegeId(Role role) {
        return null;
    }

    @Override
    public List<UserRole> getUserRole(UserRole userrole) {
        return null;
    }

    @Override
    public List<Privilege> load(Privilege privilege) {
        return null;
    }

    @Override
    public List<Role> loadRold(Role role) {
        return null;
    }

    @Override
    public List getSitemapTree() {
        return null;
    }

    @Override
    public List getRoleTree() {
        return null;
    }

    @Override
    public int countRole(RolePrivilege roleprivilege) {
        return 0;
    }

    @Override
    public int insertRole(RolePrivilege roleprivilege) {
        return 0;
    }

    @Override
    public boolean deleteRole(RolePrivilege roleprivilege) {
        return false;
    }

    @Override
    public List<RolePrivilege> getRolePrivilege(RolePrivilege roleprivilege) {
        return null;
    }

    @Override
    public int insertRoleCategory(Dictionary dictionary) {
        return 0;
    }

    @Override
    public boolean delRoleCategory(Dictionary dictionary) {
        return false;
    }

    @Override
    public int countRoleCategory(Dictionary dictionary) {
        return 0;
    }

    @Override
    public List<UserPrivilegeView> getUserSitemapIdView(String pin) {
        return null;
    }

    @Override
    public IPage<Privilege> query(Privilege privilege) {
        Page<Privilege> page = new Page<>();
        page.setCurrent(1).setSize(100).setTotal(500);
        IPage<Privilege> privilegeIPage = privilegeMapper.selectPage(page, new QueryWrapper<>());
        return privilegeIPage;
    }
}
