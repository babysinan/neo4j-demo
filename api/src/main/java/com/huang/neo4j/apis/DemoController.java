package com.huang.neo4j.apis;

import com.huang.neo4j.model.UserInfo;
import com.huang.neo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huang
 * @discription
 * @date 13:56 2019/1/4
 */
@RestController
@RequestMapping("/neo4j")
public class DemoController {
    @Autowired
    private  UserService userService;
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String neo4j() {
        return "neo4j";
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<UserInfo> findAllUser() {
        return userService.findAllUser();
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    public UserInfo findUser(@PathVariable("id") Integer id) {
        UserInfo user = userService.findUser(id.longValue());
        return user;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public UserInfo addUser() {
        return userService.addUser();
    }

    @RequestMapping(value = "/relations",method = RequestMethod.GET)
    public List<UserInfo> findUserRelation() {
        return userService.getUserInfoRelationship();
    }
}
