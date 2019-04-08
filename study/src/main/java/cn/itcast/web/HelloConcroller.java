package cn.itcast.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloConcroller {
    @Autowired
    private DataSource dataSource;
    @GetMapping("hello.do")
    public  String hello(){
        System.out.println("hello is running");
        return "hello spring boot";
    }
}
