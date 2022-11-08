package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    VirtualPet underTest = new VirtualPet("",50,50,50);

    @Test
    public void shouldHaveADefaultHungerOf50() {

        int actualHunger = underTest.getHunger();
        assertEquals(50, actualHunger);
    }

    @Test
    public void shouldHaveADefaultThirstOf50() {

        int actualThirst = underTest.getThirst();
        assertEquals(50, actualThirst);
    }

    @Test
    public void shouldHaveADefaultEnergyOf50() {

        int actualEnergy = underTest.getEnergy();
        assertEquals(50, actualEnergy);
    }



}
