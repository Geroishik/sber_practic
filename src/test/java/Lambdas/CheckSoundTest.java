package Lambdas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckSoundTest {

    @Test
    void testingSounding() {
        CheckSound checkSound = new CheckSound();
        checkSound.printSoundInCycle();
        Sounding bee = new Sounding() {
            @Override
            public void sound() {
                System.out.println("buzz");
            }
        };
        checkSound.addInSoundingList(bee);
        checkSound.printSoundInCycle();

        checkSound.addInSoundingList(() -> System.out.println("moo"));
        checkSound.printSoundInCycle();

        checkSound.addInSoundingList(Duck::quack);
        checkSound.printSoundInCycle();

        checkSound.printSoundForEach();
    }
}