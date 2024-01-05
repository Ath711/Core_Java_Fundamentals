public class Box {

    // using Object class which will not provide type saftey
    private Object container;

    public Box(Object container) {
        this.container = container;
    }

    public void getContainer(){
        System.out.println(container);
    }

    public void setContainer(Object container) {
        this.container = container;
    }

}
