import java.util.ArrayList;
import java.util.Scanner;
public class TemperatureConverterHistoricValues {

    static ArrayList<Double> temperatures = new ArrayList<Double>();

    public static void main(String[] args) {

        System.out.println("Please type in Celsius temperature " +
                "value you would like to convert to Fahrenheit:");

        Scanner scanner = new Scanner(System.in);
        String celsiusTemperature = scanner.nextLine();
        double temperature = convertToFahrenheit(Double.parseDouble(celsiusTemperature));
        temperatures.add(temperature);
        System.out.println(temperatures.toString());
    }

    static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}