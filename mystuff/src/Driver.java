
public class Driver {
    public static void main(String[] args) {
        Stuff myRoom = new Stuff();

        myRoom.addBook("Ikigai");
        myRoom.addBook("The Subtle Art of not giving a fuck");
        myRoom.addBook("Atomic Habits");
        myRoom.addBook("F*ck it, I'll start tomorrow");
        myRoom.addBook("HTML & CSS QuickStart Guide");
        myRoom.addBook("Cracking the Coding Interview");

        myRoom.addClothes("Blue shirt");
        myRoom.addClothes("White shirt");
        myRoom.addClothes("Black shirt");
        myRoom.addClothes("Blue Jeans");

        myRoom.bedRoomOwner = "Angel";
        myRoom.fanOn = false;
        myRoom.lightsOn =true;



        System.out.println("This room belongs to "+ myRoom.bedRoomOwner);
        System.out.println("My bookshelf contains the books " + myRoom.bookShelf);
        System.out.println("My closet has a "+ myRoom.closet);
    }
}
