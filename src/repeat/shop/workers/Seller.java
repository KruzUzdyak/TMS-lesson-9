package repeat.shop.workers;

public class Seller extends AbstractWorker {

    public Seller(int salary) {
        super(salary);
    }

    @Override
    public void goWork(int hours) {
        System.out.println("Seller works for " + hours + " hours");
    }
}
