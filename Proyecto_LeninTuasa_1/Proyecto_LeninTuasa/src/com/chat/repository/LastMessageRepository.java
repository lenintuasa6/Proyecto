package com.chat.repository;

import java.util.ArrayList;
import java.util.List;

import com.chat.dominio.LastMessage;
import com.chat.dominio.Message;
import com.chat.dominio.User;

public class LastMessageRepository {
	
	UserRepository userRepository = new UserRepository();
	MessageRepository messageRepository = new MessageRepository();
	
	public LastMessageRepository() {
//		
//		User cesar = userRepository.getUserByUserName("cesar");
//		User lorena = userRepository.getUserByUserName("lorena");
//		User galo = userRepository.getUserByUserName("galo");
//		
//		
//		
//		conversacions.add(new LastMessage(lorena, new Message()));
//		conversacions.add(new LastMessage(galo, new Message()));
	}

	public List<LastMessage> getConversacions(String user) {
		List<LastMessage> result =new ArrayList<>();
		
		String[] users = new String[] {"cesar", "galo", "lorena"};
		
		
		for(int i=0;i<users.length;i++) {
			
			if(user==users[i])
				continue;
			
			Message last = messageRepository.getLastMessage(users[i], user);
			if(last==null)
				continue;
			
			User userMesaage = userRepository.getUserByUserName(users[i]);
			result.add(new LastMessage(userMesaage, last));
		}
		return result;
	}
	


	public void setConversacions(List<LastMessage> conversacions) {
	}
	
			
	
}
