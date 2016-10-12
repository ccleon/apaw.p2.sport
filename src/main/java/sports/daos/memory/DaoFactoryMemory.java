package sports.daos.memory;

import sports.daos.DaoFactory;
import sports.daos.UserDao;
import sports.daos.SportDao;

public class DaoFactoryMemory extends DaoFactory{
	private UserDao userDao;
	private SportDao sportDao;

	public DaoFactoryMemory() {
	}

	@Override
	public UserDao getUserDao() {
		if (userDao == null) {
			userDao = new UserDaoMemory();
		}
		return userDao;
	}

	@Override
	public SportDao getSportDao() {
		if (sportDao == null) {
			sportDao = new SportDaoMemory();
		}
		return sportDao;
	}

}
