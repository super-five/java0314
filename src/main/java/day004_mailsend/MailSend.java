package day004_mailsend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class MailSend {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		JavaMailSenderImpl mailSend = (JavaMailSenderImpl) context.getBean("mailSend");
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom("hk109@126.com");
		msg.setTo("hk109@126.com");
		msg.setSubject("最帅的男人请接收");
		msg.setText("老师你最帅");
		
		mailSend.send(msg);
		System.out.println("ok");
	}

}
