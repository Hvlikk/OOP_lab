import java.time.LocalDate;
import java.util.Date;

public class DataWaznosci {

    private LocalDate date;

    public DataWaznosci(String date)
    {
        this.date = LocalDate.parse(date);
    }

    public LocalDate getDate() {
        return date;
    }
}

