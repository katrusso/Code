public class DepthFirstSearch{
	State unvisitedState;
	State discoveredState;
	State finishedState;
	State foundSearchItemState;

	State state;	//state instance var
	int timestamp = 0;

	public DepthFirstSearch()
		unvisitedState = new UnvisitedState(this);
		discoveredState = new DiscoveredState(this);
		finishedState = new FinishedState(this);
		foundSearchItemState = new FoundSearchItemState(this);

		if timestamp > 0{
			state = discoveredState;
		}

		public void updateTimestamp(){
			state.updateTimestamp();
		}

		public void scanForAdjacentVertices(){
			state.scanForAdjacentVertices();
		}

		public void visitAdjacentVertex(){
			state.visitAdjacentVertex();
		}

		public void foundSearchItemState(){
			state.foundSearchItemState();
		}

		void setState(State state){
			this.state = state;
		}
}
