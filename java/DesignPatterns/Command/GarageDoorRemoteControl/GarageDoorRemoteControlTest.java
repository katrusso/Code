public class GarageDoorRemoteControlTest { //the client is responsible for creating a concrete cmd and setting its receiver.
	public static void main(String[] args) {

		SimpleRemoteControl remote = new SimpleRemoteControl();
		GarageDoor garageDoor = new GarageDoor(); //the receiver knows how to perform the work needed to carry out the request.

		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
		GarageDoorStopCommand garageDoorStopCommand = new GarageDoorStopCommand(garageDoor);
		GarageDoorLightOnCommand garageDoorLightOnCommand = new GarageDoorLightOnCommand(garageDoor);
		GarageDoorLightOffCommand garageDoorlightOffCommand = new GarageDoorLightOffCommand(garageDoor);

		remote.setCommand(garageDoorOpenCommand); //the invoker holds a cmd and at some point asks the cmd to carry out a request by calling execute().
		remote.buttonWasPressed();

		remote.setCommand(garageDoorCloseCommand);
		remote.buttonWasPressed();

		remote.setCommand(garageDoorStopCommand);
		remote.buttonWasPressed();

		remote.setCommand(garageDoorLightOnCommand);
		remote.buttonWasPressed();

		remote.setCommand(garageDoorlightOffCommand);
		remote.buttonWasPressed();				
	}
}