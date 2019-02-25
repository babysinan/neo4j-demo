package com.huang.neo4j.service;

import com.huang.neo4j.model.UserInfo;

import java.util.List;

/**
 * @author timkobe
 */
public interface UserService {
    List<UserInfo> findAllUser();
    UserInfo findUser(Long id);

    UserInfo addUser();

    List<UserInfo> getUserInfoRelationship();
}
