// MAIN PROGRAM

public class App {
    public static void main(String[] args) throws Exception {
        Implementor letterCounter = new LetterCounter();
        List lettersList = new Letters(letterCounter);
        lettersList.go_count();

        Implementor numberCounter = new NumberCounter();
        List numberList = new Letters(numberCounter);
        numberList.go_count();
        
    }
}