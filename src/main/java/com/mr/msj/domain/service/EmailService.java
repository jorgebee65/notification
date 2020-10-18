package com.mr.msj.domain.service;

import com.mr.msj.domain.dto.EmailMessageDTO;
import org.springframework.mail.MailException;

public interface EmailService {

    void sendNotification(EmailMessageDTO message) throws MailException;

}
