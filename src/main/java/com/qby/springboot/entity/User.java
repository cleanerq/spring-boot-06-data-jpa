package com.qby.springboot.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

// 使用jpa注解配置映射关系
// 告诉jpa这是个实体类 和数据表映射的类
@Entity
// @table 指定和哪个数据表对应 如果省略默认表名就是user
@Table(name = "tbl_user")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class User {

    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键
    private Integer id;

    @Column(name = "last_name", length = 100) // 这是和数据表对应的一个列
    private String lastName;

    @Column // 省略默认列名就是属性名字
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
