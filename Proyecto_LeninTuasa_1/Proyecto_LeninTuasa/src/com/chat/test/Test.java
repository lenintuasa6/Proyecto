package com.chat.test;

import java.util.List;

import com.chat.dominio.LastMessage;
import com.chat.repository.LastMessageRepository;

public class Test {

	public static void main(String[] args) {
		
//		UserRepository userRepository = new UserRepository();
//		User login = userRepository.login("galo", "1232");
//		
//		if(login != null) {
//			System.out.println("Bienvenido al chat " + login.getUserName());
//		} else {
//			System.out.println("Usuario o contrasena incorrecta");
//		}
		
		LastMessageRepository lastMessageRepository = new LastMessageRepository();
		List<LastMessage> lastMessages = lastMessageRepository.getConversacions("lorena");
		
		for(LastMessage last:lastMessages) {
			System.out.println(last.getUser().getUserName() + " - " + last.getMessage().getContent());
		}
		
//		MessageRepository messageRepository = new MessageRepository();
//		
//		List<Message> result = messageRepository.getMessage("lorena", "galo");
//		for(Message temp: result) {
//			System.out.println(temp);
//		}

	}

}
