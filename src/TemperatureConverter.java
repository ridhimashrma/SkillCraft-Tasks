import java.util.Scanner;

public class TemperatureConverter {

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    // Convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("Choose the input scale:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        int choice = sc.nextInt();

        System.out.print("Enter the temperature value: ");
        double inputTemp = sc.nextDouble();

        System.out.println("Conversions:");
        switch (choice) {
            case 1:
                System.out.println("Celsius: " + inputTemp);
                System.out.println("Fahrenheit: " + celsiusToFahrenheit(inputTemp));
                System.out.println("Kelvin: " + celsiusToKelvin(inputTemp));
                break;
            case 2:
                System.out.println("Fahrenheit: " + inputTemp);
                System.out.println("Celsius: " + fahrenheitToCelsius(inputTemp));
                System.out.println("Kelvin: " + fahrenheitToKelvin(inputTemp));
                break;
            case 3:
                System.out.println("Kelvin: " + inputTemp);
                System.out.println("Celsius: " + kelvinToCelsius(inputTemp));
                System.out.println("Fahrenheit: " + kelvinToFahrenheit(inputTemp));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
