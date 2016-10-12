package sports.wrappers;

public class UserWrapper {
	private int id;
	private String nick;
	private String email;
	
	public UserWrapper(){
	}
	
	public UserWrapper(String nick, String email){
		this.setNick(nick);
		this.setEmail(email);
	}
	
	public String getNick(){
		return nick;
	}
	
	public void setNick(String nick){
		this.nick = nick;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	

}
