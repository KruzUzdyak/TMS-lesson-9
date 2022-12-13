package repeat.shop;

import repeat.shop.workers.CEO;
import repeat.shop.workers.Seller;
import repeat.shop.workers.WorkerInterface;

public class WorkerMain {

    public static void main(String[] args) {
        WorkerInterface ceo = new CEO(9000);
        ceo.goWork(12);
        ceo.takeSalary();
        ceo.currentTime();

        WorkerInterface seller1 = new Seller(1000);
        seller1.goWork(10);
        seller1.takeSalary();
        seller1.currentTime();
    }
}
