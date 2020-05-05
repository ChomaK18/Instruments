package Zadanie.Instruments;

import Zadanie.EColor;

public class Percussion extends AbstractInstrument {

    public Percussion (String producer, EColor color){
        super(producer, color);
    }

    @Override
    public void playMusic() {
        System.out.println("DrumSolo");
    }

    @Override
    public void playSong() {
        System.out.println("Ba da bum tssss");
    }

    @Override
    public String toString() {
        return "Percussion{" +
                "color=" + color +
                ", producer='" + producer + '\'' +
                '}';
    }
}
