package com.huang.neo4j.service.impl;

import com.huang.neo4j.dao.UserInterface;
import com.huang.neo4j.model.UserInfo;
import com.huang.neo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.repository.support.SimpleNeo4jRepository;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author timkobe
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInterface userInterface;

    @Override
    public List<UserInfo> findAllUser() {
        return userInterface.getUserNodeList();
    }

    @Override
    public UserInfo findUser(Long id) {
        Optional<UserInfo> byId = userInterface.findById(id, 0);
        return byId.get();
    }

    @Override
    public UserInfo addUser() {
        UserInfo user = new UserInfo();
//        user.setId(12l);
        user.setName("这是名称");
        userInterface.save(user);
        return user;
    }

    @Override
    public List<UserInfo> getUserInfoRelationship() {
        List<UserInfo> relationship = userInterface.getUserInfoRelationship();
        return relationship;
    }
}
