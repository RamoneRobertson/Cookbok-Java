import java.util.Map;
import java.util.HashMap;
import java.util. Scanner;

public class CookBook {
    Map <String, String> recipes = new HashMap<>();

    public void addRecipe(Recipe recipe){
        recipes.put(recipe.getName(), recipe.getDescription());
    }

    public void removeRecipe(String name){
        recipes.remove(name);
    }

}
