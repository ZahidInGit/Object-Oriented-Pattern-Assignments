import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 5, 10);
        LocalDate endDate = LocalDate.of(2024, 8, 25);

        long totalDays = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Total difference in days: " + totalDays);

        Period period = Period.between(startDate, endDate);
        System.out.println("Exact difference: " + 
                           period.getYears() + " years, " + 
                           period.getMonths() + " months, and " + 
                           period.getDays() + " days.");
    }
}
