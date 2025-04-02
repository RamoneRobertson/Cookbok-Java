import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public String askFor(String stuff){
        System.out.println(stuff.toUpperCase() + ":");
        String userInput = scanner.next();
        return userInput;
    }

    public void listAllRecipes(Map <String, String> recipes){
        System.out.println();

        for(String recipe : recipes.keySet()){
            System.out.println(recipe + ": " + recipes.get(recipe));
        }

        System.out.println();

    }
}
