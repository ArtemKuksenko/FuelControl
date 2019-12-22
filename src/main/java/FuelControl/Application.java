package FuelControl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//https://spring-projects.ru/guides/rest-service/

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

//
//        Cars cars = new Cars();
//        cars.addCar("taz",2006,1,110000,"o000oo123");
//        cars.addFuel("o000oo123",500,10,110100);
//        cars.addFuel("o000oo123",500,10,110200);
//        cars.addFuel("o000oo123",500,10,110300);
//        System.out.println("Расход");
//        System.out.println(cars.calcFuelСonsumption("o000oo123"));
//
//        ObjectMapper mapper = new ObjectMapper();
//        StringWriter writer = new StringWriter();
//        try {
//            mapper.writeValue(writer, cars.getCar("o000oo123"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String result = writer.toString();
//        System.out.println(result);
//
//        FileWork file= new FileWork();
//        try {
//            file.writeFile("o000oo123",result);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        result = file.readFile("o000oo123");
//
//        StringReader reader = new StringReader(result);
//        try {
//            Car car2 = mapper.readValue(reader, Car.class);
//            System.out.println("car2");
//            System.out.println(car2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}