package Model.Obsrver;
//written by ram
//17/2

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {

	private String msg;
	private LocalDateTime sent;

	public Message(String msg) {
		this.msg = msg;
		this.sent = LocalDateTime.now();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setSent(LocalDateTime sent) {
		this.sent = sent;
	}

	public LocalDateTime getSent() {
		return sent;
	}

	public String getTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return sent.format(formatter);
	}

	@Override
	public String toString() {
		return String.format("Date: %s\nMessage: %s\n", sent, msg);
	}

}

