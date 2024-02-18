import java.util.ArrayList;

public class Stuff {
    //my stuff class is going to be based on a room
    boolean lightsOn; //if lights are on or not
    boolean fanOn;
    int numOfBeds;

    String bedSize;

    String bedRoomOwner;

    ArrayList<String> closet = new ArrayList<String>();

    public void addClothes(String newClothingItem) // method to add books to the array
    {
        this.closet.add(newClothingItem);
    }



    ArrayList<String> bookShelf = new ArrayList<String>();  //Books in your room

    public void addBook(String newBook) // method to add books to the array
    {
        this.bookShelf.add(newBook);
    }

}
