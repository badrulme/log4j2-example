package com.example.demo.package2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    Logger logger = LogManager.getLogger(HiController.class);

    @GetMapping("sayHi")
    public String sayHi() {
        logger.trace("*** trace: HiController.sayHi() - start ***");
        logger.debug("*** debug: HiController.sayHi() - start ***");
        logger.info("*** info: HiController.sayHi() - start ***");
        logger.warn("*** warn: HiController.sayHi() - start ***");
        logger.error("*** error: HiController.sayHi() - start ***");
        logger.fatal("*** fatal: HiController.sayHi() - start ***");
        return "Say Hi!";
    }
}
