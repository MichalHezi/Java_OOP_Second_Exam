import java.util.ArrayList;

public class Customer implements Giftable{

    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String deliveryAddress;
    private CustomerType customerType;
    private double discount;
    private ArrayList<ListOfFavoriteItems>listOfFavoriteItems;
    private Giftable gift;

    public Customer(int id, String firstname, String lastname, String email, String deliveryAddress, CustomerType customerType) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;

        this.listOfFavoriteItems = new ArrayList<ListOfFavoriteItems>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }


    public ArrayList<ListOfFavoriteItems> getListOfFavoriteItems() {
        return listOfFavoriteItems;
    }

    public void setListOfFavoriteItems(ArrayList<ListOfFavoriteItems> listOfFavoriteItems) {
        this.listOfFavoriteItems = listOfFavoriteItems;
    }

    public Giftable getGift() {
        return gift;
    }

    public void setGift(Giftable gift) {
        this.gift = gift;
    }


    @Override
    public void activateGift() {

    }
}
