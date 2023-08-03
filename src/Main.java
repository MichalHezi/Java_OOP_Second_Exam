import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(1,"Michal","Hezi","michalhezi2@gmail.com","meir gershon 9/1, jerusalem",CustomerType.REGULAR);
        System.out.println(customer1.getLastname());

        ArrayList<Item> listOfItems = new ArrayList<Item>(Arrays.asList(new Item(1,"a",50),
                new Item(1,"a",20)));

        Order regularOrder = new RegularOrder(1, "Moshe", "Hezi",customer1,
                PaymentType.CHECK,LocalDate.of(2023, 9, 13),listOfItems);

        Order vipOrder = new VIP_Order(1, "Moshe", "Hezi",customer1,
                PaymentType.CHECK,LocalDate.of(2023, 9, 13),20, listOfItems);

        System.out.println("regular order price: " + regularOrder.getTotalPrice());
        System.out.println("vip order price: " + vipOrder.getTotalPrice());

    }
}