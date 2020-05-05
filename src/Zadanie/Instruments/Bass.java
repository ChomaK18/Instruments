package Zadanie.Instruments;

import Zadanie.EColor;

public class Bass extends Guitar {

    public Bass (int ileStrun, String producer, EColor color){
        super(ileStrun, producer, color);
    }

    @Override
    public void playMusic() {
        System.out.println("PianoSolo");
    }

    @Override
    public void playSong() {
        System.out.println("Can't stop");
    }

    @Override
    public String toString() {
        return "Bass{" +
                "color=" + color +
                ", producer='" + producer + '\'' +
                '}';
    }
}
