class HalfDollars {
    public static void main(String[] arguments) {
        int[] denver = { 2500000, 2900000, 3500000  }; //created and initialized
        int[] philadelphia = new int[denver.length]; //[instance.length] --> used to indicate the size of the new array
        int[] total = new int[denver.length];
        int average;

        philadelphia[0] = 2500000; //setting array values
        philadelphia[1] = 2900000;
        philadelphia[2] = 3800000;

        total[0] = denver[0] + philadelphia[0];
        total[1] = denver[1] + philadelphia[1];
        total[2] = denver[2] + philadelphia[2];
        average = (total[0] + total[1] + total[2]) / 3;

        System.out.print("2003 production: ");
        System.out.format("%,d%n", total[0]);
        System.out.print("2004 production: ");
        System.out.format("%,d%n", total[1]);
        System.out.print("2005 production: ");
        System.out.format("%,d%n", total[2]);
        System.out.print("Average production: ");
        System.out.format("%,d%n", average); //adds commas to the output
    }
}
