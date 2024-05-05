package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckSound {
    private List<Sounding> soundingList = new ArrayList<>(Arrays.asList(new Cat(), new Dog(), new Bear()));

    public void printSoundInCycle() {
        for (int i = 0; i < soundingList.size(); i++) {
            soundingList.get(i).sound();
        }
    }
    public void addInSoundingList(Sounding sounding){
        soundingList.add(sounding);
    }

    public void printSoundForEach(){
        soundingList.forEach(Sounding::sound);
    }
}
