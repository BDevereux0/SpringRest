package com.example.springrest.clientInputREST;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class ClientInputController {
    Logger logger = Logger.getLogger(ClientInputController.class.getName());

    @PostMapping("/rbt")
    public String toLowerCase(@RequestBody RequestData requestData){

        Person p = requestData.getPerson();
        var text = requestData.getSomeData();

        logger.info("person: " + p.getName());

        return text.toLowerCase();
    }
}
