package com.song;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SongApplication {

    private static final Logger LOG = LoggerFactory.getLogger(SongApplication.class);

    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(SongApplication.class, args);
        Environment env = run.getEnvironment();
        LOG.info("启动成功！！!");
        LOG.info("地址：\thttp://127.0.0.1:{}", env.getProperty("server.port"));

    }
}
