package virtual_pet;

public class VirtualPet {
    int hunger;
    int thirst;
    int energy;
    String name ;
    int hungerAmount = 0;

    public VirtualPet (String name, int hunger, int thirst, int energy){
        this.name   = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.energy = energy;
    }
    //VirtualPet myVirtualPet = new VirtualPet("Gunner", 30, 40, 10);
    public void petHungerDisplay(){
        System.out.println("Hunger " + getHunger());
    }
    public int getHunger() {
        hunger -= 5;
        return hunger;
    }

    public int getThirst() {
        thirst -=2;
    return thirst;
    }

    public int getEnergy() {
        energy -=1;
    return energy;
    }


    public void giveFoodToPet (int hunger){
        hunger += hungerAmount;
    }
    public void giveWaterToPet (int thirstAmount){
        hunger += thirstAmount;
    }

    public void restPet (int energyAmount){
        energy += energyAmount;

    }



}
