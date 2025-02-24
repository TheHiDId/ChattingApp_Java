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
		try {
			service = new ClientService();
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
		} catch (Exception e) {
			System.err.println("!!An Error Occurred, Quit the Program!!");
			
			e.printStackTrace();
			
			System.exit(0);
		}
	}
	
	public void startView() {
		int inputNum = 0;
		
		do {
			try {
				inputNum = selectMenu();
				
				switch (inputNum) {
				case 1: startChat(); break;
				case 2: setNickName(); break;
				case 0: System.out.println("Quit the Program"); 
								br.close(); 
				break;
				
				default: System.out.println("Input Wrong Number, Try Again!"); break;
				}
				
			} catch (NumberFormatException e) {
				System.err.println("Input Only Number!");
				
				e.printStackTrace();
				
			} catch (IOException e) {
				System.err.println("Input/Output Exception Occurs!");
				
				e.printStackTrace();
				
			} catch (Exception e) {
				System.err.println("Unknown Error Occurs!");
				
				e.printStackTrace();
			}
			
		} while (inputNum != 0);
	}

	public int selectMenu() throws NumberFormatException, IOException {
		System.out.println("[Chatting App]\n");
		System.out.println("1. Start Chat");
		System.out.println("2. Set NickName");
		
		System.out.println("\n0. Exit Chatting App");
		
		System.out.println();
		
		System.out.print("Input Number that You Want to Choose >> ");
		int input = Integer.parseInt(br.readLine());
		
		System.out.println();
		
		return input;
	}
	
	private void startChat() {
		
	}

	private void setNickName() throws IOException {
		System.out.println("[Set NickName]\n");
		
		System.out.print("Input NickName that You Use in Chat >> ");
		String setNickName = br.readLine();
		
		System.out.println("NickName Setting Done!");
	}
}