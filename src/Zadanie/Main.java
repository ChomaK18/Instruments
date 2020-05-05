package Zadanie;

import Zadanie.Instruments.Bass;
import Zadanie.Instruments.Guitar;
import Zadanie.Instruments.Percussion;
import Zadanie.Instruments.Piano;


public class Main {

    public static void main(String[] args) {

        Guitar guitar = new Guitar(5, "Fender", EColor.RED);
        System.out.println(guitar);
        System.out.print("Guitar plays: ");
        guitar.playMusic();
        System.out.print("Song: ");
        guitar.playSong();

        Bass bass = new Bass (4, "Ibanez", EColor.WHITE);
        System.out.println(bass);
        System.out.print("Bass plays: ");
        bass.playMusic();
        System.out.print("Song: ");
        bass.playSong();

        Percussion percussion = new Percussion ( "Kugo", EColor.YELLOW);
        System.out.println(percussion);
        System.out.print("Percussion plays: ");
        bass.playMusic();
        System.out.print("Song: ");
        percussion.playSong();

        Piano piano = new Piano ("Yamaha", EColor.BLACK);
        System.out.println(piano);
        System.out.print("Piano plays: ");
        bass.playMusic();
        System.out.print("Song: ");
        piano.playSong();

    }
}
