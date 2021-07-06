// ABSTRACTION

public abstract class List {
    Implementor implementor;
    public List(Implementor implementor) {
        this.implementor = implementor;
    }
        abstract public void go_count();
    
}
