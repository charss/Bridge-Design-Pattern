// REFINED ASBTRACTION

public class Number extends List {
    public Number(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void go_count() {
        implementor.occurence();
    }
    
}
