public class Animal {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.name = "Gedeon";
        myCat.age = 19;
        myCat.colorFur = "Orange";
        myCat.colorEyes = "Blue";
        myCat.sex = "Male";
        myCat.getCatInfo();

        Dog myDog = new Dog();
        myDog.name = "Princess";
        myDog.age = 19;
        myDog.breed = "Pitbull";
        myDog.colorFur = "White";
        myDog.colorEyes = "Black";
        myDog.sex = "Female";
        myDog.getDogInfo();


        int totalAnimals = Cat.getCatCount() + Dog.getDogCount();

        if (totalAnimals == 1 ){
            System.out.println("You have created 1 animal.");
        } else if (totalAnimals <= 0) {
            System.out.println("You have created no animals.");
        } else {
            System.out.println("You have created " + totalAnimals + " animals.");
        }

    }
}
