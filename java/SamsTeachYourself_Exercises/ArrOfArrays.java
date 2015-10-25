class ArrOfArrays {
	public static void main(String[] args) {
		int[][][] century = new int[100][52][7];
		System.out.println("# of elements in the first dimension: " + century.length); //100
		System.out.println("# of elements in the second dimension: " + century[0].length); //52
		System.out.println("# of elements in the third dimension: " + century[0][0].length); //7
	}
}
/*
Above, an array containing 100 elements (slots) -- each element containing an array of 52 slots. Each of the 52 slots containing an array of 7 slots.
Java doesn't have multidimensional arrays, so instead you can use arrays of arrays.
 */