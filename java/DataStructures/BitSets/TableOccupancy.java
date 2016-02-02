import java.util.BitSet;

public class TableOccupancy{
	BitSet tables;
	public static final int NUMBER_OF_TABLES = 8;
	
	public TableOccupancy(){
		tables = new BitSet(NUMBER_OF_TABLES);
	}
	public void setAsOccupied(int tableNumber){
		tables.set(tableNumber);
	}
	public void setAsOccupied(int firstTable, int lastTable){ 
		lastTable += 1; //params are inclusive, exclusive
		tables.set(firstTable, lastTable);
	}
	public void setAsAvailable(int tableNumber){
		tables.clear(tableNumber);
	}
	public void setAsAvailable(int firstTable, int lastTable){ 
		lastTable += 1; //params are inclusive, exclusive
		tables.clear(firstTable, lastTable);
	}
	public void flipTable(int tableNumber){ //Sets the bit at the specified index to the complement of its current value
		tables.flip(tableNumber); 
	}
	public boolean isOccupied(int tableNumber){ 
		boolean result = tables.get(tableNumber);
		return result;
	}
	public void setAllAsAvailable(){
		tables.clear();
	}
	public int getClosestAvailableTable(int tableNumber){
		int result = tables.nextClearBit(tableNumber);
		return result;
	}
	public void printAvailableTables(){
		int result;
		int prevResult = 0;
		for( int i = 0; i < tables.size(); i++){
			result = tables.nextClearBit(i);
			if( result != prevResult){
				System.out.println("empty table: " + result);
			}
			prevResult = result;		//used to remove duplicates from nextClearBit
		}
	}
	public int getNumberOfOccupiedTables(){
		int result = tables.cardinality();
		return result;
	}

	/*
		and(BitSet set)
		Performs a logical AND of this target bit set with the argument bit set.
		This bit set is modified so that each bit in it has the value true iif it
		both initially had the value true and 
		the corresponding bit in the bit set argument also had the value true.

		or
		This bit set is modified so that a bit in it has the value true iif it either already had the value true or the corresponding bit in the bit set argument has the value true.

		xor
		 This bit set is modified so that a bit in it has the value true if and only if one of the following statements holds:
			The bit initially has the value true, and the corresponding bit in the argument has the value false.
			The bit initially has the value false, and the corresponding bit in the argument has the value true.
	
		toString
		toByteArray, toLongArray
	*/

	public static void main(String[] args){
		TableOccupancy tableOccupancy = new TableOccupancy();
		tableOccupancy.setAsOccupied(1, 6);
		
		System.out.println("occupied tables in 'tables' bitset: ");
 		System.out.println(tableOccupancy.tables);
 		
 		tableOccupancy.setAsAvailable(4);
 		System.out.println("occupied tables (table 4 is now available): ");
 		System.out.println(tableOccupancy.tables);
 		
  		tableOccupancy.setAllAsAvailable();
 		System.out.println("occupied tables in 'tables' bitset: ");
 		System.out.println(tableOccupancy.tables);
 		
 		System.out.println("first available table: ");
 		System.out.println(tableOccupancy.tables.nextClearBit(0));
 		
		tableOccupancy.setAsOccupied(55, 60);
 		
 		tableOccupancy.printAvailableTables();
 		
	}
}