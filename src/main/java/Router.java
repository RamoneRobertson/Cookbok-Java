import java.util.Scanner;

public class Router {
    Scanner scanner = new Scanner(System.in);
    Controller controller = new Controller();
    private Boolean running = true;

    public void run(){
        System.out.println("welcome to the Cookbook");

        while (running){
            displayTasks();
            int userChoice = scanner.nextInt();
            routeTask(userChoice);
        }

    }

    public Boolean getRunning(){
        return running;
    }

    public void setRunning(Boolean status){
        this.running = status;
    }

    public void displayTasks(){
        System.out.println("What do you want to do next?");
        System.out.println(
                "1. List all recipes\n" +
                "2. Add a recipe\n" +
                "3. Remove a recipe\n" +
                "4. Exit"
        );
    }

    public void routeTask(int userChoice){
        switch (userChoice){
            case 1:
                controller.listRecipes();
                break;
            case 2:
                controller.add();
                break;
            case 3:
                break;
            case 4:
                stop();
                break;
            default:
                System.out.println("Invalid option, please try again");
                break;
        }
    }

    public void stop(){
        setRunning(false);
    }
}
