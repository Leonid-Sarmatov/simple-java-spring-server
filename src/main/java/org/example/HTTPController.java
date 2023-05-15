package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Класс REST-контроллера,
 * который возвращает объект сообщения при запросе на
 * http://localhost:8080/greenhouseOperationParameters
 */
@RestController
public class HTTPController {
    @GetMapping("/greenhouseOperationParameters")
    public ParameterMessage getParameterMessage() {
        ParameterMessage parameterMessage =
                new ParameterMessage("12%", "26*C", "52,34", "34%");
        return parameterMessage;
    }
}
