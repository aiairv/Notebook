import java.math.BigDecimal;
import java.time.LocalDate;

public class Debt extends Note {
    BigDecimal sumOfDebt;

    public Debt(BigDecimal sumOfDebt) {
        this.sumOfDebt = sumOfDebt;
    }

    public Debt(String text, java.time.LocalDate localDate, NoteType noteType, String title, BigDecimal sumOfDebt) {
        super(text, localDate, noteType, title);
        this.sumOfDebt = sumOfDebt;
    }

    public BigDecimal getSumOfDebt() {
        return sumOfDebt;
    }

    public void setSumOfDebt(BigDecimal sumOfDebt) {
        this.sumOfDebt = sumOfDebt;
    }

}
