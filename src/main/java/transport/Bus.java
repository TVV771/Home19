package transport;

public class Bus extends Transport {

    public Bus() {
    }

    @Override
    public void readyToWork() {
        System.out.println(TypeTransport.BUS + " готов к работе");
    }

    @Override
    public TypeTransport getType() {
        return TypeTransport.BUS;
    }
}