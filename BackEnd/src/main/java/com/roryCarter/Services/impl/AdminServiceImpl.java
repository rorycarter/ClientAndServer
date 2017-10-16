package com.roryCarter.Services.impl;

import com.roryCarter.Domain.Admin;
import com.roryCarter.Repository.AdminRepository;
import com.roryCarter.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceImpl implements AdminService {



    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin save(Admin entity)
    {
        return adminRepository.save(entity);
    }

    @Override
    public Admin findById(String s)
    {
        return adminRepository.findOne(s);
    }

    @Override
    public Admin update(Admin entity)
    {
        return adminRepository.save(entity);
    }

    @Override
    public void delete(Admin entity)
    {
        adminRepository.delete(entity);
    }
}
