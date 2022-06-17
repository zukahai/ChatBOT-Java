package Model;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

public class BOT {
	ArrayList<Intents> intents = new ArrayList<>();
	Solve solve = new Solve();
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
                add("Chơi mới");
                add("Tiếp tục chơi");
                add("Chơi lần nữa");
                add("Chơi Tiktactoe");
                add("Ván nữa");
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
		in.setTag("Music");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Hát đi");
                add("Bạn hát đi");
                add("Ca bài đi");
                add("Có thể hát không");
                add("hát được không");
                add("muốn nghe nhạc");
                add("Hát cho");
                add("Muốn nghe hát");
            }
        });
		in.setResponses(new ArrayList<String>() {
            {
                add("Chợt về giữa sương mờ\r\n"
                		+ "Loay hoay anh ngỡ như đang mơ em\r\n"
                		+ "Ngày nào vẫn hoang sơ\r\n"
                		+ "Ai biết cứ mong chờ\r\n"
                		+ "Rồi khi bóng đêm tàn\r\n"
                		+ "Hoang mang giữ lấy giấc mơ đang tan dần\r\n"
                		+ "Khi anh lang thang một mình bơ vơ...");
            }
        });
		intents.add(in);
		
//		-----------------------------------------------
//		-----------------------------------------------
		//2
		in = new Intents();
		in.setTag("BCC");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Bảng cửu chương");
                add("Cửu chương");
            }
        });
		intents.add(in);
		
//		-----------------------------------------------	
		
		//3
		in = new Intents();
		in.setTag("calculate");
		in.setPatterns(new ArrayList<String>() {
            {
                add("=");
                add("+");
                add("-");
                add("*");
                add("/");
                add("^");
                add("()");
            }
        });
		intents.add(in);
		
//		-----------------------------------------------	
		
		//4
		in = new Intents();
		in.setTag("Time");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Mấy giờ");
                add("Mấy giờ rồi");
                add("Thời gian");
                add("Hiện tại là");
                add("Bây giờ là");
            }
        });
		intents.add(in);
		
//		-----------------------------------------------	
		
		//5
		in = new Intents();
		in.setTag("Date");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Ngày mấy nhỉ");
                add("Ngày nhiêu");
                add("Hôm nay ngày mấy");
                add("Ngày mấy");
                add("Ngày nào");
                add("Ngày gì");
                add("Ngày bao nhiêu");
            }
        });
		intents.add(in);
		
//		-----------------------------------------------	
		
		//6
		in = new Intents();
		in.setTag("Date");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Thứ mấy");
                add("Hôm nay thứ mấy");
            }
        });
		intents.add(in);
				
//				-----------------------------------------------
		
		in = new Intents();
		in.setTag("SayHi");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Chào bạn");
                add("Rất gặp bạn");
                add("Xin chào");
                add("Chào bạn");
                add("Hi");
                add("Hello");
                add("Chào cậu");
                add("Cậu ơi");
                add("Chào");
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
		in.setTag("HoiTham");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Hoi tham haizuka_2928324");
            }
        });
		in.setResponses(new ArrayList<String>() {
            {
                add("Bạn ơi, bạn còn đó không.");
                add("Hãy thử nói \"Xin chào\" với tôi nào.");
                add("Bạn ơi, bạn quên mình rồi nè :(");
                add("Nếu không biết làm gì thì mình có thể chơi một trò chơi nè");
                add("Hãy nói gì đó với tôi");
                add("Hình như bạn đã quên mình rồi nè");
                add("Không biết nói gì với mình đúng không nè?");
                add("Tôi có thể hát đó, bạn có muốn nghe tôi hát không?");
                add("À bạn chơi thắng mình được trò chơi TikTacToe đâu nhá, bạn muốn chơi lại hay bỏ cuộc nè ^^");
            }
        });
		intents.add(in);
		
//		-----------------------------------------------	
		
		in = new Intents();
		in.setTag("HoiTham");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Tôi khoẻ");
                add("Mình vẫn khoẻ");
                add("Vẫn khoẻ");
                add("Tôi khoẻ");
                add("Khoẻ");
                add("Mình Ổn");
                add("Tôi bình thường");
                add("Không sao");
            }
        });
		in.setResponses(new ArrayList<String>() {
            {
                add("Như thế thì tốt rồi.");
                add("Tôi rất vui vì điều đó.");
                add("Mong bạn luôn khoẻ mạnh, vui vẻ như thế này.");
                add("Khoẻ là tốt rồi, có muốn chơi game không nào?");
                add("Sức khoẻ là thứ quý nhất, ráng giữ gìn sức khoẻ nha.");
            }
        });
		intents.add(in);
		
