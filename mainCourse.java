package textquest;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class mainCourse {
  
  public static void main(String[] args) throws Exception {
      
    Scanner scannerInput = new Scanner(System.in), scannerChoices, scannerDescriptions;
    
    FileReader choices = new FileReader("C:\\Users\\Kostya\\Documents\\NetBeansProjects\\TextQuest\\source\\choices"), descriptions = new FileReader("C:\\Users\\Kostya\\Documents\\NetBeansProjects\\TextQuest\\source\\descriptions");
        
    scannerChoices = new Scanner(choices);
        
    scannerDescriptions = new Scanner(descriptions);
    
    executor 
           
    boolean running = true;
    
    while(running) {
      
      String input  = scannerInput.nextLine().trim();
      
      if(Interpretator.commands.containsKey(input)) {
          
          try {
          
            Interpretator.commands.get(input).execute();
            
          } catch(Exception e) {
              
              System.out.print("Ошибка!");
              
          }
      }
      
    }
  }
  
}
