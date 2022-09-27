public class Item {
    private int id ;
    private String name ;
    private  int price ;
    private  String description ;
    
    public Item(int id, String name, int price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}
