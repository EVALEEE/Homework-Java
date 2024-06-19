package comp1110.homework.O01;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 22/2/2024 9:45 pm
 */
public class BMI {
    public static void main(String[] args) {
        BMI bob = new BMI("bob", 1.0, 1.0);
        bob.getBMI();
        System.out.println(bob);
    }

    private String name;
    private double height;
    private double weight;
    private double BMI;

    public BMI(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBMI() {
        //returns a double reflecting the person's BMI (Body Mass Index = weight (kg) / height2 (m2) )
        BMI = weight / (height * height);
        return BMI;
    }

    @Override
    public String toString() {
        //Fred is 1.9m tall and is 87.0Kg and has a BMI of 24.099722991689752Kg/m^2
        return name + " is " + height + "m tall and is " +
                weight + "Kg and has a BMI of " + getBMI() + "Kg/m^2";
    }
}

