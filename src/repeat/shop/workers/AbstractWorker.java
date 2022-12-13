package repeat.shop.workers;

public abstract class AbstractWorker implements WorkerInterface {

    protected int salary;

    public AbstractWorker(int salary) {
        this.salary = salary;
    }

    @Override
    public void takeSalary() {
        System.out.println("Salary = " + salary + " \\o/");
    }
}
