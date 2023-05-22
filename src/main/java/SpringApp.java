import configuration.AppConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import transport.*;

public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean(Car.class);
        Bus bus = context.getBean(Bus.class);
        Pickup pickup = context.getBean(Pickup.class);
        car.readyToWork();
        bus.readyToWork();
        pickup.readyToWork();
        Driver driver1 = context.getBean("driverCar", Driver.class);
        Driver driver2 = context.getBean("driverBus", Driver.class);
        Driver driver3 = context.getBean("driverPickup", Driver.class);
        driver1.manageTransport();
        driver2.manageTransport();
        driver3.manageTransport();
    }
}