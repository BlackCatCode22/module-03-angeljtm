public class Dog {
    private static int dogCount = 0;

    public static int getDogCount(){
        return dogCount;
    }
    public Dog(){
        dogCount++;
    }

    String name;
    int age;
    String speak = "WOOF";
    String breed;
    String colorFur;
    String colorEyes;
    String sex;

    String getDogInfo(){
        System.out.println("-----------------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Sex: " + this.sex);
        System.out.println("Breed: " + this.breed);
        System.out.println("Fur Color: " + this.colorFur);
        System.out.println("Eye Color: " + this.colorEyes);
        System.out.println("-----------------------------------------");
        return null;
    }
}
