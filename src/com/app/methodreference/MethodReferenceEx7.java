package com.app.methodreference;
interface Messageable{
	Message getMessage(String msg);
}
class Message{
	public Message(String msg) {
		System.out.println(msg);
	}
}
public class MethodReferenceEx7 {

	public static void main(String[] args) {
		Messageable messageable = Message::new;
		messageable.getMessage("sovan singh");
	}
}
