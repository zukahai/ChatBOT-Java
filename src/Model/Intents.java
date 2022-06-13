package Model;

import java.util.ArrayList;

public class Intents {
	ArrayList<String> patterns;
	String tag;
	ArrayList<String> responses;
	
	public Intents() {
		patterns  = new ArrayList<>();
		responses = new ArrayList<>();
		tag = "";
	}
	
	public boolean check(String text) {
		text = text.toLowerCase();
		for (String s : patterns) {
			if (s.toLowerCase().contains(text))
				return true;
		}
			
		return false;
	}

	public void addPatterns(String pattern) {
		patterns.add(pattern);
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
	
	
}
