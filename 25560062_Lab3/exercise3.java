import java.util.ArrayList;
import java.util.List;

class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Guest extends Person {
    private String cccd; 

    public Guest(String fullName, int age, String cccd) {
        super(fullName, age);
        this.cccd = cccd;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }
}

class Staff extends Person {
    private String employeeId;
    private String licenseId;

    public Staff(String fullName, int age, String employeeId, String licenseId) {
        super(fullName, age);
        this.employeeId = employeeId;
        this.licenseId = licenseId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getLicenseId() {
        return licenseId;
    }
}

class Room {
    private String roomType; 
    private int rentalDays;

    public Room(String roomType, int rentalDays) {
        this.roomType = roomType;
        this.rentalDays = rentalDays;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double calculateRentalCost() {
        double pricePerDay = 0;
        switch (roomType.toUpperCase()) {
            case "VIP1":
                pricePerDay = 900000;
                break;
            case "VIP2":
                pricePerDay = 700000;
                break;
            case "VIP3":
                pricePerDay = 500000;
                break;
            default:
                pricePerDay = 0; 
                break;
        }
        return pricePerDay * rentalDays;
    }
}

public class exercise3 {
    public static void main(String[] args) {
        List<Guest> guestList = new ArrayList<>();

        // Thêm khách hàng (Add)
        Guest g1 = new Guest("Nguyen Van An", 25, "079203001234");
        Guest g2 = new Guest("Tran Thi Binh", 30, "079203005678");
        guestList.add(g1);
        guestList.add(g2);

        System.out.println("=== DANH SACH KHACH HANG BAN DAU ===");
        for (Guest g : guestList) {
            System.out.println("- " + g.getFullName() + " | CCCD: " + g.getCccd());
        }

        guestList.remove(g1);

        System.out.println("\n=== DANH SACH SAU KHI XOA KHACH HANG ===");
        for (Guest g : guestList) {
            System.out.println("- " + g.getFullName() + " | CCCD: " + g.getCccd());
        }

        Room room = new Room("VIP2", 3);
        double totalCost = room.calculateRentalCost();

        System.out.println("\n=== THONG TIN THUE PHONG ===");
        System.out.println("Loai phong: " + room.getRoomType());
        System.out.println("So ngay thue: " + room.getRentalDays());
        System.out.println("Tong chi phi thue: " + totalCost + " VND");
    }
}