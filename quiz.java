import java.io.Console;

  public class FavoriteColor {
    public static void main(String[] args) {
      Console myConsole = System.console();

      System.out.println("What is your favorite color?");
      String favoriteColor = myConsole.readLine();
      System.out.println("Your favorite color is " + favoriteColor + "? Me too!");

    }
  }
