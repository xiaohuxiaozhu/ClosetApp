
//No longer need input on Flipflops, See summer choice in TrippAPP



import java.util.ArrayList;
import java.util.Scanner;




public class ShoeChoice extends Shoes{

private static String type;
private String input;
private ArrayList<Shoes> shoeCollection;

public ArrayList<Shoes> Shoetype(Scanner scan, ArrayList <Shoes>shoeList){

    for (Shoes shoe:shoeList){
        if (shoe.getType().equals("flip-flop")){
            System.out.println("You cant just bring Flip-flops, please choose another normal pair.");



            System.out.println("Brand: ");
            setBrand(scan.nextLine());
            // ...
            shoeCollection.add(shoe);
        }
    }


        while(true){
        System.out.println("What type of shoes do you want?");
        input=scan.nextLine().toLowerCase();



        if(input.equals("flip-flop")){
          for(Shoes shoe:shoeList) {
              if(shoe.getType().equals("flip-flop")){
                  shoeCollection.add(shoe);
              }
          }

            System.out.println("You cant just bring Flip-flops, please choose another normal pair.");

        }
        else{

            for(Shoes shoe:shoeList) {
                if(shoe.getType().equals("normal")){
                    shoeCollection.add(shoe);
                }
                break;
            }
        }

        return shoeCollection;
        }

}}
