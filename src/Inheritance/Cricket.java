package Inheritance;

public class Cricket extends Insect {

    double length;

    public Cricket(int age, double length){
        super(age,6);
        this.length = length;

    }

    public void says(){
        System.out.println("CHRIP...");
    }

}
