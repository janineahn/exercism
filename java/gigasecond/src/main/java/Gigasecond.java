import java.time.*;

public class Gigasecond {
    LocalDateTime birthday;
    public Gigasecond(LocalDateTime birthday){
        this.birthday = birthday;
    }
    public Gigasecond(LocalDate birthday){
        this.birthday = LocalDateTime.of(birthday, LocalTime.of(0,0));
    }
    public LocalDateTime getDate(){
        long gigaSecond = 1_000_000_000;
        LocalDateTime newDate = birthday.plusSeconds(gigaSecond);
        return newDate;
    }
}
