package pertemuan7;

import java.util.Scanner;

public class Login {
	
	Scanner scan = new Scanner(System.in);

	public Login() {
		// code
		String password;
		password = scan.nextLine();
		
		try {
			check(password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		new Login();

	}

	// Exception handling 
	    
	public void check(String password) throws Exception { // function buat custom error sendiri
		if(password.equals("12345")){
			System.out.println("Lanjut");
		}
		else {
			throw new Exception("Password nya salah");
		}
	}
}
