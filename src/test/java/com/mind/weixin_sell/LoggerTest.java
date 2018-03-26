package com.mind.weixin_sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IDEA
 * author:Mind
 * <p>
 * Date:2018/3/23
 * Time:17:36
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {


    @Test
    public void test1(){
        String name ="mind";
        String tel ="123456";

        log.debug("debug.....");
        log.info( "info.......");
        log.error("error.....");
        log.info("name:{}+tel:{}",name,tel);

    }


}
