
/**
 * Write a description of class WeatherConditionals here.
 *
 * @author (Garrett Harper)
 * @version (8/29/19)
 */
public class WeatherConditionals
{
    public void getWeatherAdvice(int temperature, String description){
        if (description.equals("windy") && temperature <= 32){
        System.out.println("Too windy or cold!");
        System.out.println("Enjoy watching the weather through the window.");
        }
        else {System.out.println("It is not windy.");}
    
        if (description.equals("sunny") && temperature >= 34){
        System.out.println("It's safe to go outside, " + temperature + " degrees and sunny.");
        }
        else {System.out.println("It is not sunny.");}
        
        if (description.equals("clear") && temperature >= 32 && temperature <= 90){
            System.out.println("It is clear and " + temperature + "degrees outside. Have fun!");
        }
        else {System.out.println("Too warm or too cold. Stay inside.");}
    }
}



