package Weather;


/**
 * Write a description of class StringTester here.
 *
 * @author Cameron Salamone
 * @version 8/27/19
 */
public class StringTester
{
    
    public static void main()
    {
        String weatherCondition = "mixed rain and snow";
        
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "windy"));
        
        System.out.println(WeatherConditionals.getHikingAdvice(30, 30, 40, ""));
        
        
    }
}
