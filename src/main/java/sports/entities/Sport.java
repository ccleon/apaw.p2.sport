package sports.entities;

public class Sport {
	
	private String name;
	private int id;
	
	public Sport (){
	}
	
	public Sport (String name){
		this.name = name;
	}
	
	public String getName() {
        return name;
    }
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	@Override
	public String toString() {
		return "Sport [name=" + name + "]";
	}

}
