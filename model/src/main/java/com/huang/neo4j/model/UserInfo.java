package com.huang.neo4j.model;

import org.neo4j.ogm.annotation.NodeEntity;
/**
 * @author timkobe
 */
@NodeEntity
public class UserInfo {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
