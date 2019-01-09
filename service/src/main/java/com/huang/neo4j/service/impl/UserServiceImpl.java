package com.huang.neo4j.service.impl;

import com.huang.neo4j.dao.UserInterface;
import com.huang.neo4j.model.UserInfo;
import com.huang.neo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
