public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) { //the ConcreteCommand defines a binding btwn an action & a Receiver.
		this.garageDoor = garageDoor;						//the Invoker makes a request by calling execute() and the ConcreteCmd carries it out by calling 1+ actions on the receiver.
	}

	public void execute() { //this method invokes the action(s) on the receiver needed to fulfilll the request.
		garageDoor.up();
	}	
}