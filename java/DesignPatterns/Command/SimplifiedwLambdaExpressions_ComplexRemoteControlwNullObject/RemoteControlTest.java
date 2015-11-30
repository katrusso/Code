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

/*
	A lambda expression can have parameters and a return value.
	
	The signature of the lambda expression must match the signature of the one method in 
	the type of object you're using a lambda expression to stand for.

	If an interface has two methods, we can't use a lambda expression. 
	An interface that has one method is known as a functional interface. Lambda expressions are 
	designed specifically to replace the methods in these functional interfaces, partly as a way to 
	reduce the code that is required when you have a lot of these small classes with functional interfaces.

	If your interface has two methods, it's not a functional interface and you won't be able to replace it 
	with a lambda expression: a lambda expression is really a replacement for a method, not an entire object.
	You can't replace two methods with one lambda expression.

	For example, that means you can't use lambda expression in code that uses the Command pattern to implement UNDO functionality.
	e.g. 
	  public interface Command {
			public void execute() {};
			public void undo() {};
	  } 

	  but since this app doesn't use undo, the interface looks like this:

	  public interface Command {
			public void execute() {};
	  } 

*/