package com.example.demo.package1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    Logger logger = LogManager.getLogger(HelloController.class);

    @GetMapping("sayHello")
    public String sayHello() {
        logger.trace("*** trace: HelloController.sayHello() - start ***");
        logger.debug("*** debug: HelloController.sayHello() - start ***");
        logger.info("*** info: HelloController.sayHello() - start ***");
        logger.warn("*** warn: HelloController.sayHello() - start ***");
        logger.error("*** error: HelloController.sayHello() - start ***");
        logger.fatal("*** fatal: HelloController.sayHello() - start ***");
        return "Say Hello!";
    }
}
