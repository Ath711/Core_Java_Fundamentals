public class GenericBox<T> {
    
    private T anotherContainer;

    public void getAnotherContainer() {
        System.out.println(anotherContainer);
    }

    public void setAnotherContainer(T anotherContainer) {
        this.anotherContainer = anotherContainer;
    }

    public GenericBox(T anotherContainer) {
        this.anotherContainer = anotherContainer;
    }

    
    
}
