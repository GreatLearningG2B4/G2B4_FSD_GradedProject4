package com.gl.EmpManagment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.EmpManagment.repository.RoleRepository;
import com.gl.EmpManagment.repository.UserRepository;
import com.gl.EmpManagment.security.entity.Role;
import com.gl.EmpManagment.security.entity.User;
import com.gl.EmpManagment.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	@Override
	public User save(User user) {
	
		return userRepo.save(user);
	}

	@Override
	public Role save(Role role) {
		return roleRepo.save(role);
	}

}
