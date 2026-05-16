package woche_04.aufgabe_08;

public class Packet {
    protected int size;

    public Packet(int s){
        this.size = s;
    }

    public int getSize(){
        return this.size;
    }

    public double calcTransmissionDuration(){
        return this.size / 10.0;
    }
}
