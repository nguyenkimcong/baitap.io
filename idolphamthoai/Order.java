public class Order {
    private Integer id ;
    private String customerName ;
    private String phone ;
    private String email ;
    public Order(Integer id, String customerName, String phone, String email) {
        this.id = id;
        this.customerName = customerName;
        this.phone = phone;
        this.email = email;
    }
    public Order(int i, int id2, int quantity, String now, Item item3) {
    }
    public Integer getId() {
        return id;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
