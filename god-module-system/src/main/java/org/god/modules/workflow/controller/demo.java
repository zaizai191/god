package org.god.modules.workflow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {

    @RequestMapping("/hello")
    public String test() {
        return "hello";
    }
}
