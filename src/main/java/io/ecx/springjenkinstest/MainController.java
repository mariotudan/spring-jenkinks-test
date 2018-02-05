package io.ecx.springjenkinstest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/SpringJenkinsDemo")
public class MainController {

    @RequestMapping
    public RestData getTestData() {
        return new RestData("hello");
    }
}
