public class Example {
    public static void main(String[] args) {
        

        Box box = new Box(100);
        box.setContainer("String 100");
        Box box1 = new Box("boxContainer");

        box.getContainer();
        box1.getContainer();

        System.out.println();
        // this is not type safe if we use Object class
        // as we can provide objects with any type data without error.
        // hence we need to use Genereics

        GenericBox<Integer> genericBox = new GenericBox<>(100);
        genericBox.getAnotherContainer();
        // bAnotherBox.setAnotherContainer("hello"); will not work: String cannot be converted to Integer

    }
}
