package transport;

public abstract class Transport {

    public Transport() {
    }

    abstract void readyToWork();
    abstract TypeTransport getType();

}