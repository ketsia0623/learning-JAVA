public class firstObject {
    int integer;

    // Constructor
    public firstObject(int integer) {
        this.integer = integer;
    }

    // Entry point (must be static!)
    public static void main(String[] args) {
        firstObject newObject = new firstObject(0);
        System.out.println("Object created with integer: " + newObject.integer);
        //newObject = null;             //dereference by reassignment
    }
}
