import java.util.ArrayList;
import java.util.List;
class Ticket{
    private String ticketId;
    private String holdername;
    private int birthYear;
    private int gamesPlayed;
    public Ticket(String ticketId, String holdername, int birthYear, int gamesPlayed){
        this.ticketId = ticketId;
        this.holdername = holdername;
        this.birthYear = birthYear;
        this.gamesPlayed = gamesPlayed;
    }
    public String getTicketId() {
        return ticketId;
    }

    public String getHolderName() {
        return holdername;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public double calculatePrice() {
        return 0.0;
    }
}

class FullPackageTicket extends Ticket{
    public FullPackageTicket(String ticketId, String holderName, int birthYear, int gamesPlayed) {
        super(ticketId, holderName, birthYear, gamesPlayed);
}
@Override
public double calculatePrice(){
    return 200000;
   }
}

class PartialTicket extends Ticket{
    public PartialTicket(String ticketId, String holderName, int birthYear, int gamesPlayed){
       super(ticketId, holderName, birthYear, gamesPlayed);
    }
@Override
public double calculatePrice(){
    return 70000 + 20000 *getGamesPlayed();
    }
}

public class exercise2 {
    public static void main(String[] args) {
        List<Ticket> ticketList = new ArrayList<>();

        ticketList.add(new FullPackageTicket("T001", "Nguyen Van An", 2000, 30));
        ticketList.add(new PartialTicket("T002", "Tran Thi Binh", 2002, 4));
        ticketList.add(new PartialTicket("T003", "Le Hoang Cuong", 1998, 2));

        double totalRevenue = 0;
        for (Ticket t : ticketList) {
            totalRevenue += t.calculatePrice();
        }

        int partialTicketCount = 0;
        for (Ticket t : ticketList) {
            if (t instanceof PartialTicket) {
                partialTicketCount++;
            }
        }

        System.out.println("=== QUAN LY VE DAM SEN PARK ===");
        System.out.println("Tong doanh thu tu tat ca cac ve: " + totalRevenue + " VND");
        System.out.println("So luong ve phan le (Partial Ticket) da ban: " + partialTicketCount);
    }
}