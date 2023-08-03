import java.time.LocalDate;
import java.util.ArrayList;

public class VIP_Order extends Order {



    private int discount = 0;

    public VIP_Order(int id, String name, String deliveryAddress, Customer orderCustomer, PaymentType paymentType, LocalDate orderDate, int discount,ArrayList<Item> listOfItems) {
        super(id, name, deliveryAddress, orderCustomer, paymentType, orderDate,listOfItems);
        this.discount = discount;

    }

    @Override
    protected double calculateTotalPrice(ArrayList<Item> listOfItems) {
        double totalPrice = 0;
        for (Item item : listOfItems) {
            totalPrice += item.getItemPrice();
        }

        totalPrice = totalPrice - discount;

        if (totalPrice < 0)
            totalPrice = 0;

        return totalPrice;
    }
}
