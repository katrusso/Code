class ArrOfArrays {
	public static void main(String[] args) {
		int[][][] century = new int[100][52][7];
		System.out.println("# of elements in the first dimension: " + century.length); //100
		System.out.println("# of elements in the second dimension: " + century[0].length); //52
		System.out.println("# of elements in the third dimension: " + century[0][0].length); //7

		String[][][] invisalign = new String[10][44][7]; //I have to use invisalign for 10 mos, which is 44 weeks at 7 days a week. Each day in that 7 day week has a value (a date).
		invisalign[9][43][6] = "19-Oct-15"; //remember to adjust the indexes as they range from 0 to n-1 in arrays
		String firstDay= invisalign[9][43][6]; //copies the value into firstDay, even though firstDay is an Object. (other types of objects would create references)
		System.out.println("My first day in the countdown of having invisalign was: " + firstDay);
	}
}
/*
Above, an array containing 100 elements (slots) -- each element containing an array of 52 slots. Each of the 52 slots containing an array of 7 slots.
Java doesn't have multidimensional arrays, so instead you can use arrays of arrays.
 */