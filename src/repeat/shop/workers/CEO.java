package repeat.shop.workers;

public class CEO extends AbstractWorker {

    public CEO(int salary) {
        super(salary);
    }

    @Override
    public void goWork(int hours) {
        System.out.println("Ceo comes to work on " + hours + "hours");
    }
}
