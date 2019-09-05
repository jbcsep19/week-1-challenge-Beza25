import java.util.Scanner;

public class chooseYourOwnAdventure {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        String user;

        System.out.println("WELCOME TO EMUSHA'S TINY ADVENTURE!\n\n"+
                "You are in a my welcoming house! Where do  you want to go?" +
                " the (Kitchen) , (Upstairs) , (Patio) , (Living Room) , or (Basement) \n");

        user = input.nextLine();

        if(user.equalsIgnoreCase("Kitchen")){
            System.out.println("To your left in, there are the refrigerator and the cabinet" +
                    "Would you like to open the 'refrigerator' or the 'cabinet'");
             String kitchen= input.nextLine();
            if(kitchen.equalsIgnoreCase("refrigerator")){
                System.out.println("You can  help your self for anything in the refigerator" +
                        "Would you like to take some food? ('yes' or 'no')");
                String refigerator = input.nextLine();
                if(refigerator.equalsIgnoreCase("yes")){
                    System.out.println("You can either drink (milk) or eat (leftover)");
                    String food = input.nextLine();
                    if(food.equalsIgnoreCase("milk") || food.equalsIgnoreCase("leftover")){
                        System.out.println("Congratulation! You survived");
                    }else{
                        System.out.println("You entered incorrect response. Bye!");
                    }

                }else if(refigerator.equalsIgnoreCase("no")){
                    System.out.println("You might die of starvation ... eventually.");
                }
            }else if(kitchen.equalsIgnoreCase("cabinet")) {
                System.out.println("Don't mind the cullter. I really need to organize my cabinet, but you can take anything. " +
                        "Do you want to take something? ('yes' or 'no')");
                String cabinet = input.nextLine();
                if (cabinet.equalsIgnoreCase("yes")) {
                    System.out.println("You may either eat a can of (beans) or take a (plate)");
                    String food = input.nextLine();
                    if (food.equalsIgnoreCase("beans") || food.equalsIgnoreCase("plate")) {
                        System.out.println("Congratulation! You survived.");
                    } else {
                        System.out.println("You entered incorrect response. Bye!");
                    }

                } else if (cabinet.equalsIgnoreCase("no")) {
                    System.out.println("Well, you may never Know what you could have taken. Bye!");
                }
            }
        }else if(user.equalsIgnoreCase("Upstairs")){
            System.out.println("Are you tired of climbing all the stairs? It is perfect for your health." +
                    " You can go to the (Bedroom) to take a nap or the (Bathroom) to refresh.");
            String upstairs= input.nextLine();
            if(upstairs.equalsIgnoreCase("Bedroom")){
                System.out.println("You are one step away from seeing what my bedroom looks like. It is OK, you can judge." +
                        " Do you want to enter to my bedroom? ('yes' or 'no')");
                String bedroom = input.nextLine();
                if(bedroom.equalsIgnoreCase("yes")){
                    System.out.println("Yup! You made to the bed. Now, do you want to lay on the (bed) or do you want to be" +
                                    " nosey and look into the my (drawer)? ");
                    String bed = input.nextLine();
                    if(bed.equalsIgnoreCase("bed") || bed.equalsIgnoreCase("drawer")){
                        System.out.println("Congratulation! You survived");
                    }else{
                        System.out.println("You entered incorrect response. Bye!");
                    }

                }else if(bedroom.equalsIgnoreCase("no")){
                    System.out.println("I guess you climbed all that stairs for no use. Bye!");
                }
            }else if(upstairs.equalsIgnoreCase("Bathroom")) {
                System.out.println("This is a refreshing zone. " +
                        "Would like to refresh yourself and use some of my moisturizer? ('yes' or 'no')");
                String bathroom = input.nextLine();
                if (bathroom.equalsIgnoreCase("yes")) {
                    System.out.println("As I said, it is so refreshing zone. That is why your are smelling the my DYI lemon scent " +
                            " If you want to you can see your beautiful face in the (mirror) or use the (toilet)");
                    String refresh = input.nextLine();
                    if (refresh.equalsIgnoreCase("mirror") || refresh.equalsIgnoreCase("toilet")) {
                        System.out.println("Congratulation! You survived.");
                    } else {
                        System.out.println("You entered incorrect response. Bye!");
                    }

                } else if (bathroom.equalsIgnoreCase("no")) {
                    System.out.println("You must be already refreshed. Bye!");
                }
            }


        }else if(user.equalsIgnoreCase("Patio")){

        }else if(user.equalsIgnoreCase("Living Room")){

        }else if (user.equalsIgnoreCase("Basement")){

        }else{
            System.out.println("You enter an invalid choice.");
        }



    }
}
