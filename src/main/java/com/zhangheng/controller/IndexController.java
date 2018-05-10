package com.zhangheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@Autowired
	private JavaMailSender mailSender;
	@Value("${spring.mail.username}")
	private String emailFrom;

	@RequestMapping("/")
	public String index() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(emailFrom);
		message.setTo(emailFrom);
		message.setSubject("this is a subject");
		message.setText("this is a text");
		mailSender.send(message);
		return "index";
	}
}
