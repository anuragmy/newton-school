//import java.lang.reflect.Constructor;

public class Animals {

    String name = "animal";
    int age = 11;

    Animals(String Name, int Age) {
        this.name = Name;
        this.age = Age;
    }

    public void speak() {
        System.out.println(" it can speak");
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getName() {
        System.out.println("Name of animal is:" + this.name);
    }

    public void getAge() {
        System.out.println("Age of animal is:" + this.age);
    }

}
