package Model;

import java.util.ArrayList;
import java.util.Stack;

public class Solve {
	
	public ArrayList<String> BCC(String text) {
		String Arrs[] = text.split(" ");
		int N = -1;
		for (String str : Arrs) {
			try {
				N = Integer.parseInt(str);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		String ans = "Bạn hãy nói rõ là bạn muốn tính bảng cửu chương mấy!";
		if (N != -1) {
			ans = "";
			for (int i = 1; i <= 10; i++) {
				ans = ans + "\n" + N + " x " + i + " = " + i * N;
			}
		}
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add(ans);
		return arrayList;
	}
	
	public boolean isOperator(String c) {
		if (c.equals("+"))
			return true;
		if (c.equals("-"))
			return true;
		if (c.equals("*"))
			return true;
		if (c.equals("/"))
			return true;
		return false;
	}
	
	public int priority(String c){
		if(c.equals("+") || c.equals("-"))
			return 1;
		else if(c.equals("*") || c.equals("/"))
			return 2;
		return 0;
	}
	
	public String valueMath(ArrayList<String> elementMath){
        Stack <String> S = new Stack<String>();
        try {
        	for (String s : elementMath){
                if (!isOperator(s))
                	S.push(s);
                else{
                    double num = 0f;
                    double num1 = Float.parseFloat(S.pop());
                    double num2 = Float.parseFloat(S.pop());
                    switch (s.charAt(0)) {
                        case '+' : num = num2 + num1; break;
                        case '-' : num = num2 - num1; break;
                        case '*' : num = num2 * num1; break;
                        case '/' : num = num2 / num1; break;
                        default:
                            break;
                    }
                    S.push(Double.toString(num));
                }
            }
		} catch (Exception e) {
			return "Vui lòng nhập một phép tính đúng hoặc rõ ràng hơn.";
		}
        return S.pop();
    }
	
	//a + b * c
	
	public ArrayList<String> Suffix(ArrayList<String> elementMath) {
		String ans = "";
		Stack <String> S = new Stack<String>();
		for (String s: elementMath) {
			if (s.equals("("))
				S.push(s);
			else if (s.equals(")")) {
				while(!S.isEmpty()) {
					String top = S.pop();
					if (top.equals("("))
						break;
					
					ans = ans + top + " ";
				}
			} else if (!isOperator(s)) {
				ans = ans + s + " ";
			} else {
				if (S.isEmpty())
					S.push(s);
				else {
					String top = S.peek();
					if (priority(s) <= priority(top)) {
						System.out.println("gg");
						ans = ans + S.pop() + " ";
						S.push(s);
					} else {
						S.push(s);
					}
				}
			}
		}
		while (!S.isEmpty())
			ans = ans + S.pop() + " ";
		String str[] = ans.split(" ");
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < str.length; i++)
			arr.add(str[i]);
		return arr;
	}
	
	public ArrayList<String> StringtoArraylist(String text) {
		ArrayList<String> ans = new ArrayList<String>();
		text = text.replaceAll(" ", "");
		text = text.replaceAll("=", "");
		text = text.replace("?", "");
		System.out.println(text);
		String temp = "";
		for (int i = 0; i < text.length(); i++)
			if (text.charAt(i) >= '0' && text.charAt(i) <= '9' || text.charAt(i) == '.') {
				temp = temp + text.charAt(i);
			} else {
				if (temp.length() > 0) {
					ans.add(temp);
					temp = "";
				}
				ans.add(text.charAt(i) + "");
			}
		if (temp.length() > 0)
			ans.add(temp);
		return ans;
	}
	
	public ArrayList<String> calculate(String text) {
		ArrayList<String> ans = new ArrayList<String>();
		ArrayList<String> temp = StringtoArraylist(text);
		temp = Suffix(temp);
		String result = valueMath(temp);
		ans.add(result);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList();
		System.out.println(new Solve().calculate("12+2*(10-9.5)"));
	}

}
