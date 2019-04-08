package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyMapperTest {
    @Autowired
    private MyMapper myMapper;
    @Test
    public void queryTest(){
        User user = myMapper.selectByPrimaryKey(1L);
        System.out.println("user =" + user);
    }

}