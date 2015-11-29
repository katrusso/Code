public interface Command {
	public void execute();
	public void undo();			//used in implementing UNDO
}	
