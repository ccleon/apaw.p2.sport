package sports.daos;

import sports.entities.User;

public interface UserDao extends GenericDao<User, Integer>{
	User findUserByNick(String nick);
}
