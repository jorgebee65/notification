package com.mr.msj.web.controller;

import com.mr.msj.domain.dto.EmailMessageDTO;
import com.mr.msj.domain.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private EmailService srvEmail;

    @PostMapping("/notifications")
    public ResponseEntity<String> sendEmail(@RequestBody EmailMessageDTO email){
        srvEmail.sendNotification(email);
        return new ResponseEntity<String>("OK", HttpStatus.OK);
    }

}
