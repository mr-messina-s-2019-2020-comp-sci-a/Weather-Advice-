
/**
 * Write a description of class StringTester here.
 *
 * @author (Matthew Haywood)
 * @version (8/27/2019)
 */
public class StringTester
{
    // instance variables - replace the example below with your own
    private int x;
    private String weatherCondition;
    private String description;
    /**
     * Constructor for objects of class StringTester
     */
    public StringTester()
    {
        // initialise instance variables
        x = 0;
        weatherCondition = "";
    }
     public String getWeatherCondition() {
        return weatherCondition;
    }
    public void setWeatherCondition(String freezingRain) {
        weatherCondition = freezingRain; 
    }
    public static void main() {
        String weatherCondition = new String("its freezing rain");
        WeatherConditionals test = new WeatherConditionals();
        /*testWeather.setWeatherCondition("its freezing rain");
         * 
         */
        //System.out.println(weatherCondition);
        /*System.out.print(weatherCondition.substring(0,7));
         * this was a test that pltw told me to try
         */
        //System.out.println(WeatherConditionals.getWeatherAdvice(32, "heavy snow"));
        test.setDescription("windy");
        System.out.println(test.getDescription());
        test.getWeatherAdvice(100,"sunny");
        boolean isWindy = false;
        System.out.print(test.getDescription().equals("windy"));
    }
}

