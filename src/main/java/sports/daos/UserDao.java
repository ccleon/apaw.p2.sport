package sports.daos;

import java.util.List;
import sports.entities.User;

public interface UserDao extends GenericDao<User, Integer>{
	User findUserByNick(String nick);
	List<User> findUsersbySport(String sportName);
}
