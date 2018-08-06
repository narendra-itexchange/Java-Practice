package Inheritance;

public class Insect {

    int age;
    int noOfLegs;

    public Insect(int age,int noOfLegs){
        this.age = age;

        this.noOfLegs = noOfLegs;
    }

    public void says(){

        System.out.println("....");
    }

    public void crawl(){

        System.out.println("The insect is crawled...");
    }
}
