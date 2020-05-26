package hellhoyun.cn.college;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloYunPersonalMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(HelloYunPersonalMain8002.class,args);
    }
}
