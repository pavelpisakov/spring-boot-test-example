package com.test.ppisakov.test;

import com.test.ppisakov.test.service.GreetingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationTest.class);

    @Autowired
    @Qualifier("simple")
    private GreetingService service;

    @Test
    public void contextLoads() {
        logger.info("context loaded");
        assertThat(service, is(not(nullValue())));
        logger.info("service: {}", service.greet());
    }
}
