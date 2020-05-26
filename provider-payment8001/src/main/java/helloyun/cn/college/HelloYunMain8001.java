package helloyun.cn.college;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author  Gaojunlun
 * @create 2020-5-22 22:09:38
 * */

@SpringBootApplication
@EnableDiscoveryClient
public class HelloYunMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(HelloYunMain8001.class,args);
    }
}
