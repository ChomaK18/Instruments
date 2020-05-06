package Zadanie;

import Zadanie.Instruments.*;

public class Polymorphism {

    public static void main(String[] args) {
        AbstractInstrument orchestra1 = new Bass(4, "Ibanez", EColor.BLACK);
        AbstractInstrument orchestra2 = new Guitar(5, "Fender", EColor.RED);
        AbstractInstrument orchestra3 = new Percussion("Kugo", EColor.YELLOW);
        AbstractInstrument orchestra4 = new Piano("YAHAMA", EColor.WHITE);

        AbstractInstrument[] orchestra = {orchestra1, orchestra2, orchestra3, orchestra4};

        for (AbstractInstrument o: orchestra){
            System.out.println(o);
            System.out.print("Instrument plays: ");
            o.playMusic();
            System.out.print("Song: ");
            o.playSong();
        }


    }
}
