package transport;

public class Driver {
    private String name;

    private Transport transport;

    public Driver(Transport transport) {
        this.transport = transport;
    }

    public void manageTransport() {
        System.out.println("Водитель управляет типом транспорта " + transport.getType());
    }

}