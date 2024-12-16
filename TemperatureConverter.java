import java.util.Scanner;

public class TemperatureConverter{
    public static void main(String[] args){

        System.out.println("Please type in Celsius temperature " +
                "value you would like to convert to Fahrenheit:");

        Scanner scanner = new Scanner(System.in);
        String celsiusTemperature = scanner.nextLine();
        System.out.println(convertToFahrenheit(Double.parseDouble(celsiusTemperature)));
    }

    static double convertToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
}