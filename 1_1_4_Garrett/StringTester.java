
/**
 * Write a description of class StringTester here.
 *
 * @author (Garrett Harper)
 * @version (8/27/19)
 */
public class StringTester
{
    public static void main(String[] args)
    {
        weather2 test = new weather2("mixed rain and snow");
        WeatherConditionals weatherCon = new WeatherConditionals();
        weatherCon.getWeatherAdvice(20, "clear");
        weatherCon.getWeatherAdvice(50, "windy");
    }
}
