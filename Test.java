package textquest;

import java.util.Scanner;
import java.io.FileReader;

public class Test {
    
    public static void main(String[] args) throws Exception {
        
        FileReader choices = new FileReader("choices");
        
        Scanner scanner = new Scanner(choices);
        
        while(scanner.hasNextLine()) {
            
            System.out.print(scanner.nextLine());
            
        }
    }
}
