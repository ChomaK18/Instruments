package Zadanie;

import Zadanie.Instruments.*;

import java.util.Random;

public class LateBinding {

    public static void main(String[] args) {
        AbstractInstrument [] instruments = new AbstractInstrument[8];
        Random random = new Random();

        int i = 0;
        while (i<instruments.length){

            int randomNmber = random.nextInt(4);
            switch (randomNmber){
                case 0:
                    instruments[i]=new Bass(4, "Ibanez", EColor.BLACK);
                    break;
                case 1:
                    instruments[i]=new Guitar(5, "Fender", EColor.RED);
                    break;
                case 2:
                    instruments[i] = new Percussion("Kugo", EColor.YELLOW);
                    break;
                case 3:
                    instruments[i]= new Piano("YAHAMA", EColor.WHITE);
                    break;
            }
            i++;
        }
        for (int j=0; j<instruments.length;j++){
            System.out.println(instruments[j]);
            System.out.print("Instrument plays: ");
            instruments[j].playMusic();
            System.out.print("Song: ");
            instruments[j].playSong();
            System.out.println();
        }
        for (int j=0; j<instruments.length;j++) {
            System.out.println(instruments[j]);
        }
    }
}
