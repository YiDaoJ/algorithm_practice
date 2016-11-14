public class GreetMe{
  public static String greet(String name){
  
    String greeting;
    greeting = "Hello " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "!";
  
    return greeting;
    
  }
}