package service;

import dto.Client;

public class ClientService {
	public void setNickName(String newNickName) {
		Client client = new Client();
		
		client.setNickName(newNickName);
	}
}
