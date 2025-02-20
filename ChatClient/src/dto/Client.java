package dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Client implements Serializable {
	private static final long serialVersionUID = -3997938107439774564L;
	
	private String nickName;
	private String sendMessage;
	private String receiveMessage;
	private LocalDateTime messageTime;
	
	public Client() {}

	public Client(String nickName, String sendMessage, String receiveMessage, LocalDateTime messageTime) {
		super();
		this.nickName = nickName;
		this.sendMessage = sendMessage;
		this.receiveMessage = receiveMessage;
		this.messageTime = messageTime;
	}

	public LocalDateTime getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(LocalDateTime messageTime) {
		this.messageTime = messageTime;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getSendMessage() {
		return sendMessage;
	}

	public void setSendMessage(String sendMessage) {
		this.sendMessage = sendMessage;
	}

	public String getReceiveMessage() {
		return receiveMessage;
	}

	public void setReceiveMessage(String receiveMessage) {
		this.receiveMessage = receiveMessage;
	}

	@Override
	public String toString() {
		return "Client [nickName=" + nickName + ", sendMessage=" + sendMessage + ", receiveMessage=" + receiveMessage
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nickName, receiveMessage, sendMessage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(nickName, other.nickName) && Objects.equals(receiveMessage, other.receiveMessage)
				&& Objects.equals(sendMessage, other.sendMessage);
	}
}
