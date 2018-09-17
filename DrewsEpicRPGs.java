import RPGs.*;
import Helpers.*;
import java.util.Scanner;

class DrewsEpicRPGs {
  
  public static void main (String str[]) {

    // RPGs.House.main(str); house rpg
    
    System.out.println(Helpers.Constants.asciiTitle);
    System.out.println("Welcome to the wild world of Drew's crazy imagination.\n");
    System.out.println("Currently available RPGs:\n    " + Helpers.Constants.rpgList);
    
    Scanner scanner = new Scanner(System.in);
    
    menu(scanner);
    
  }
  
  private static void menu (Scanner scanner) {
    
    System.out.println("\n    What would you like to do?");
    System.out.println("\tinfo - get info about an RPG");
    System.out.println("\tplay - play an RPG\n");
    
    String input = scanner.nextLine();
    
    if (input.toLowerCase().equals("info")) info(scanner);
    else if (input.toLowerCase().equals("play")) {
      System.out.println("WIP, returning to menu..");
      menu(scanner);
    } else menu(scanner);
    
  }
  
  private static void info (Scanner scanner) {
    
    System.out.println("\nAbout what RPG?");
    System.out.println("    " + Helpers.Constants.rpgList + "\n");
    
    String input = scanner.nextLine();
    if (input.toLowerCase().equals("house")) {
      System.out.println(RPGs.House.info);
      System.out.println("Returning to menu..");
      menu(scanner);
    } else info(scanner);
    
  }
  
}