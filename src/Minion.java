
public class Minion {
	private String name; 
    private int eyes; 
	private String color; 
 	private String master;

	Minion(String name, int eyes, String color, String master){
	this.name = name;
	this.eyes = eyes;
	this.color = color;
	this.master = master;
	}
 	void setName(String name){
 	this.name = name;
 	}
 	String getName(){
 		return name;
 	}
 	void setEyes(int eyes){
 		this.eyes = eyes;
 	}
 	int getEyes(){
 		return eyes;
 	}
	void setColor(String color){
	 	this.color = color;
	 	}
	 	String getColor(){
	 		return color;
	 	}
	 	void setMaster(String master){
	 		this.master = master;
	 	}
	 	String getMaster(){
	 		return master;
	 	}

}
