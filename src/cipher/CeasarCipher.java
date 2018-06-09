package cipher;

public class CeasarCipher {
	private static int key;
	private static String message;

	public CeasarCipher() {
		key = 0;
		message = "";
	}

	public void run() {
		char[] chArr = message.toCharArray();

		for(int i = 0; i < chArr.length; i++) {
			chArr[i] += key % 26;
		}

		message = String.valueOf(chArr);
	}

	public int getKey() {
		return key;
	}

	public String getMessage() {
		return message;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}