import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Customer {
    private String customerId;
    private String fullName;
    private String address;
    private String phone;

    public Customer(String customerId, String fullName, String address, int phone) {
    }

    public Customer(String customerId, String fullName, String address, String phone) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
    }

    public String getCustomerId() { return customerId; }
    public String getFullName() { return fullName; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
}

class Product {
    private String productId;
    private String productType; 
    private double volume;      
    private double ratePerMl;   

    public Product(String productId, String productType, double volume, double ratePerMl) {
        this.productId = productId;
        this.productType = productType;
        this.volume = volume;
        this.ratePerMl = ratePerMl;
    }

    
    public double calculatePrice() {
        return volume * ratePerMl;
    }

    public String getProductType() { return productType; }
    public double getVolume() { return volume; }
}


abstract class Package {
    protected List<Product> productList;

    public Package() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product p) {
        productList.add(p);
    }

    
    public double calculatePackagePrice() {
        double total = 0;
        for (Product p : productList) {
            total += p.calculatePrice();
        }
        return total;
    }

    public abstract String getPackageName();
}


class RomanticPackage extends Package {
    @Override
    public String getPackageName() {
        return "Romantic Package";
    }
}


class FreshAirPackage extends Package {
    @Override
    public String getPackageName() {
        return "Fresh-Air Package";
    }
}


class Order {
    private String orderId;
    private Customer customer;
    private String invoiceDate;
    private Package cosmeticPackage;

    public Order(String orderId, Customer customer, String invoiceDate, Package cosmeticPackage) {
        this.orderId = orderId;
        this.customer = customer;
        this.invoiceDate = invoiceDate;
        this.cosmeticPackage = cosmeticPackage;
    }

    public double getOrderPrice() {
        return cosmeticPackage.calculatePackagePrice();
    }

    public String getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public String getInvoiceDate() { return invoiceDate; }
    public Package getCosmeticPackage() { return cosmeticPackage; }
}


public class exercise5 {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();

    
        Customer c1 = new Customer("CUST01", "Nguyen Thi Hoa", "Quan 1, TP.HCM", "0901234567");
        Customer c2 = new Customer("CUST02", "Tran Van Nam", "Thu Duc, TP.HCM", "0987654321");

        Package pack1 = new RomanticPackage();
        pack1.addProduct(new Product("P01", "Rose Perfume", 50, 20000));          
        pack1.addProduct(new Product("P02", "Dry Skin Shower Gel", 100, 20000)); 
        

    
        Package pack2 = new FreshAirPackage();
        pack2.addProduct(new Product("P03", "Oily Hair Shampoo - Standard 1", 80, 30000)); 


        orderList.add(new Order("ORD001", c1, "2026-06-07", pack1));
        orderList.add(new Order("ORD002", c2, "2026-06-07", pack2));

       
        System.out.println("=== DANH SACH DON HANG MY PHAM ===");
        for (Order o : orderList) {
            System.out.println("Ma Don: " + o.getOrderId() + 
                               " | Khach Hang: " + o.getCustomer().getFullName() + 
                               " | Ngay: " + o.getInvoiceDate() + 
                               " | Loai Goi: " + o.getCosmeticPackage().getPackageName() +
                               " | Tong Tien: " + o.getOrderPrice() + " VND");
        }


        String fileName = "order_list.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("=== DANH SACH DON HANG MY PHAM ===");
            for (Order o : orderList) {
                writer.println("Ma Don: " + o.getOrderId() + 
                               ", Khach Hang: " + o.getCustomer().getFullName() + 
                               ", SDT: " + o.getCustomer().getPhone() +
                               ", Ngay: " + o.getInvoiceDate() + 
                               ", Goi: " + o.getCosmeticPackage().getPackageName() +
                               ", Tong Tien: " + o.getOrderPrice() + " VND");
            }
            System.out.println("\n=> Da ghi thanh cong danh sach don hang vao file '" + fileName + "'!");
        } catch (IOException e) {
            System.out.println("Loi khi ghi file: " + e.getMessage());
        }
    }
}