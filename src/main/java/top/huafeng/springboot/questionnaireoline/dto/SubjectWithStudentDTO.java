package top.huafeng.springboot.questionnaireoline.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.huafeng.springboot.questionnaireoline.entity.Student;
import top.huafeng.springboot.questionnaireoline.entity.Subject;

import java.util.List;

/*
**课程信息 和 该课程所有学生的信息
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubjectWithStudentDTO {
    //学科信息
    private Subject subject;

    //该课程所有学生
    private List<Student> list;

}
