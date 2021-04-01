import java.util.Locale;

public class Car {
    //List below are variables/fields/member variables  pertaining to the car class, with access modifiers.
    //This variables can only be accessed within the class Car.
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //We want to create a method that updates the model

    public void setModel (String model){
        //Passing validations for the model
        String validModel = model.toLowerCase(Locale.ROOT);
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else{
            this.model = "unknown";
        }



    }

    //This is a method that returns the current model
    public String getModel(){
        return this.model;
    }

}
