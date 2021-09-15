package backendtweetanalysis;

public class Tweet {
	private int id;
	private int polarity;
	private String username;
	private String text;
	
	//
	public Tweet() {
		id = (Integer) null;
		polarity = (Integer) null;
		username = "USER UNKNOWN";
		text = "NO TWEET TEXT";
	}
	
	public Tweet(int id, int polarity, String user, String text) {
		this.id = id;
		this.polarity = polarity;
		user = username;
		this.text = text;
	}
	
	//Generate the getters and Setters for the private data members
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPolarity() {
		return polarity;
	}

	public void setPolarity(int polarity) {
		this.polarity = polarity;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
