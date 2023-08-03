import java.time.LocalDate;
import java.util.ArrayList;

public class RegularOrder extends Order{

    public RegularOrder(int id, String name, String deliveryAddress, Customer orderCustomer, PaymentType paymentType, LocalDate orderDate,ArrayList<Item> listOfItems) {
        super(id, name, deliveryAddress, orderCustomer, paymentType, orderDate, listOfItems);
    }

    @Override
    protected double calculateTotalPrice(ArrayList<Item> listOfItems) {
        double totalPrice = 0;
        for (Item item : listOfItems) {
            totalPrice += item.getItemPrice();
        }

        if (totalPrice < 0)
            totalPrice = 0;

        return totalPrice;
    }
}
