import java.util.Scanner;

public class BarMenu {
    public static void main(String[] args) {

        System.out.println("MENU");
        System.out.println("------");
        System.out.println("1. Cocktail");
        System.out.println("2. Beer");
        System.out.println("3. Redwine");
        System.out.println("4. Whitewine");
        System.out.println("5. Exit");
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();

        switch (choice)
                {
                    case 1:
                        System.out.println("You want Cocktail..");
                        System.out.println("Cocktail with topshelf...");
                        System.out.println("Cocktail with low brand...");
                        break;
                    case 2: System.out.println("You want Beer..");
                        System.out.println("You want tap beer or bottle...");
                        break;
                    case 3: System.out.println("You want Red wine..");
                        System.out.println("Dry Red wine...");
                        System.out.println("Sweet Red wine...");
                        break;
                    case 4: System.out.println("you want white wine");
                        System.out.println("you want sparklin white wine");

                    case 5: System.out.println("You want to exit..."); break;

                    default:
                        System.out.println("Choice is mismatched...");
                }




            }
        }




