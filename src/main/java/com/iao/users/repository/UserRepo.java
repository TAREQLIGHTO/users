package com.iao.users.repository;

import com.iao.users.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepo extends JpaRepository<User, Integer> {
}
