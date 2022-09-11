package org.roshan.com504.ood;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Dog d1 = new Dog("Scooby");
        Dog d2 = new Dog("Tommy");

        Cat c1 = new Cat("Garfield");
        Cat c2 = new Cat("Tom");

        Horse h1 = new Horse("Trigger");
        Horse h2 = new Horse("Daisy");

        Animal[] animals = new Animal[6];
        animals[0] = d1;
        animals[1] = d2;
        animals[2] = c1;
        animals[3] = c2;
        animals[4] = h1;
        animals[5] = h2;

        for (int i = 0; i < animals.length; i++)
        {
            System.out.println(animals[i].getName() + " says " + animals[i].sound());
        }
    }
}
