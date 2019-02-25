package com.huang.neo4j.dao;

import com.huang.neo4j.model.UserInfo;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author timkobe
 */
@Repository
public interface UserInterface extends Neo4jRepository<UserInfo,Long> {
    @Query("MATCH (n:User) RETURN n ")
    List<UserInfo> getUserNodeList();

    @Query("CREATE (n:User{}) RETURN n ")
    void addNode(UserInfo user);

    @Query("match(u:User)-[r:Follow]->(b:User) where u.name = 'huangyun' return u,r,b")
    List<UserInfo> getUserInfoRelationship();
}
