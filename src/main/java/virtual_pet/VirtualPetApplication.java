package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPet myVirtualPet = new VirtualPet("Gunner", 30, 40, 10);

        System.out.println("Name: " + myVirtualPet.name);
        System.out.println("Hunger: " + myVirtualPet.hunger);
        System.out.println("Thirst: " + myVirtualPet.thirst );
        System.out.println("Energy; " + myVirtualPet.energy);
        System.out.println();
        System.out.println("To play with " + myVirtualPet.name + " Press 1");
        System.out.println("To give water to " + myVirtualPet.name + " Press 2");
        System.out.println("To allow " + myVirtualPet.name + " to rest Press 3");
        System.out.println("To close Press 4");

        String userChoice = input.nextLine();
        while (!userChoice.equals("4")) {

            if (userChoice.equals("1")) {
                System.out.println("You fed " + myVirtualPet.name);
                myVirtualPet.giveFoodToPet(5);
                myVirtualPet.giveWaterToPet(0);
                myVirtualPet.restPet(1);
                System.out.println("Hunger: " + myVirtualPet.getHunger());
                System.out.println("Thirst: " + myVirtualPet.getThirst());
                System.out.println("Energy: " + myVirtualPet.getEnergy());
                System.out.println();
                System.out.println("To feed " + myVirtualPet.name + " Press 1");
                System.out.println("To give water to " + myVirtualPet.name + " Press 2");
                System.out.println("To allow " + myVirtualPet.name + " to rest Press 3");
                System.out.println("To close Press 4");
            }
            else if (userChoice.equals("2")){
                System.out.println("Gave water to " + myVirtualPet.name);
                myVirtualPet.giveFoodToPet(0);
                myVirtualPet.giveWaterToPet(7);
                myVirtualPet.restPet(1);
                System.out.println("Hunger: " + myVirtualPet.getHunger());
                System.out.println("Thirst: " + myVirtualPet.getThirst());
                System.out.println("Energy: " + myVirtualPet.getEnergy());
                System.out.println();
                System.out.println("To feed " + myVirtualPet.name + " Press 1");
                System.out.println("To give water to " + myVirtualPet.name + " Press 2");
                System.out.println("To allow " + myVirtualPet.name + " to rest Press 3");
                System.out.println("To close Press 4");
            }
            else if (userChoice.equals("3")){
                System.out.println("Allowing " + myVirtualPet.name + " to rest");
                myVirtualPet.giveFoodToPet(0);
                myVirtualPet.giveWaterToPet(0);
                myVirtualPet.restPet(1);
                System.out.println("Hunger: " + myVirtualPet.getHunger());
                System.out.println("Thirst: " + myVirtualPet.getThirst());
                System.out.println("Energy: " + myVirtualPet.getEnergy());
                System.out.println();
                System.out.println("To feed " + myVirtualPet.name + " Press 1");
                System.out.println("To give water to " + myVirtualPet.name + " Press 2");
                System.out.println("To allow " + myVirtualPet.name + " to rest Press 3");
                System.out.println("To close Press 4");
            }
            userChoice = input.nextLine();
        }

    }
}
