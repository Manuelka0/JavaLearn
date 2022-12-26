package ru.students.test_rest_service3.model;
import javax.validation.constraints.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
@Getter
@Data
@Builder
public class Request
{
    @NotBlank
    @Size(max = 32)
    private String uid;
    private String operationUid;
    private String systemName;
    @NotBlank
    private String systemTime;
    private String source;
    private Integer communicationId;
    private Integer templateId;
    @Max(7)
    private Integer productCode;
    @Max(5)
    private Integer smsCode;
}
