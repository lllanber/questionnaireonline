package top.huafeng.springboot.questionnaireoline;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.huafeng.springboot.questionnaireoline.Utils.*;

import java.util.UUID;

@SpringBootTest
class QuestionnaireolineApplicationTests {
    @Test
    void contextLoads() {
        String uuid = UUID.randomUUID().toString();
        System.out.println("uuid = " + uuid);
    }

}
