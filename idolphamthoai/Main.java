import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wallet wallet= new Wallet(1,1234,"Nguyen Tuan Anh",1234342335);

       ArrayList <Item>items = new ArrayList<>();
        
        Item item3 = new Item(3, "thuoc dau bung", 8500, "de chua dau bung");
        Item item4 = new Item(4, "Thuoc chong say", 9000, "de chong say");



        items.add(item3);
        items.add(item4);


        Item item5=null;
        for (Item item :items) {
            System.out.println(item.toString());
        }
        System.out.println("Nhap ID san pham");
        String chonSp = scanner.nextLine();
        for (Item item :items){
            if(item.getId() == Integer.parseInt(chonSp)){
                item3=item;
                break;
            }else {
                System.out.println("San pham khong ton tai");
                System.exit(0);
            }

        }

        System.out.println("san pham ban da chon");
        System.out.println(item4.toString());
        System.out.println("Nhap thong tin khach hang :");
        System.out.println("Nhap Name");
        String name=scanner.nextLine();
        System.out.println("Nhap dia chi");
        String diachi=scanner.nextLine();
        System.out.println("Nhap SDT");
        int sdt=scanner.nextInt();
        Customer customer=new Customer(1,name,sdt,diachi);
        System.out.println("Nhap so luong");
        int quantity= scanner.nextInt();
        Order order=new Order(1, customer.getId(),quantity, LocalDate.now(),item3);

        System.out.println("Thong tin don hang");
        double infor_Order=item3.getPrice()*quantity;
        System.out.println("ten : "+customer.getName() +"\n"+"sdt : " +customer.getPhone()+"\n"+"dia chi : "+customer.getAddress()
                +"\n"+"so luong : "+quantity +"\n"+"Tong Tien:"+infor_Order +"\n"+ "So Du trong wallet la : "+(wallet.amount-infor_Order ));


















    }
    
    
}
