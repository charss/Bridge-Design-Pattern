// REFINED ABSTRACTION

public class Letters extends List {

    public Letters(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void go_count() {
        implementor.occurence();
    }

    
}
