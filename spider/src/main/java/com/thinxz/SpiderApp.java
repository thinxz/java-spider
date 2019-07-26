package com.thinxz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 爬虫启动入口
 *
 * @author thinxz 2019-07-26
 */
@SpringBootApplication
public class SpiderApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext run =
                new SpringApplicationBuilder(SpiderApp.class)
                        .addCommandLineProperties(false)
                        .listeners(new ApplicationPidFileWriter("./app.pid"))
                        .run(args);
    }
}
