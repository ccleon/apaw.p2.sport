package sports.api;

import sports.exceptions.*;
import sports.controllers.UserController;
import sports.controllers.SportController;
import sports.wrappers.UserListWrapper;
import sports.wrappers.UserWrapper;

public class UserResource {
	
	//GET /users
	public UserListWrapper userList(){
		return new UserController().userList();
	}
	
	//POST /users body="nick:email"
	public void createUser (String nick, String email) throws InvalidUserNickException{
		if (!new UserController().createUser(nick, email)) {
			throw new InvalidUserNickException("" + nick);
		}
	}
	
	//GET /users/search?sport=*
	public UserListWrapper userSportList(String sportName){
		return null;
	}
	
	//PUT /users/{nick}/sport body=sportName
	public UserWrapper addSportToUser(String nick, String sportName) throws NotFoundSportException {
		if (new SportController().findSport(sportName) == false){
			throw new NotFoundSportException ("" + sportName);
		}else{
			UserWrapper userWrapper = new UserController().addSportToUser(nick, sportName);
			return userWrapper;
		}	
		
	}
	
}
	
	