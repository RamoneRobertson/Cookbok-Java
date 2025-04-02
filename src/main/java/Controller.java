public class Controller {
    CookBook cookbook = new CookBook();
    View view = new View();

    public void add(){
        Recipe recipe = new Recipe();

        // Get user input for name and description
        String name = view.askFor("name");
        String desc = view.askFor("description");

        // Create new recipe
        recipe.setName(name);
        recipe.setDescription(desc);

        // Add to cookbok
        cookbook.addRecipe(recipe);
    }

    public void delete(){
        view.listAllRecipes(cookbook.recipes);
        String userChoice = view.askFor("Recipe Name");
        cookbook.removeRecipe(userChoice);
    }

    public void listRecipes(){
        view.listAllRecipes(cookbook.recipes);
    }
}
