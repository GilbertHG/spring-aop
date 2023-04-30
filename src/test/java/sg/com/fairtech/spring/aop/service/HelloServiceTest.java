package sg.com.fairtech.spring.aop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    void helloService() {
        Assertions.assertEquals("Hello Nami", helloService.hello("Nami"));
        Assertions.assertEquals("Hello Nami Nami", helloService.hello("Nami", "Nami"));
        Assertions.assertEquals("Bye Nami", helloService.bye("Nami"));

        helloService.test();
    }
}
