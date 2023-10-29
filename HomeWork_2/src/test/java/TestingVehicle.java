import seminars.second.hw.Car;
import seminars.second.hw.Motorcycle;
import seminars.second.hw.Vehicle;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TestingVehicle {
    private Car car = new Car("Hyundai", "Solaris", 2011);
    private Motorcycle motorcycle = new Motorcycle("Honda", "CBR400", 2010);

    @Test
    public void isCarInstanceOfVehicle(){
        assertThat(this.car).isInstanceOf(Vehicle.class);
    }

    @Test
    public void carWithFourWheels(){
        assertThat(this.car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void motorcycleWithTwoWheels(){
        assertThat(this.motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void carSpeedTest(){
        this.car.testDrive();
        assertThat(this.car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void motorcycleSpeedTest(){
        this.motorcycle.testDrive();
        assertThat(this.motorcycle.getSpeed()).isEqualTo(75);
    }
    @Test
    public void carDriveParkTest(){
        this.car.testDrive();
        this.car.park();
        assertThat(this.car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void motorcycleDriveParkTest(){
        this.motorcycle.testDrive();
        this.motorcycle.park();
        assertThat(this.motorcycle.getSpeed()).isEqualTo(0);
    }
}
