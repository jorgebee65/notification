package com.mr.msj.domain.service.impl;

import com.mr.msj.domain.dto.EmailMessageDTO;
import com.mr.msj.domain.service.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);


    @Override
    public void sendNotification(EmailMessageDTO message) throws MailException {
        logger.debug("Sending email... to {}",message);
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(message.getMsjTo());
        mail.setFrom(message.getMsjFrom());
        mail.setSubject(message.getSubject());
        mail.setText(message.getBody());
        javaMailSender.send(mail);
    }
}
