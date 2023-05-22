package transport;

public class Pickup extends Transport {

    public Pickup() {
    }

    @Override
    public void readyToWork() {
        System.out.println(TypeTransport.PICKUP + " готов к работе");
    }

    @Override
    public TypeTransport getType() {
        return TypeTransport.PICKUP;
    }
}