public class Cat {

    String name;
    int age;
    String speak = "meow";
    String colorFur;
    String colorEyes;
    String sex;

    String getCatInfo(){
        System.out.println("-----------------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Sex: " + this.sex);
        System.out.println("Fur Color: " + this.colorFur);
        System.out.println("Eye Color: " + this.colorEyes);
        System.out.println("-----------------------------------------");
    return null;
    }

    private static int catCount = 0;
    public Cat(){
        catCount++;
    }

    public static int getCatCount(){
        return catCount;
    }
}
