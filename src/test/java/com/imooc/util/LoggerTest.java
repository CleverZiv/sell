package com.imooc.util;

import com.imooc.sell.SellApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @Classname LoggerTest
 * @Date 2019/11/13 1:54
 * @Autor lengzefu
 */
@RunWith(value = SpringRunner.class)
@SpringBootTest(classes = SellApplication.class)
public class LoggerTest {
    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {

        logger.info("=====test=====");

    }

}
