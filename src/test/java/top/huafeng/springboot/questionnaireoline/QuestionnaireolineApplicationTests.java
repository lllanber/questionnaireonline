package top.huafeng.springboot.questionnaireoline;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.huafeng.springboot.questionnaireoline.Utils.*;
@SpringBootTest
class QuestionnaireolineApplicationTests {
    @Test
    void contextLoads() {
        String str = "123";
        System.out.println("Md5_Utils.getMD5Value(str) = " + Md5_Utils.getMD5Value(str));
    }

}
