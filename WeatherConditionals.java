
/**
 * Write a description of class WeatherConditionals here.
 *
 * @author (matthew haywood)
 * @version (a version number or a date)
 */
public class WeatherConditionals
{
    // instance variables - replace the example below with your own
    private int temperature;
    private String description;
    /**
     * Constructor for objects of class WeatherConditionals
     */
    public WeatherConditionals()
    {
        // initialise instance variables
        temperature = 35;
    } 
   public void setTemperature(int stuff) {
       temperature = stuff;
    }
   public int getTemperature() {
       return temperature;
    }
   public void setDescription(String userInput) {
        description = userInput;
    }
   public String getDescription() {
        return description;
    }  
   public void getWeatherAdvice(int temperature, String description){
       if ((temperature == 34) && (description.equals("sunny"))){
/**                                  ||description.equals("rainy")
                                  ||description.equals("storming")
                                  ||description.equals("snowing"))){*/
        System.out.print("it's safe to go outside, 34 degrees and sunny");}
            else if ((temperature  == 32) && (description.equals ("windy"))){
/**                                              ||description !=("rainy")
                                              ||description !=("storming")
                                              ||description !=("snowing"))){*/
        System.out.print("too windy or cold! Enjoy watching the weather through the window");}
        if ((temperature == 33) && (description.equals("snow"))){
            System.out.println("its safe to go outside, 33 degrees and snowing");}
        if ((temperature == 30) && (description.equals("snow"))){
            System.out.println("Too Windy or cold! Enjoy watching the weather through the window");}
        if ((temperature == 30) && (description.equals("windy"))){
            System.out.println("too windy or cold! Enjoy watching the weather throught he window");}
        if ((temperature >= 40) && (description.equals("snowing")
                                    ||description.equals("raining")
                                    ||description.equals("sunny")
                                    ||description.equals("windy"))){
            System.out.println("no way mate, something doesnt add up");}
        
}
}

    

