package FacadePattern.exercise.codegym;

import java.util.List;

public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade() {
        this.randomList = new RandomList();
        this.listFilter = new ListFilter();
        this.listPrinter = new ListPrinter();
    }

    public void printRandomEvenList(int size, int min, int max) {
        List<Integer> rawList = randomList.generateList(size, min, max);
        System.out.println("Đã tạo danh sách ngẫu nhiên: " + rawList);

        List<Integer> evenList = listFilter.filterOdd(rawList);

        listPrinter.printList(evenList);
    }
}
