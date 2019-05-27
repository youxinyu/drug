package com.guigu.drug.tanlong.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Configuration
@EnableScheduling
public class Dateutil {


    private static final Logger logger = Logger.getLogger(Dateutil.class.getName());

    @Scheduled(cron = "0 11 14 * * ?")
    public void date(){
        System.out.println("谭龙比吴自然帅");
    }

}
