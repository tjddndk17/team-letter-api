package com.team.letter.controller.common;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CommonController {

    @Value("${version}")
    private String version;

    @GetMapping("/version")
    public String version() throws Exception {
        log.info("log info");
        log.debug("log debug");

        return version;
    }
}
