package com.codegym.cms.repository;

import com.codegym.cms.model.User;

public interface UserRepository extends Repository<User>{
    public User findByName(String name);
}
