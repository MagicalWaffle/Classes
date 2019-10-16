package Wall;

public class Main {

    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("Area = "+ wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("Height of the wall = "+wall.getHeight());
        System.out.println("Width of the wall = "+wall.getWidth());
        System.out.println("Area = "+ wall.getArea());


    }
}
