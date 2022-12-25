package ru.students.test_rest_service1.service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.students.test_rest_service1.model.Response;

@Service
@RequiredArgsConstructor
@Qualifier("ModifyErrorMessage")
public class ModifyErrorMessage implements MyModifyService
{
    @Override
    public Response modify(Response response)
    {
        response.setErrorMessage("Что-то сломалось");
        return response;
    }
}
