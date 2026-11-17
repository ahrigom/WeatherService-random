import java.util.Random;

public class WeatherService {

    public Weather getWeather(){
        Random rand = new Random();

        //
        int temperature = rand.nextInt(41) + 60;
        int humidity = rand.nextInt(41) + 60;
        int windspeed = rand.nextInt(21) + 5;

        //
        String[] condition = {"Sunny", "Windy", "Foggy"};
        String weatherCondition = condition[rand.nextInt(condition.length)];

        return new Weather(temperature, humidity, windspeed, weatherCondition);

    }
}
