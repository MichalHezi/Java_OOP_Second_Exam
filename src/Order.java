import java.time.LocalDate;
import java.util.ArrayList;

public  abstract class Order {

    private int id;
    private String name;
    private String deliveryAddress;
    private ArrayList<Item> listOfItems;
    private Customer orderCustomer;
    private PaymentType paymentType;
    private LocalDate orderDate;
    private double totalPrice;


    public Order(int id, String name, String deliveryAddress, Customer orderCustomer, PaymentType paymentType, LocalDate orderDate, ArrayList<Item> listOfItems) {
        this.id = id;
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.listOfItems = listOfItems;
        this.orderCustomer = orderCustomer;
        this.paymentType = paymentType;
        this.orderDate = orderDate;

    }

    protected abstract double calculateTotalPrice(ArrayList<Item> listOfItems);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public ArrayList<Item> getListOfItemsInOrder() {
        return listOfItems;
    }

    public void setListOfItemsInOrder(ArrayList<Item> item) {
        this.listOfItems = item;
    }

    public Customer getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(Customer orderCustomer) {
        this.orderCustomer = orderCustomer;
    }


    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalPrice() {
        return calculateTotalPrice(listOfItems);
    }
}
