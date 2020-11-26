package com.sheng.mpdemo;

import com.sheng.mpdemo.entity.User;
import com.sheng.mpdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MpdemoApplicationTests {

    @Autowired
    UserMapper userMapper;

    // 查询User表中所有数据
    @Test
    void findAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    // 添加操作
    @Test
    void addUser() {
        User user = new User();
        user.setName("cms");
        user.setAge(666);
        user.setEmail("cms@qq.com");
        // 将创建好的对象插入进去
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }



}
