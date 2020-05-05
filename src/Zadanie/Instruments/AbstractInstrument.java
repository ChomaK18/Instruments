package Zadanie.Instruments;


import Zadanie.EColor;

public abstract class AbstractInstrument {


    protected EColor color;

    protected String producer;

    public AbstractInstrument(String producer, EColor color){
        this.producer = producer;
        this.color = color;
    }


    public EColor getColor() {
        return color;
    }

    public void setColor(EColor color) {
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public abstract void playMusic();

    public abstract void playSong();

}
