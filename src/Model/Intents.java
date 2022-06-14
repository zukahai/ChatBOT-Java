package Model;

import java.util.ArrayList;

public class Intents {
	ArrayList<String> patterns;
	String tag, message;
	ArrayList<String> responses;
	
	public Intents() {
		patterns  = new ArrayList<>();
		responses = new ArrayList<>();
		tag = "";
	}
	
	public boolean check(String text) {
		text = text.toLowerCase();
		for (String s : patterns) {
			if (text.contains(s.toLowerCase()) && text.length() > 3)
				return true;
		}
			
		return false;
	}

	public void addPatterns(String pattern) {
		patterns.add(pattern);
	}
	
	public void addResponses(String text) {
		responses.add(text);
	}
	
	public String randomMessage() {
		int n = responses.size();
		int random = (int) (Math.random() * 10000) % n;
		return responses.get(random);
	}
	
	public ArrayList<String> getPatterns() {
		return patterns;
	}

	public void setPatterns(ArrayList<String> patterns) {
		this.patterns = patterns;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public ArrayList<String> getResponses() {
		return responses;
	}

	public void setResponses(ArrayList<String> responses) {
		this.responses = responses;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
