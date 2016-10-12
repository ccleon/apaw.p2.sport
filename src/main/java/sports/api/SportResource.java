package sports.api;

import sports.controllers.SportController;

public class SportResource {
	
	//POST /sports	body="name"
	public void createSport(String name) throws InvalidSportException{
		if (/*El deporte ya existe*/){
			throw new InvalidSportException(""+name);
		}
		
		
	}

}
