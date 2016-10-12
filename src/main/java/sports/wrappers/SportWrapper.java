package sports.wrappers;

public class SportWrapper {
	private String name;
	private int id;
	
	public SportWrapper(){
	}
	
	public SportWrapper(String name){
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "{\"name\":\"" + name + "\"}";
	}
	

}
