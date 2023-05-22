package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import transport.*;

@Configuration
public class AppConfig {

    @Bean
    public Car getCarBean() {
        return new Car();
    }

    @Bean
    public Bus getBusBean() {
        return new Bus();
    }

    @Bean
    public Pickup getPickupBean() {
        return new Pickup();
    }

    @Bean("driverCar")
    public Driver getDriverCar() {
        return new Driver(getCarBean());
    }

    @Bean("driverBus")
    public Driver getDriverBus() {
        return new Driver(getBusBean());
    }

    @Bean("driverPickup")
    public Driver getDriverPickup() {
        return new Driver(getPickupBean());
    }
}