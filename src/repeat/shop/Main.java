package repeat.shop;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(10, 20);
        System.out.println(room1);
        int square1 = room1.calcSquare();
        System.out.println("Square of the room1 is " + square1);

        Room room2 = new Room(15, 16);
        System.out.println(room2);
        int square2 = room2.calcSquare();
        System.out.println("Square of the room2 is " + square2);

        System.out.println(room1);
    }

}
