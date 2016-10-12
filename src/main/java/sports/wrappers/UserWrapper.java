package sports.wrappers;

public class UserWrapper {
	
	private String sportName;
	private String nick;
	private String email;
	
	public UserWrapper(){
	}
	
	public UserWrapper(String nick, String email){
		this.nick=nick;
		this.email=email;
	}
	
	public String getSportName(){
		return "a";
	}

}
