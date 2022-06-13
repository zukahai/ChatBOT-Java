package Model;

import java.util.ArrayList;
import java.util.Arrays;

public class BOT {
	ArrayList<Intents> intents = new ArrayList<>();
	public BOT() {
		Intents in = new Intents();
		in.addPatterns("Chơi game");
	}
	
	public String solveMessage(String message) {
		return "Y\u00EAu c\u1EA7u \u0111ang \u0111\u01B0\u1EE3c x\u1EED l\u00FD";
	}
	
	public static void main(String[] args) {
		String s = "Xin chào";
		System.out.println("Xin chào".contains("Xin"));
	}
}
