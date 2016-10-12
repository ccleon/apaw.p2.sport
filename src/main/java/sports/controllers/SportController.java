package sports.controllers;

import java.util.List;

import sports.daos.DaoFactory;
import sports.entities.Sport;
import sports.wrappers.SportListWrapper;
import sports.wrappers.SportWrapper;

public class SportController {
	public boolean createSport (String name){
		Sport sport = DaoFactory.getFactory().getSportDao().findSportByName(name);
		if (sport == null){
			DaoFactory.getFactory().getSportDao().create(new Sport(name));
			return true;
		}else{
			return false;
		}
	}
	
	public SportListWrapper sportList(){
		List <Sport> sports = DaoFactory.getFactory().getSportDao().findAll();
		SportListWrapper sportListWrapper = new SportListWrapper();
		for (Sport sport : sports){
			sportListWrapper.addSportWrapper(new SportWrapper(sport.getName()));
		}
		return sportListWrapper;
	}

}
