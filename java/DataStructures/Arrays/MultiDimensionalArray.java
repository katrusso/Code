public class MultiDimensionalArray {
	
	public static void main(String[] args) {
	int[][][] century = new int[100][52][7];

	System.out.println("Elements in the 1st dimension: " + century.length);
	System.out.println("Elements in the 2nd dimension: " + century[0].length);
	System.out.println("Elements in the 3rd dimension: " + century[0][0].length);
	}
}