import java.util.Scanner;

public class chooseYourOwnAdventure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user;

        System.out.println("WELCOME TO EMUSHA'S TINY ADVENTURE!\n\n" +
                "You are in a my welcoming house! Where do  you want to go?" +
                " the (Kitchen) , (Upstairs) , (Patio) , (Living Room) , or (Basement) \n");

        user = input.nextLine();

        if (user.equalsIgnoreCase("Kitchen")) {
            System.out.println("To your left in, there are the refrigerator and the cabinet" +
                    "Would you like to open the 'refrigerator' or the 'cabinet'");
            String kitchen = input.nextLine();
            if (kitchen.equalsIgnoreCase("refrigerator")) {
                System.out.println("You can  help your self for anything in the refigerator" +
                        "Would you like to take some food? ('yes' or 'no')");
                String refigerator = input.nextLine();
                if (refigerator.equalsIgnoreCase("yes")) {
                    System.out.println("You can either drink (milk) or eat (leftover)");
                    String food = input.nextLine();
                    if (food.equalsIgnoreCase("milk") || food.equalsIgnoreCase("leftover")) {
                        System.out.println("Congratulation! You survived");
                    } else {
                        System.out.println("You entered incorrect response. Bye!");
                    }

                } else if (refigerator.equalsIgnoreCase("no")) {
                    System.out.println("You might die of starvation ... eventually.");
                }
            } else if (kitchen.equalsIgnoreCase("cabinet")) {
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
        } else if (user.equalsIgnoreCase("Upstairs")) {
            System.out.println("Are you tired of climbing all the stairs? It is perfect for your health." +
                    " You can go to the (Bedroom) to take a nap or the (Bathroom) to refresh.");
            String upstairs = input.nextLine();
            if (upstairs.equalsIgnoreCase("Bedroom")) {
                System.out.println("You are one step away from seeing what my bedroom looks like. It is OK, you can judge." +
                        " Do you want to enter to my bedroom? ('yes' or 'no')");
                String bedroom = input.nextLine();
                if (bedroom.equalsIgnoreCase("yes")) {
                    System.out.println("Yup! You made to the bed. Now, do you want to lay on the (bed) or do you want to be" +
                            " nosey and look into the my (drawer)? ");
                    String bed = input.nextLine();
                    if (bed.equalsIgnoreCase("bed") || bed.equalsIgnoreCase("drawer")) {
                        System.out.println("Congratulation! You survived");
                    } else {
                        System.out.println("You entered incorrect response. Bye!");
                    }

                } else if (bedroom.equalsIgnoreCase("no")) {
                    System.out.println("I guess you climbed all that stairs for no use. Bye!");
                }
            } else if (upstairs.equalsIgnoreCase("Bathroom")) {
                System.out.println("This is a refreshing zone. " +
                        "Would like to refresh yourself and use some of my moisturizer? ('yes' or 'no')");
                String bathroom = input.nextLine();
                if (bathroom.equalsIgnoreCase("yes")) {
                    System.out.println("Can you smell the refreshment. It is my DYI lemon scent " +
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


        } else if (user.equalsIgnoreCase("Patio")) {
            System.out.println("Isn't the view beautiful? My favourite part are the trees." +
                    " Do you want to got to the (pool), or open the  (shed)?");
            String patio = input.nextLine();
            if (patio.equalsIgnoreCase("pool")) {
                System.out.println("Are you ready to see what the pool looks like? ('yes' or 'no')");
                String pool = input.nextLine();

                if (pool.equalsIgnoreCase("yes")) {
                    System.out.println("You asked for it! Now, do you want to (clean) the pool or (swim) in it. ");
                    String decision = input.nextLine();
                    if (decision.equalsIgnoreCase("clean") || decision.equalsIgnoreCase("swim")) {
                        System.out.println("Congratulation! You survived");
                    } else {
                        System.out.println("You entered incorrect response. Bye!");
                    }

                } else if (pool.equalsIgnoreCase("no")) {
                    System.out.println("It would have been fun. Bye!");
                }
            } else if (patio.equalsIgnoreCase("shed")) {
                System.out.println("Are you ready to open the shade? You never know what you will find('yes' or 'no')");
                String shed = input.nextLine();
                if (shed.equalsIgnoreCase("yes")) {
                    System.out.println("As you can see, you can either take an (ax) or a (hammer). Choose fast!");
                    String open = input.nextLine();
                    if (open.equalsIgnoreCase("ax")) {
                        System.out.println("Great choise! Do you want to get your day's excersice by (choppin) a tree " +
                                "or (throwing) an ax.");
                        String ax = input.nextLine();
                        if (ax.equalsIgnoreCase("chopping") || ax.equalsIgnoreCase("throwing")) {
                            System.out.println("Congratulations, You survived!");
                        }
                    } else if (open.equalsIgnoreCase("hammer")) {
                        System.out.println("Great choise! Do you want to hammer a (nail) or (break) the hammer?");
                        String hammer = input.nextLine();
                        if (hammer.equalsIgnoreCase("nail") || hammer.equalsIgnoreCase("break")) {
                            System.out.println("Congratulations, You survived!");
                        }
                    } else {
                        System.out.println("You entered incorrect response. Bye!");
                    }

                } else if (shed.equalsIgnoreCase("no")) {
                    System.out.println("You missed out on a lot of fun. Bye!");
                }
            }


        } else if (user.equalsIgnoreCase("Living Room")) {
            System.out.println("Welcome to the living room. Do you want to turn on the (TV) or sit on the (couch)?");
            String first = input.nextLine();

            if (first.equalsIgnoreCase("TV")) {
                System.out.println("Nice! chilling time. Do you want to (change) the channel or (stay) on the first channel");
                String TV = input.nextLine();
                if (TV.equalsIgnoreCase("change")) {
                    System.out.println("Now, Do you want to (increase) or (decrease ) the volume? ");
                    String volume = input.nextLine();
                    if (volume.equalsIgnoreCase("increase") || volume.equalsIgnoreCase("decrease")) {
                        System.out.println("Congratulation! You survived");
                    } else {
                        System.out.println("You entered incorrect response. Bye!");
                    }

                } else if (TV.equalsIgnoreCase("stay")) {
                    System.out.println("Ohh, right when you are about to enjoy your time. Someone is at the door." +
                            " Should you (open) the door or (ignore) ? Bye!");
                    String door = input.nextLine();
                    if (door.equalsIgnoreCase("open") || door.equalsIgnoreCase("ignore")) {
                        System.out.println("Congratulation! You survived");
                    } else {
                        System.out.println("You entered incorrect response. Bye!");
                    }
                }
            } else if (first.equalsIgnoreCase("couch")) {
                System.out.println("I see, you just want to relax. Do you want to look out the (window) or star to (eat) while sitting? ");
                String couch = input.nextLine();
                if (couch.equalsIgnoreCase("window") || couch.equalsIgnoreCase("eat")) {
                    System.out.println("Congratulation! You survived");
                } else {
                    System.out.println("You entered incorrect response. Bye!");
                }
            }

        } else if (user.equalsIgnoreCase("Basement")) {
            System.out.println("I am glad you chose the basement. Do you want to turn (on) the lights or be adventurous and walk in the (dark)? ");
            String basement = input.nextLine();
            if (basement.equalsIgnoreCase("on")) {
                System.out.println("Wise choise. Safety comes first. Do you want to turn the laundary (on) to see if it works" +
                        " or you want to turn (off) the lights and head back? ");
                String on = input.nextLine();

                if (on.equalsIgnoreCase("on") || on.equalsIgnoreCase("off")) {
                    System.out.println("Congratulation! You survived");
                } else {
                    System.out.println("You entered incorrect response. Bye!");
                }

            } else if (basement.equalsIgnoreCase("dark")) {
                System.out.println("You are quite the adventurous! Still in the dark You can either Open a (chest) or open a (closet) ");
                String dark = input.nextLine();
                if (dark.equalsIgnoreCase("chest") || dark.equalsIgnoreCase("closet")) {
                    System.out.println("Congratulation! You survived.");
                    String bed = input.nextLine();
                } else {
                    System.out.println("You entered incorrect response. Bye!");
                }
            } else {
                System.out.println("You enter an invalid choice. Bye!");
            }


        }
    }
}
