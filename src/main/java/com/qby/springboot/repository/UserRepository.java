package com.qby.springboot.repository;

import com.qby.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// 继承 JpaRepository 来完成对数据库的操作
public interface UserRepository extends JpaRepository<User, Integer> {
}
