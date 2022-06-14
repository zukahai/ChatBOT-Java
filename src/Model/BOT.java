package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BOT {
	ArrayList<Intents> intents = new ArrayList<>();
	public BOT() {
		Intents in;
		
		in = new Intents();
		in.setTag("Game");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Chơi lại");
                add("chơi game");
                add("Trò chơi");
                add("game mới");
                add("Trò chơi mới");
                add("Tiktactoe");
            }
        });
		in.setResponses(new ArrayList<String>() {
            {
                add("Đã bắt đầu trò chơi TikTacToe.");
                add("Hãy chơi cùng tôi nào");
                add("Đến lượt của bạn đó");
                add("Hãy chơi cùng tôi, khó thắng lắm đó nha");
            }
        });
		intents.add(in);
		
//		-----------------------------------------------
		
		in = new Intents();
		in.setTag("SayHi");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Chào");
                add("Xin chào");
                add("Chào bạn");
                add("Hi");
                add("Hello");
                add("Chào cậu");
                add("Ơi");
            }
        });
		in.setResponses(new ArrayList<String>() {
            {
                add("Xin chào, rất vui được gặp bạn.");
                add("Chào bạn, bạn cần mình giúp gì.");
                add("Chào cậu, cậu có muốn chơi một trò chơi không.");
            }
        });
		intents.add(in);
		
//		-----------------------------------------------	
		
		in = new Intents();
		in.setTag("Hoa");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Game hoa");
            }
        });
		in.setResponses(new ArrayList<String>() {
            {
                add("Nước đi hay đấy!");
                add("May cho bạn đấy nha!");
                add("Rất chi là căng thẳng");
                add("Thế này chắc hoà mấy thôi");
            }
        });
		intents.add(in);
		
		in = new Intents();
		in.setTag("win");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Game win");
            }
        });
		in.setResponses(new ArrayList<String>() {
            {
                add("Sai lầm rồi nha, hehe.");
                add("Kiểu gì bạn cũng thua thôi");
                add("Mình sắp thắng rồi nhé");
            }
        });
		intents.add(in);
		
//		-----------------------------------------------	
		
		in = new Intents();
		in.setTag("SayBye");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Tạm Biệt");
                add("Bye");
                add("Goodbye");
                add("Hẹn gặp lại");
                add("Gặp lại sau");
                add("Pp");
                add("Bai");
            }
        });
		in.setResponses(new ArrayList<String>() {
            {
                add("Goodbye");
                add("Tạm biệt, hẹn gặp bạn lần sau");
                add("Bye bye, see you again");
                add("Bye, see you later");
            }
        });
		intents.add(in);
	}
	
	public int getIntents(String text) {
		for (int i = 0; i < intents.size(); i++) {
			Intents temp = intents.get(i);
			if (temp.check(text))
				return i;
		}
		return -1;
	}
	
	public String solveMessage(String message) {
		int index = getIntents(message);
		if (index == -1)
			return "Y\u00EAu c\u1EA7u \u0111ang \u0111\u01B0\u1EE3c x\u1EED l\u00FD ";
		
		if (index == 0) {
			return intents.get(0).randomMessage();
		}
		
		return intents.get(index).randomMessage();
		
	}
	
	public static void main(String[] args) {
		BOT bot = new BOT();
		System.out.println(bot.intents.size());
		
	}
}
