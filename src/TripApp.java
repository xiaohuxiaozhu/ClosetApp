import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TripApp {

    private static Scanner scan  = new Scanner(System.in);
    private static String input;
    private static boolean pick;
    private static String result;
    private static Random random = new Random();
    private static int randShoe =0;

    public static void main(String[]args){

        Shirt shirt1 =new Shirt("large", "Blue", "Cotton", "Long-Sleeve");
        Shirt shirt2 =new Shirt("Medium", "Red", "Denim", "Short-Sleeved");
        Shirt shirt3 =new Shirt("large", "Black", "Cotton", "No-Sleeves");


        Jacket jacket1 = new Jacket("Lether" ,"Medium", "Black");
        Jacket jacket2 = new Jacket("Windbreaker" ,"Large", "Yellow");
        Jacket jacket3 = new Jacket("Fleece" ,"Medium", "Grey");

        Pants pants1 = new Pants("Polyester", "Large", "Red", "Shorts");
        Pants pants2 = new Pants("Jeans", "Large", "Blue", "Pants");
        Pants pants3 = new Pants("Nylon", "Medium", "White", "Skirt");

        Shoes shoe1 = new Shoes("Nike", 10, "Green", "Flip-Flop");
        Shoes shoe2 = new Shoes("New Balance", 9, "White", "Normal");
        Shoes shoe3 = new Shoes("Jordans", 13, "Black", "Normal");

        //ShoeChoice choice = new ShoeChoice();

//         ArrayList<Shoes> shoeCollection = new ArrayList<>();
//        shoeCollection.add(shoe1);
//        shoeCollection.add(shoe2);
//        shoeCollection.add(shoe3);
//
//        shoeCollection = choice.Shoetype(scan,shoeCollection);





        Closet summer = new Closet(jacket1,shirt1,pants1,shoe1);
        Closet winter = new Closet(jacket2,shirt2,pants2,shoe2);
        Closet fall = new Closet(jacket3,shirt3,pants3,shoe3);


        while (!pick){
            System.out.println("\nWhich Closet would you like to look at? Winter Fall or Summer?");
            input = scan.nextLine().toLowerCase();


        switch(input) {

                case "summer":

                    System.out.println("You need a second pair of shoes");
                    randShoe = random.nextInt(2);
                    if(randShoe== 1){
                        summer.setShoeList(shoe2);
                    }
                    else{
                        summer.setShoeList(shoe3);
                    }

            System.out.println(summer.toString());
            break;

            case "winter":
                System.out.println(winter.toString());
                break;

            case "fall":
                System.out.println(fall.toString());
                break;

            default:
                System.out.println("That is not an option");
                pick = false;
                break;
        }
            System.out.println("\nDo you want to look at a different closet? (Y/N) ");
            input = scan.nextLine().toLowerCase();
            if(input.equals("n")){
                pick= false;
                break;
            }
        }





    }
}
