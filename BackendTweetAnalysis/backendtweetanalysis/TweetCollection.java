package backendtweetanalysis;

import java.util.ArrayList;

public class TweetCollection {
	private ArrayList<Tweet> myData;
	private int size;
	private String filename;
	
	
	public TweetCollection() {
		
	}


	//Generate the getters and setters for the data fields
	public ArrayList<Tweet> getMyData() {
		return myData;
	}


	public void setMyData(ArrayList<Tweet> myData) {
		this.myData = myData;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getFilename() {
		return filename;
	}


	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
	
}