//		-----------------------------------------------	
		
		in = new Intents();
		in.setTag("HoiSucKhoe");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Bạn có khoẻ không");
                add("Khoẻ không");
                add("Bạn thế nào");
                add("Bạn ổn không");
                add("ổn không");
            }
        });
		in.setResponses(new ArrayList<String>() {
            {
                add("Cảm ơn bạn đã hỏi thăm, tôi ổn.");
                add("Mình vẫn khoẻ, còn bạn thì sao?");
                add("Mình lúc nào cũng ổn, mình chỉ lo cho sức khoẻ của bạn thôi.");
                add("Vẫn đủ sức để chơi vài trăm ván game đó nha.");
                add("Nhìn kìa, có người quan tâm tôi cơ đấy ^^");
            }
        });
		intents.add(in);
		
//		-----------------------------------------------	
		
		in = new Intents();
		in.setTag("Khen");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Ghê");
                add("Giỏi");
                add("Giỏi quá");
                add("Ghê nhá");
                add("Víp quá");
                add("Hay quá");
                add("Đúng rồi");
                add("Tuyệt vời");
                add("Hay quá");
                add("Quá hay");
            }
        });
		in.setResponses(new ArrayList<String>() {
            {
                add("Bạn quá khen rồi.");
                add("Cảm ơn bạn đã khen");
                add("Chuyện này bình thường mà Hihi ^^");
                add("Rất vui khi được giúp bạn.");
                add("Điều này trong khả năng của tôi mà.");
                add("Rất vui khi đã giúp được bạn.");
            }
        });
		intents.add(in);
		
//		-----------------------------------------------	
		
		in = new Intents();
		in.setTag("Cuoi");
		in.setPatterns(new ArrayList<String>() {
            {
                add("haha");
                add("ha ha");
                add("hahaha");
                add("ha ha ha");
                add(":)");
                add(":))");
                add(":D");
                add("=)");
                add("=))");
                add("kha kha");
                add("Hihi");
                add("Hi hi");
            }
        });
		in.setResponses(new ArrayList<String>() {
            {
                add("Ơ kìa, sao bạn lại cười mình");
                add("Bạn có vẻ vui nhỉ?");
                add("Ha Ha Ha");
                add("Cười người hôm trước, hôm sau người cười đó nha");
                add("Hi Hi ^^");
                add("Bạn cười trông đẹp lắm đó!");
            }
        });
		intents.add(in);
		

//		-----------------------------------------------	
		
		in = new Intents();
		in.setTag("NguoiYeu");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Người yêu");
                add("Người yêu chưa");
                add("có Người yêu");
                add("Yêu ai");
            }
        });
		in.setResponses(new ArrayList<String>() {
            {
                add("Bạn nói người yêu nào? Hehe ^^");
                add("Mình đã làm gì có người yêu, mình đang sợ ế đây nè");
                add("Yêu đương khó quá....");
                add("Yêu ai để không phải khóc?");
            }
        });
		intents.add(in);
		
//		-----------------------------------------------	
		
		in = new Intents();
		in.setTag("Info");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Bạn là ai");
                add("Cậu là ai");
                add("Này là ai");
                add("Ai đó");
                add("Ai vậy");
                add("Tên gì");
            }
        });
		in.setResponses(new ArrayList<String>() {
            {
                add("Xin chào, mình là BOT của Hải, rất vui được gặp bạn.");
                add("Mình là BOT của Hải nè, mình có thể giúp gì cho bạn.");
                add("Mình là BOT được Hải tạo ra để giải quyết một số vấn đề của bạn.");
                add("Mình là ai không quan trọng, quan trọng là mình có thể giúp bạn rất nhiều điều đó.");
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
                add("Thế này chắc hoà mất thôi");
            }
        });
		intents.add(in);
		
//		-----------------------------------------------	
		
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
		in.setTag("end");
		in.setPatterns(new ArrayList<String>() {
            {
                add("Game end");
            }
        });
		in.setResponses(new ArrayList<String>() {
            {
                add("Hoà mất rồi");
                add("Hoà rồi, cũng khá đấy");
                add("Hoà rồi, làm lại ván nữa không?");
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
		int max = -1;
		int index = -1;
		for (int i = 0; i < intents.size(); i++) {
			Intents temp = intents.get(i);
			int length = temp.check(text);
			if (length > max) {
				max = length;
				index  = i;
			}
		}
		return index;
	}
	
	public String solveMessage(String message) {
		int index = getIntents(message);
		if (index == -1)
			return "Y\u00EAu c\u1EA7u \u0111ang \u0111\u01B0\u1EE3c x\u1EED l\u00FD... ";
		
		if (index == 2) {
			intents.get(index).setResponses(solve.BCC(message));
		}
		
		if (index == 3) {
			intents.get(index).setResponses(solve.calculate(message));
		}
		
		if (index == 4) {
			intents.get(index).setResponses(solve.getTime());
		}
		
		if (index == 5) {
			intents.get(index).setResponses(solve.getDate());
		}
		
		if (index == 6) {
			intents.get(index).setResponses(solve.getE());
		}
		
		return intents.get(index).randomMessage();
		
	}
	
	public static void main(String[] args) {
		BOT bot = new BOT();
		System.out.println(bot.intents.size());
		
	}
}
