package FacadePattern.exercise.codegym;

public class Main {

    public static void main(String[] args) {
        RandomListFacade facade = new RandomListFacade();

        facade.printRandomEvenList(15, 1, 50);
    }
}
