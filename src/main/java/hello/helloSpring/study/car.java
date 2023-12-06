package hello.helloSpring.study;

import org.springframework.context.annotation.Profile;

public class car {
    // 클래스는 상태와 행위를 가질 수 있다.

    public car(){
        // 생성자(객체 생성하기 위해 필요)
    }
    int speed;
    int distance;
    String color;
    // 클래스(car)에 대한 상태

    public void speedUp(){
        // 클래스에 대한 행위
        speed = speed+5;
    }

    public void breakDown(){
        // 클래스에 대한 행위
        speed=speed-10;
    }

    public int getCurrentspeed(){
        return speed;
    }

    public class CarManager{
        public static void main(String [] args){
            car dogCar = new car();
            car cowCar = new car();
            cowCar.speedUp();

        }
    }


    // 연습 문제

    public class Profile{
        String name;
        int age;

        public void main(String[] args){
            Profile profile = new Profile();
            profile.setName("Min");
            profile.setAge(20);
            profile.printName();
            profile.printAge();


        }

        public void printName(){
            System.out.println("My name is"+name);
        }

        public void printAge(){
            System.out.println("My age is"+age);
        }

        public void setName(String str){
            name= str;
        }

        public void setAge(int val){
            age = val;
        }


    }


}
