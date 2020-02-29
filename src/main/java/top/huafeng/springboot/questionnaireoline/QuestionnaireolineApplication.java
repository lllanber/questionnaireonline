package top.huafeng.springboot.questionnaireoline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("top.huafeng.springboot.questionnaireoline.dao")
@SpringBootApplication
public class QuestionnaireolineApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestionnaireolineApplication.class, args);
    }

}
