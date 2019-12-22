package FuelControl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

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

    void deleteCar(Car car) {
        File file = new File(car.getNumber());
        assertEquals(true, file.delete());
    }

    @Test
    void addCar() {
        Car testCar = this.createTetstCar();
        String result = this.carsController.addCar(testCar);
        assertEquals(result,"{\"status\":\"ok\"}");
        result = this.carsController.addCar(testCar);
        assertEquals(result,"{\"status\":\"error\",\"error\":\"this car is registrated\"}");
        this.deleteCar(testCar);
    }

    @Test
    void addCheck() {
        Car testCar = this.createTetstCar();

        this.carsController.addCar(testCar);

        for(int i = 1; i < 3; i++){
            int milage = testCar.getMileageStart() + i*100;
            CheckModel check = this.createTestCheck(10,milage,500);
            this.carsController.addCheck(check);
            testCar.mileage.add( milage );
            testCar.liter.add((float) 10);
            testCar.money.add(500);
        }

        Object result = this.carsController.getHistory( testCar.getNumber() );

        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();

        String r1 = "";
        String r2 = " ";

        try {
            mapper.writeValue(writer, result);
            r1 = writer.toString();
            writer = new StringWriter();
            mapper.writeValue(writer, result);
            r2 = writer.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(r1, r2);
        this.deleteCar(testCar);
    }

    @Test
    void getHistory() {

    }

    @Test
    void fuelConsumption() {
    }
}