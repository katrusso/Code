public class RemoteControlTest {
	public static void main(String[] args) {

		//create the invoker
		RemoteControl remote = new RemoteControl();

		//create receivers
		Light livingRoomLight = new Light("Living Room"); //receivers and their locations
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");

		//create commands
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight); //bind command with receiving object
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		CeilingFanHighCommand fanOnHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand fanOff = new CeilingFanOffCommand(ceilingFan);

		GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand doorClose = new GarageDoorCloseCommand(garageDoor);

		StereoOnForCDCommand stereoOn = new StereoOnForCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		//program the remote by loading the commands into the remote slots (note, there are 3 unprogrammed rows (6 blank slots) on the remote )
		remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remote.setCommand(1, kitchenLightOn, kitchenLightOff);
		remote.setCommand(2, fanOnHigh, fanOff);
		remote.setCommand(3, stereoOn, stereoOff);

		System.out.println(remote); //calls toString() to print each remote slot and the command that is assigned to it.

		//step through each slot and press the on and off buttons.
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);

		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);

		remote.onButtonWasPushed(2);
		remote.offButtonWasPushed(2);

		remote.onButtonWasPushed(3);
		remote.offButtonWasPushed(3);		
	}
}