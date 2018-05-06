package textquest;
import java.util.HashMap;
import java.beans.Expression;

public class Interpretator {
    
    static HashMap<String, Expression> commands = new HashMap<String, Expression>();
    
    static Expression Helloworld = new Expression(executor, "helloworld", null);
    
    public static void Interpretator() {

            commands.put("Hello World", Helloworld);
        
    }
    
    public void helloworld() {
        
        System.out.print("Hello World!");
        
    }
    
}
