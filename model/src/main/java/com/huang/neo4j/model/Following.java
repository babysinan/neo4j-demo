package com.huang.neo4j.model;

import org.neo4j.ogm.annotation.*;

/**
 * @author timkobe
 */
@RelationshipEntity(type = "Follow")
public class Following {

    @Id
    @GeneratedValue
    private Long id;
    private Integer status;
    private Long time;
    @StartNode
    private UserInfo start;
    @EndNode
    private UserInfo end;
    public Long getId() {
        return id;
    }

    public UserInfo getStart() {
        return start;
    }

    public void setStart(UserInfo start) {
        this.start = start;
    }

    public UserInfo getEnd() {
        return end;
    }

    public void setEnd(UserInfo end) {
        this.end = end;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
