package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static com.example.demo.JsonResult.jsonResultSuccess;

@RestController
public class TestController {

    @RequestMapping("")
    JsonResult test() {
        List<User> users = new ArrayList<>();

        User u1 = new User();
        u1.setId("1");
        u1.setName("ZhangSan");
        users.add(u1);

        User u2 = new User();
        u2.setId("2");
        users.add(u2);

        return jsonResultSuccess("Success", users);
    }

}
