public class RemoteControlTest { //client
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl(); //the remote is the Invoker; it will be passed a cmd object that can be used to make requests
		Light light = new Light(); //the light object is the receiver (receives the request)
		LightOnCommand lightOn = new LightOnCommand(light); //creates a cmd and passes the receiver to it

		remote.setCommand(lightOn); //pass the cmd to the invoker (the remote)
		remote.buttonWasPressed(); //simulates the button being pressed
	
		LightOffCommand lightOff = new LightOffCommand(light);
		remote.setCommand(lightOff);
		remote.buttonWasPressed();
	}
}



