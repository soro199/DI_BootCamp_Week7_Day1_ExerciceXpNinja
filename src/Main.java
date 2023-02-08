
/*
*@author SORO
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Dog");
        Dog d = new Dog();
        d.bark();
        d.eat();

        System.out.println("*************");

        System.out.println("Cat");
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}
