package com.huang.neo4j.apis;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huang
 * @discription
 * @date 13:56 2019/1/4
 */
@RestController
@RequestMapping("/neo4j")
public class DemoController {
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String neo4j() {
        return "neo4j";
    }
}
