package FuelControl;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

class CarsControllerTest {

    private  CarsController carsController = new CarsController();

    Car createTetstCar(){
        Car testCar = new Car();
        testCar.setModel("TestModel");
        testCar.setMileageStart(100000);
        testCar.setMotorVolume((float) 2.3);
        testCar.setYear(2007);
        testCar.setNumber("testNumber");
        return testCar;
    }

    CheckModel createTestCheck(float liter, int milage, int money){
        CheckModel check = new CheckModel();
        check.setNumber("testNumber");
        check.setLiter(liter);
        check.setMilage(milage);
        check.setMoney(money);
        return check;
    }

    @Test
    void addCar() {
        Car testCar = this.createTetstCar();
        String result = this.carsController.addCar(testCar);
        assertEquals(result,"{\"status\":\"ok\"}");
        result = this.carsController.addCar(testCar);
        assertEquals(result,"{\"status\":\"error\",\"error\":\"this car is registrated\"}");
        File file = new File(testCar.getNumber());
        assertEquals(true, file.delete());
    }

    @Test
    void addCheck() {
        Car testCar = this.createTetstCar();

        this.carsController.addCar(testCar);

        CheckModel check
        for
        CheckModel check1 = this.createTestCheck(10,100100,500);
        CheckModel check2 = this.createTestCheck(10,100200,500);
        CheckModel check3 = this.createTestCheck(10,100300,500);

        this.carsController.addCheck(check1);
        this.carsController.addCheck(check2);
        this.carsController.addCheck(check3);

        testCar.mileage.add( 100100 );
        testCar.mileage.add( 100200 );
        testCar.mileage.add( 100300 );
        testCar.liter.add((float) 10);
        testCar.liter.add((float) 10);
        testCar.liter.add((float) 10);
        testCar.money.add(500);
        testCar.money.add(500);
        testCar.money.add(500);

        Object result = this.carsController.getHistory( testCar.getNumber() );
        assertEquals(result, testCar);
        File file = new File(testCar.getNumber());
        assertEquals(true, file.delete());
    }

    @Test
    void getHistory() {
    }

    @Test
    void fuelConsumption() {
    }
}