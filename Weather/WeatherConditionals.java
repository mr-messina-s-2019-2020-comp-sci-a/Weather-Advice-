package Weather;


/**
 * Returns duggestions basedon given conditions
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherConditionals
{
  public static String getWeatherAdvice(int temperature, String description)
  {
    boolean windy = false;
    
    if(description.equals("windy")){
           windy = true;
        }
    
    if(windy || temperature <= 30){
      description = ("Too windy or cold! Enjoy watching the weather through the window."); 
    }
        
    if(windy == false && temperature > 30){
         description = ("It's safe to go outside, " + temperature + " and " + description + ".");
    }
    
    if(description.equals("snow") && temperature == 100){
        description = ("No shot thats possible");
    }
  
    return description;
  }
     
  public static String getHikingAdvice(int temperature, int windchill, int humidity,
                                    String description)
  {
    if (temperature <= 32 || windchill <= 32){
          description = ("Temperature or Windchill is freezing or below freezing. Hiking not advised");
     }        
      
     
     
    if (humidity >= 50 || temperature > 85){
         description = ("Humidity is above 50%. Cool clothing and water is advised while hiking");
     }       
        
        
      return description;
  }
}
