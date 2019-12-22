package FuelControl;

public class NewCarModel {
    private String model = "кря кря";
    public void NewCarModel(String model, int year, float motorVolume, int mileageStart){
        this.model = model;
        System.out.println(year);
        System.out.println(motorVolume);
        System.out.println(mileageStart);
    }
    public String Hello() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

}
