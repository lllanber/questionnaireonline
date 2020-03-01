package top.huafeng.springboot.questionnaireoline.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginDTO {
    private String account;
    private String password;
}
