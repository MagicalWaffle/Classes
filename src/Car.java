public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    //We use get methods to access/read the private variables from the other class
    // by the other class I mean the class that we acces the instance of the class
    // in this example we will use the Main.java class
    // by calling the methods. So for example the method getDoors(){ returns the variable doors that is private.

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }


    //We use the set methods to assign a value to the private variables from the other class
    // by the other class I mean the class that we acces the instance of the class
    // in this example we will use the Main.java class
    // by calling the methods. So for example the method setDoors(int doors){this.doors=doors;}
    // the method accepts a parameter and it assign to the private variable(doors).
    // the set methods are void methods because they don't return anything
    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("audi") || validModel.equals("nisan")) {
            this.model = model;
        }
        else {
            this.model= "Unknown";
        }
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
