package Interfaces;

import java.util.Random;

public class Main {

    public static void main(String []args){

        Dog d = new Dog();
        Cat c = new Cat();


        if(c instanceof Pet){
            c.play();
        }

        if(d instanceof Pet){
            d.play();
        }

        Pet p;

        Random random = new Random();
        int n = random.nextInt(2);

        if(n==0){
            p=new Cat();
        }
        else {
            p=new Dog();
        }
        p.play();
    }


}
