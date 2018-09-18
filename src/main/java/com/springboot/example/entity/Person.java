package com.springboot.example.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by shiyanfei on 2018-09-18
 */
@PropertySource(value = "classpath:common/application-dev.properties")
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {

    //    @Value("${person.name}")
    @Email(message = "邮箱格式错误")
    private String email;

    private String name;

    private Integer age;

    private Date birthday;

    private Map<String,Object> map;

    private List<String> books;

    private Friends friends;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public Friends getFriends() {
        return friends;
    }

    public void setFriends(Friends friends) {
        this.friends = friends;
    }


    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", map=" + map +
                ", books=" + books +
                ", friends=" + friends +
                '}';
    }
}
