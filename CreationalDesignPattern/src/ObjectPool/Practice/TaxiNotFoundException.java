package ObjectPool.Practice;

public class TaxiNotFoundException extends RuntimeException {

    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}