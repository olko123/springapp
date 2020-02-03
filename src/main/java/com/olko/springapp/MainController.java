package com.olko.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    BuildProperties buildProperties;

    @Autowired
    Environment environment;

    @GetMapping("/buildInfo")
    public BuildInfo getBuildInfo() {
        return new BuildInfo(buildProperties.getName(),
                buildProperties.getVersion(),
                buildProperties.getTime().toString(),
                environment.getActiveProfiles());
    }
}
