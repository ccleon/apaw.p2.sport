package sports.wrappers;

public class SportWrapper {
	private String name;
	
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

	@Override
	public String toString() {
		return "{\"name\":\"" + name + "\"}";
	}
	

}
