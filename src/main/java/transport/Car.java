package transport;

public class Car extends Transport {

    public Car() {
    }

    @Override
    public void readyToWork() {
        System.out.println(TypeTransport.CAR + " готов к работе");
    }

    @Override
    public TypeTransport getType() {
        return TypeTransport.CAR;
    }
}