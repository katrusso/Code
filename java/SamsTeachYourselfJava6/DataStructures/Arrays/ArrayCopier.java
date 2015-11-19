/*
    app uses a while loop to copy the elements of an array of interegers (in array 1) to an array of float vars (in array 2),
    casting each var to a float as it goes in.

    If any of the elements in the first array is 1, the loop immediately exits at that point.
*/

class ArrayCopier {
    public static void main(String[] arguments) {
        int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };
        float[] array2 = new float[array1.length];

        System.out.print("array1: [ ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("]");

        System.out.print("array2: [ ");
        int count = 0;
        while ( count < array1.length && array1[count] != 1) {
            array2[count] = (float) array1[count];
            System.out.print(array2[count++] + " ");
        }
        System.out.println("]");
    }
}
