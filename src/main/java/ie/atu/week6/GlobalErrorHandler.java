package ie.atu.week6;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalErrorHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> showErrors(MethodArgumentNotValidException ex)
    {
        Map<String, String> errorList = new HashMap<>();
        for(FieldError error : ex.getFieldErrors())
        {
            String error_name = error.getField();
            String error_message = error.getDefaultMessage();
            errorList.put(error_name, error_message);
        }
        return ResponseEntity.status(400).body(errorList);
    }
}