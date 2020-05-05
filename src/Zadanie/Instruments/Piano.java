package Zadanie.Instruments;

import Zadanie.EColor;

public class Piano extends AbstractInstrument {

    public Piano (String producer, EColor color){
        super(producer, color);
    }

    @Override
    public void playMusic() {
        System.out.println("PianoSolo");
    }

    @Override
    public void playSong() {
        System.out.println("Scientist");
    }

    @Override
    public String toString() {
        return "Piano{" +
                "color=" + color +
                ", producer='" + producer + '\'' +
                '}';
    }
}
