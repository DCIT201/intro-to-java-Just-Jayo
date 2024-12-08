import java.util.Scanner;

public class TemperatureConverterr {
    /**
     * @param args
     */
    @SuppressWarnings("resource")
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking choice for conversion
        System.out.println("Select one of the options below by typing the number");
        System.out.println("1.Convert Celsius to Fahrenheit \n 2.Convert Fahrenheit to Celsius");
        int conversionChoice = scanner.nextInt();

        // validating input option
        if(conversionChoice != 1 && conversionChoice != 2) {
            System.out.println("You did not choose the right option, try again.");
            return;
        }

        //taking value for conversion
        System.out.println("Input the temperature you want to convert");
        double inputValue = scanner.nextDouble();

        // validating temperature 
        if(inputValue < -273.15) {
            System.out.println("Temperature can not have a value below -273.15");
            return;
        }

        //calculating using choice and value
        if(conversionChoice == 1) {
            double F = fahrenheitConversion(inputValue);
            System.out.println("Temperature in Fahrenheit is: " + F);
            
        } else if(conversionChoice == 2) {
            double C = celsiusConversion(inputValue);
            System.out.println("Temperature in Celsius is: " + C);

        }

        scanner.close();
    }

    public static double fahrenheitConversion(double value) {
        return (value * 9/5) + 32;
    }

    public static double celsiusConversion(double value) {
        return (value - 32)  * 5/9;
    }

}
