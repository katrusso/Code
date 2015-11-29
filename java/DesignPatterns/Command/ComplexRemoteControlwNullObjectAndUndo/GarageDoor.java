public class GarageDoor {
	String location = "";
	
	public GarageDoor(String location){
		this.location = location;
	}

	public void doorOpen(){
		System.out.println("The garage door is open.");
	}

	public void doorClose() {
		System.out.println("The garage door is closed.");

	}
}