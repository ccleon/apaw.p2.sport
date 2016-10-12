package sports.controllers;

import java.util.List;
import sports.daos.DaoFactory;
import sports.entities.Sport;
import sports.entities.User;
import sports.wrappers.UserListWrapper;
import sports.wrappers.UserWrapper;


public class UserController {
	
	public boolean createUser (String nick, String email){
		User user = DaoFactory.getFactory().getUserDao().findUserByNick(nick);
		if (user == null){
			DaoFactory.getFactory().getUserDao().create(new User(nick, email));
			return true;
		}else{
			return false;
		}
	}
	
	public UserListWrapper userList(){
		List <User> users = DaoFactory.getFactory().getUserDao().findAll();
		UserListWrapper userListWrapper = new UserListWrapper();
		for (User user : users){
			userListWrapper.addUserWrapper(new UserWrapper(user.getNick(), user.getEmail()));
		}
		return userListWrapper;
	}
	
	public UserWrapper addSportToUser(String nick, String sportName){
		User user = DaoFactory.getFactory().getUserDao().findUserByNick(nick);
		if (user != null) {
	        user.addSport(new Sport(sportName));
	        DaoFactory.getFactory().getUserDao().update(user);
	    }
		return new UserWrapper(user.getNick(), user.getEmail());
	}

	public UserListWrapper findUsersBySport (String sportName){
		List<User> usersFound = DaoFactory.getFactory().getUserDao().findUsersBySport(sportName);
		UserListWrapper usersFoundListWrapper = new UserListWrapper();
		for (User user : usersFound){
			usersFoundListWrapper.addUserWrapper(new UserWrapper(user.getNick()));
		}
		return usersFoundListWrapper;
	}
}

