package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import service.ClientService;

public class ClientView {
	private ClientService service = null;
	private BufferedReader br = null;
	
	// 기본 생성자
	public ClientView() {
		service = new ClientService();
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public void startView() {
		int inputNum = 0;
	}
	
	public int selectMenu() throws NumberFormatException, IOException {
		System.out.println("[Chatting App]\n");
		System.out.println("1. Start Chat");
		System.out.println("2. Set NickName");
		
		System.out.println();
		
		System.out.print("Input Number that You Want to Choose >> ");
		int input = Integer.parseInt(br.readLine());
		
		System.out.println();
		
		return input;
	}
}
