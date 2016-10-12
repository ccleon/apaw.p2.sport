package sports.daos;

import java.util.List;
import sports.entities.User;

public interface UserDao extends GenericDao<User, String>{
	List<String> findValueByUserNick(int userNick);
	
}
