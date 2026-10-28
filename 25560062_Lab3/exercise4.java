import java.util.ArrayList;
import java.util.List;

class Singer {
    private String fullName;
    private int yearsOfExperience;
    private int albumsSold;
    private int performances;

    public Singer(String fullName, int yearsOfExperience, int albumsSold, int performances) {
        this.fullName = fullName;
        this.yearsOfExperience = yearsOfExperience;
        this.albumsSold = albumsSold;
        this.performances = performances;
    }

    public String getFullName() {
        return fullName;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public int getAlbumsSold() {
        return albumsSold;
    }

    public int getPerformances() {
        return performances;
    }

    public double calculateSalary() {
        return 0.0;
    }
}

class RegularSinger extends Singer {
    public RegularSinger(String fullName, int yearsOfExperience, int albumsSold, int performances) {
        super(fullName, yearsOfExperience, albumsSold, performances);
    }

    @Override
    public double calculateSalary() {
        return 3000000 + 500000 * getYearsOfExperience() + 1000 * getAlbumsSold() + 200000 * getPerformances();
    }
}

class FamousSinger extends Singer {
    private int gameShows; 

    public FamousSinger(String fullName, int yearsOfExperience, int albumsSold, int performances, int gameShows) {
        super(fullName, yearsOfExperience, albumsSold, performances);
        this.gameShows = gameShows;
    }

    public int getGameShows() {
        return gameShows;
    }

    @Override
    public double calculateSalary() {
        return 5000000 + 500000 * getYearsOfExperience() + 1200 * getAlbumsSold() + 500000 * getPerformances() + 500000 * gameShows;
    }
}

class exercise4 {
    public static void main(String[] args) {
        List<Singer> singerList = new ArrayList<>();

        singerList.add(new RegularSinger("Nguyen Van A", 3, 1000, 10));
        singerList.add(new FamousSinger("Tran Thi B", 5, 5000, 20, 4));
        singerList.add(new RegularSinger("Le Hoang C", 1, 200, 5));

        System.out.println("=== BANG LUONG CA SI ===");
        for (Singer s : singerList) {
            System.out.println("- " + s.getFullName() + ": " + s.calculateSalary() + " VND");
        }

        Singer highestPaidSinger = null;
        double maxSalary = -1.0;

        for (Singer s : singerList) {
            double currentSalary = s.calculateSalary();
            if (currentSalary > maxSalary) {
                maxSalary = currentSalary;
                highestPaidSinger = s;
            }
        }

        System.out.println("\n=== CA SI CO MUC LUONG CAO NHAT ===");
        if (highestPaidSinger != null) {
            System.out.println("Ho ten: " + highestPaidSinger.getFullName());
            System.out.println("Muc luong: " + maxSalary + " VND");
        }
    }
}