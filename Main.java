import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WeatherService service = new WeatherService();
        //
        System.out.println("Provide a city: ");
        String city = input.nextLine();
        //
        System.out.println("Your city: " + city);
        Weather current = service.getWeather();
        System.out.print(current);
    }
}
