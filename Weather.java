
public class Weather {
    // Instance Variables
    private double temperature;
    private int humidity;
    private double windspeed;
    private String condition;

    // Constructor
    public Weather(double temperature, int humidity, double windspeed, String condition){
        this.temperature = temperature;
        this.humidity = humidity;
        this.windspeed = windspeed;
        this.condition = condition;

    }

    // Getters
    public double getTemp(){
        return temperature;
    }

    public int getHumidity(){
        return humidity;
    }

    public double getWindspeed(){
        return windspeed;
    }

    public String getCondition(){
        return condition;
    }

    // ToString
    @Override 
    public String toString(){
        return "Temperature: " + temperature +
                "\nHumidity: " + humidity +
                "%" +
                "\nWindspeed: " + windspeed +
                "mph" +
                "\nCondition: " + condition;    
            }

}
