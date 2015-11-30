public class RemoteControlTest {

		//create constants for readability
		public static final int LIVING_ROOM_LIGHT = 0;
		public static final int KITCHEN_LIGHT = 1;
		public static final int CEILING_FAN = 2;
		public static final int GARAGE_DOOR = 3;
		public static final int STEREO = 4;

	public static void main(String[] args) {

		//create the invoker
		RemoteControl remote = new RemoteControl();

		//create receivers
		Light livingRoomLight = new Light("Living Room"); //receivers and their locations
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");

		/*
		//set the remote control's cmds using lamda expressions; the lambdas get passed as commands to setCommand().
		remote.setCommand(0, () -> { livingRoomLight.on(); }, () -> { livingRoomLight.off(); });
		remote.setCommand(1, () -> { kitchenLight.on(); }, () -> { kitchenLight.off(); });
		remote.setCommand(2, () -> { ceilingFan.fanOnHigh(); }, () -> { ceilingFan.fanOff(); });
		remote.setCommand(3, () -> { garageDoor.doorOpen(); }, () -> {garageDoor.doorClose(); });
		remote.setCommand(4, () -> { stereo.on(); stereo.setCD(); stereo.setVolume(11); }, () -> { stereo.off(); });
		*/		

		/* Simplify the [above] code more using method references. 
		When the lambda expression you're passing calls just one method, you can pass a method reference in place of the lambda expression: */
		remote.setCommand(0, livingRoomLight::on, livingRoomLight::off);
		remote.setCommand(1, kitchenLight::on, kitchenLight::off);
		remote.setCommand(2, ceilingFan::fanOnHigh, ceilingFan::fanOff);
		remote.setCommand(3, garageDoor::doorOpen, garageDoor::doorClose);
		Command stereoOnWithCD = () -> { stereo.on(); stereo.setCD(); stereo.setVolume(11); };
		remote.setCommand(4,  stereoOnWithCD, stereo::off);

		System.out.println(remote); //calls toString() to print each remote slot and the command that is assigned to it.


		//push the remote control buttons
		remote.onButtonWasPushed(LIVING_ROOM_LIGHT);
		remote.offButtonWasPushed(LIVING_ROOM_LIGHT);

		remote.onButtonWasPushed(KITCHEN_LIGHT);
		remote.offButtonWasPushed(KITCHEN_LIGHT);

		remote.onButtonWasPushed(CEILING_FAN);
		remote.offButtonWasPushed(CEILING_FAN);

		remote.onButtonWasPushed(GARAGE_DOOR);
		remote.offButtonWasPushed(GARAGE_DOOR);

		remote.onButtonWasPushed(STEREO);
		remote.offButtonWasPushed(STEREO);		
	}
}