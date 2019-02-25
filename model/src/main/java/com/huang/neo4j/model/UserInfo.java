package com.huang.neo4j.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.neo4j.ogm.annotation.*;

import java.util.List;

/**
 * @author timkobe
 */
@NodeEntity(label = "User")
public class UserInfo {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @JsonIgnoreProperties("start")
    @Relationship(type = "Follow")
    private List<Following> following;

    public List<Following> getFollowing() {
        return following;
    }

    public void setFollowing(List<Following> following) {
        this.following = following;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
