package com.chat.dominio;

public class Message {
	
	private int id;
	private User from;
	private User to;
	private String date;
	private String content;
	
	
	
	public Message(int idLastStr, User from, User to, String date, String content) {
		super();
		this.id = idLastStr;
		this.from = from;
		this.to = to;
		this.date = date;
		this.content = content;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getFrom() {
		return from;
	}
	public void setFrom(User from) {
		this.from = from;
	}
	public User getTo() {
		return to;
	}
	public void setTo(User to) {
		this.to = to;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String toString() {
		return "Message [id=" + id + ", from=" + from + ", to=" + to + ", date=" + date + ", content=" + content + "]";
	}
	
	

}
