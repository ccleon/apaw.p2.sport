package sports.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String nick, email;
	private List<Sport> sports;
	private int id;
	
	public User(){
		this.sports = new ArrayList<Sport>();
	}
	
	public User(String nick, String email){
		this.nick = nick;
		this.email = email;
		this.sports = new ArrayList<Sport>();
	}
	
	public int getId() {
        return id;
    }

    public void setId(int id) {
		this.id = id;
	}
    
	public String getNick(){
		return nick;
	}
	
	public String getEmail(){
		return email;
	}
	
	public List<Sport> getSport(){
		return sports;
	}
	
	public void addSport (Sport sport){
		sports.add(sport);
	}
	
	@Override
	public String toString() {
		return "User [nick=" + nick + ", email=" + email + "]";
	}


}
