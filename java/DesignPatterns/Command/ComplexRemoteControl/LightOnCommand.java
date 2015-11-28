public class LightOnCommand implements Command {
	Light light; //receiver; object the command will act on

	public LightOnCommand(Light light) { //bind the light to the command
		this.light = light;
	}

	public void execute() {	//this method is in the interface and must be defined in all command objects
		light.lightOn();
	}
}