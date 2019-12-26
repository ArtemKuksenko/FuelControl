package FuelControl;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.ArrayList;

@JsonAutoDetect

public class Car {
    private String model;
    private int year;
    private float motorVolume;
    private int mileageStart;
    private String number;
    public ArrayList<Integer> money = new ArrayList<Integer>();
    public ArrayList<Float> liter = new ArrayList<Float>();
    public ArrayList<Integer> mileage = new ArrayList<Integer>();
    Car() { }

    public float getMotorVolume() {
        return motorVolume;
    }

    public void setMotorVolume(float motorVolume) {
        this.motorVolume = motorVolume;
    }

    public int getMileageStart() {
        return mileageStart;
    }

    public void setMileageStart(int mileageStart) {
        this.mileageStart = mileageStart;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

