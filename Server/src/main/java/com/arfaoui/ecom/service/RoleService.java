package com.arfaoui.ecom.service;

import com.arfaoui.ecom.dao.RoleDao;
import com.arfaoui.ecom.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
