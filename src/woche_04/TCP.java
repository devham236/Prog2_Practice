package woche_04;

public class TCP extends Packet {
    private String id;

    public TCP(int s, String id){
        super(s);
        this.id = id;
    }

    @Override
    public double calcTransmissionDuration(){
        return super.calcTransmissionDuration() + 50;
    }

    public String getId(){
        return this.id;
    }

}
