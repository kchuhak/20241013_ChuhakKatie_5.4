public class Main {
    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers");
        System.out.println(" ");

        // loop to calculate and display miles to kilometers conversion
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * 1.609;
            System.out.printf("%-10d\t%.3f%n", miles, kilometers);
        }
    }
}