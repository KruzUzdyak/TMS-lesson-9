package repeat.shop;

public class Room {

    public static int numberOfRooms = 0;
    public final static int HEIGHT = 3;

    private final int wall1;
    private final int wall2;

    public Room(int a, int b) {
        this.wall1 = a;
        this.wall2 = b;
        numberOfRooms++;
    }

    // wrong!
//    public Room(int a, int b, int h) {
//        this.wall1 = a;
//        this.wall2 = b;
//        HEIGHT = h;
//    }

    public int getWall1() {
        return wall1;
    }

    public int getWall2() {
        return wall2;
    }

    public int calcSquare() {
        return wall1 * wall2;
    }

    public int calcVolume() {
        return HEIGHT * wall1 * wall2;
    }

    @Override
    public String toString() {
        return "Room{" +
                "wall1=" + wall1 +
                ", wall2=" + wall2 +
                ", height=" + HEIGHT +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }
}
