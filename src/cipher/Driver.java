package cipher;

import java.util.Scanner;

public class Driver {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		CeasarCipher cc = new CeasarCipher();
		int key = 0;
		String message = "";

		System.out.print("Enter cipher key >>  ");
		key = in.nextInt();
		in.nextLine();

		System.out.print("Enter your message >>  ");
		message = in.nextLine();

		cc.setKey(key);
		cc.setMessage(message);
		cc.run();
		message = cc.getMessage();

		System.out.println("\nOutput >>  " + message + "\n");
	}

}