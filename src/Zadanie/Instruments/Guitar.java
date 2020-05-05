package Zadanie.Instruments;

import Zadanie.EColor;

public class Guitar extends AbstractInstrument {

    public int ileStrun;

    public Guitar (int ileStrun, String producer, EColor color){
        super(producer, color);
        this.ileStrun = ileStrun;
    }

    public int getIleStrun() {
        return ileStrun;
    }

    public void setIleStrun(int ileStrun) {
        this.ileStrun = ileStrun;
    }

    @Override
    public void playMusic() {
        System.out.println("GuiatrSolo");
    }

    @Override
    public void playSong() {
        System.out.println("American Idiot");
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "ileStrun=" + ileStrun +
                ", color=" + color +
                ", producer='" + producer + '\'' +
                '}';
    }
}
