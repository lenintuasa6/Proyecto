package com.chat.repository;

import java.util.List;

import com.chat.dominio.Message;
import com.chat.dominio.User;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MessageRepository {



	private final ObservableList<Message> messages;
	
	public MessageRepository() {
		messages = FXCollections.observableArrayList();
		UserRepository userRepository = new UserRepository();
		User cesar = userRepository.getUserByUserName("cesar");
		User lorena = userRepository.getUserByUserName("lorena");
		User galo = userRepository.getUserByUserName("galo");
		User lenin = userRepository.getUserByUserName("lenin");
		User madelein = userRepository.getUserByUserName("madelein");
		User jorge = userRepository.getUserByUserName("jorge");
		User melany = userRepository.getUserByUserName("melany");
		User alisson = userRepository.getUserByUserName("alisson");
		User pancho = userRepository.getUserByUserName("pancho");
		User juan = userRepository.getUserByUserName("juan");
		User camila = userRepository.getUserByUserName("camila");
		
		messages.add(new Message(1, cesar, galo, "22/06/2022 10:10 0000", "Hola Galo. Como estas?"));
		messages.add(new Message(2, galo, cesar, "22/06/2022 10:11 0000", "Hola Cesar.. a los anhos"));
		messages.add(new Message(3, cesar, galo, "22/06/2022 10:12 0000", "Necesito que prestes dinero.. tendras??"));
    	messages.add(new Message(4, galo, cesar, "22/06/2022 10:13 0000", "claro!! Cuanto quieres??"));
    	messages.add(new Message(5, cesar, galo, "22/06/2022 10:14 0000", "Una gamba loco?"));
		messages.add(new Message(6, galo, cesar, "22/06/2022 10:15 0000", "Ya loco, tu dime efectivo o transfiero"));
		messages.add(new Message(7, cesar, galo, "22/06/2022 10:16 0000", "Loco mas tarde salgo al voly, podras..??"));
    	messages.add(new Message(8, galo, cesar, "22/06/2022 10:17 0000", "claro!! Por ahi topamos y te doy entonces"));
    	messages.add(new Message(9, cesar, galo, "22/06/2022 10:18 0000", "Gracias mi pana, me salvaste"));
		messages.add(new Message(10, galo, cesar, "22/06/2022 10:19 0000", "Ya sabes, igual tu me has hecho favores"));
		messages.add(new Message(11, cesar, galo, "22/06/2022 10:20 0000", "Pilas nos vemos entonces"));
    	messages.add(new Message(12, galo, cesar, "22/06/2022 10:21 0000", "Topamos, hasta luego"));
    	
    	messages.add(new Message(15, cesar, lorena, "22/06/2022 10:30 0000", "Confirma ya terminaste con tu novio"));
		messages.add(new Message(16, lorena, cesar, "22/06/2022 10:31 0000", "Que te pasa! Lo amo ya te dije"));
		messages.add(new Message(15, cesar, lorena, "22/06/2022 10:30 0000", "Aqui estaremos pendientes"));
		messages.add(new Message(16, lorena, cesar, "22/06/2022 10:31 0000", "Ya superame cesar, no volvere a estar con tigo "));
		
		messages.add(new Message(17, cesar, lenin, "22/06/2022 10:30 0000", "Disculpa, tienes la tarea 3 de estadistica"));
		messages.add(new Message(18, lenin, cesar, "22/06/2022 10:31 0000", "No loco, aun me falta"));
		messages.add(new Message(19, cesar, lenin, "22/06/2022 10:30 0000", "Sera me puedas apoyar explicandome como es de hacer"));
		messages.add(new Message(20, lenin, cesar, "22/06/2022 10:31 0000", "En una media hora "));
		
		messages.add(new Message(21, cesar, madelein, "22/06/2022 10:30 0000", "Hola"));
		messages.add(new Message(22, madelein, cesar, "22/06/2022 10:31 0000", "Hola"));
		messages.add(new Message(23, cesar, madelein, "22/06/2022 10:30 0000", "Como estas ?"));
		messages.add(new Message(24, madelein, cesar, "22/06/2022 10:31 0000", "Bien y tu ? "));
		
		messages.add(new Message(25, cesar, jorge, "22/06/2022 10:30 0000", "Pilas lo que te dije"));
		messages.add(new Message(26, jorge, cesar, "22/06/2022 10:31 0000", "Ya esta "));
		messages.add(new Message(27, cesar, jorge, "22/06/2022 10:30 0000", "Pilas"));
		messages.add(new Message(28, jorge, cesar, "22/06/2022 10:31 0000", "Pilas "));
		
		messages.add(new Message(29, cesar, melany, "22/06/2022 10:30 0000", "Hola"));
		messages.add(new Message(30, melany, cesar, "22/06/2022 10:31 0000", "Tengo Novio no moleste "));
		
		messages.add(new Message(31, cesar, alisson, "22/06/2022 10:30 0000", "Hola"));
		messages.add(new Message(32, alisson, cesar, "22/06/2022 10:31 0000", "Hola"));
		
		messages.add(new Message(33, cesar, pancho, "22/06/2022 10:30 0000", "Mueve a la casa dice mi mami"));
		messages.add(new Message(34, pancho, cesar, "22/06/2022 10:31 0000", "En una hora voy "));
		
		messages.add(new Message(35, cesar, juan, "22/06/2022 10:30 0000", "Pasa tu parte del proyecto"));
		messages.add(new Message(36, juan, cesar, "22/06/2022 10:31 0000", "Me falta"));
		
		messages.add(new Message(37, cesar, camila, "22/06/2022 10:30 0000", "Hola"));
		messages.add(new Message(38, camila, cesar, "22/06/2022 10:31 0000", "Hola"));
		
		//CHATS DE LORENA
		
		messages.add(new Message(39, lorena, galo, "22/06/2022 10:10 0000", "Hola perdido.."));
		messages.add(new Message(40, galo, lorena, "22/06/2022 10:11 0000", "perdido???"));
		messages.add(new Message(41, lorena, galo, "22/06/2022 10:10 0000", "Por que ya no me escribe"));
		messages.add(new Message(42, galo, lorena, "22/06/2022 10:11 0000", "Ya deje de ser bandida"));
		messages.add(new Message(43, lorena, galo, "22/06/2022 10:10 0000", "Ay! galito"));
		messages.add(new Message(44, galo, lorena, "22/06/2022 10:11 0000", "Respete su novio oiga"));
		messages.add(new Message(45, lorena, galo, "22/06/2022 10:10 0000", "Recordemos viejos tiempos"));
		messages.add(new Message(46, galo, lorena, "22/06/2022 10:11 0000", "Respete, yo ya soy de Dios"));
		messages.add(new Message(47, lorena, galo, "22/06/2022 10:10 0000", "No se haga el dificil galo"));
		messages.add(new Message(48, galo, lorena, "22/06/2022 10:11 0000", "Vaya reze lorena"));
		messages.add(new Message(49, lorena, galo, "22/06/2022 10:10 0000", "Mas lo que te haces el loco"));
		messages.add(new Message(50, galo, lorena, "22/06/2022 10:11 0000", "Yo ya no quiero ser el cuerno "));
		messages.add(new Message(52, lorena, galo, "22/06/2022 10:10 0000", "Pero asi es mejor"));
		messages.add(new Message(52, galo, lorena, "22/06/2022 10:11 0000", "Yo sufro lorena"));
		
		messages.add(new Message(53, cesar, lorena, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(54, lorena, cesar, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(55, lorena, lenin, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(56, lenin, lorena, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(57, lorena, melany, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(58, melany, lorena, "22/06/2022 10:11 0000", "ultimo mensaje"));
	
		messages.add(new Message(59, lorena, alisson, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(60, alisson, lorena, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(61, lorena, madelein, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(62, madelein, lorena, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(63, lorena, jorge, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(64, jorge, lorena, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(65, lorena, pancho, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(66, pancho, lorena, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(67, lorena, camila, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(68, camila, lorena, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(69, lorena, juan, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(70, juan, lorena, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		//CHATS DE GALO
		
		messages.add(new Message(71, galo, cesar, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(72, lorena, cesar, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(73, galo, lorena, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(74, lorena, galo, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(75, galo, lenin, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(76, lenin, galo, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(77, galo, melany, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(78, melany, galo, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(79, galo, alisson, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(80, alisson, galo, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(81, galo, madelein, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(82, madelein, galo, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(83, galo, jorge, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(84, jorge, galo, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(85, galo, pancho, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(86, pancho, galo, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(87, galo, camila, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(88, camila, galo, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(89, galo, juan, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(90, juan, galo, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		//CHATS DE LENIN
		
		messages.add(new Message(15, lenin, cesar, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, lorena, lenin, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, lenin, lorena, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, lorena, lenin, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, lenin, galo, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, galo, lenin, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, lenin, melany, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, melany, lenin, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, lenin, alisson, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, alisson, lenin, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, lenin, madelein, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, madelein, lenin, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, lenin, jorge, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, jorge, lenin, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, lenin, pancho, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, pancho, lenin, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, lenin, camila, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, camila, lenin, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, lenin, juan, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, juan, lenin, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		//CHATS MADELEIN
		
		messages.add(new Message(15, madelein, cesar, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, cesar, madelein, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, madelein, galo, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, galo, madelein, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, madelein, lenin, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, lenin, madelein, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, madelein, lorena, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, lorena, madelein, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, madelein, melany, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, melany, madelein, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, madelein, alisson, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, alisson, madelein, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, madelein, jorge, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, jorge, madelein, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, madelein, pancho, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, pancho, madelein, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, madelein, camila, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, camila, madelein, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, madelein, juan, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, juan, madelein, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		//CHATS JORGE
		
		messages.add(new Message(15, jorge, cesar, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, cesar, jorge, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, jorge, galo, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, galo, jorge, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, jorge, lenin, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, lenin, jorge, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, jorge, lorena, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, lorena, jorge, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, jorge, melany, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, melany, jorge, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, jorge, alisson, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, alisson, jorge, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, madelein, jorge, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, jorge, madelein, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, jorge, pancho, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, pancho, jorge, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, jorge, camila, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, camila, jorge, "22/06/2022 10:11 0000", "ultimo mensaje"));
		
		messages.add(new Message(15, jorge, juan, "22/06/2022 10:11 0000", "primer mensaje"));
		messages.add(new Message(16, juan, jorge, "22/06/2022 10:11 0000", "ultimo mensaje"));
}
	
	public ObservableList<Message>  getMessage(String from, String to){
		ObservableList<Message>  result = FXCollections.observableArrayList();
		
		for(Message msg: messages) {
			if((msg.getFrom().getUserName().equals(from) && msg.getTo().getUserName().equals(to))
					|| (msg.getFrom().getUserName().equals(to) && msg.getTo().getUserName().equals(from))) {
				result.add(msg);
			}
		}	
		return result;
	}
	
	public Message getLastMessage(String from, String to) {
		List<Message> list = this.getMessage(from, to);
		
		if(list.size() == 0) return null;
		
		return list.get(list.size() -1);
	}	
	
	public ObservableList<Message> getMessages() {
		//System.out.println(messages.get(messages.size()-1));
		return messages;
	}

	public void setMessage(Message messages) {
		this.messages.add(messages);
	}
}

