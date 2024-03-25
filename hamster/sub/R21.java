package quizes.q2.makar_lavrov_1.hamster.sub;
import quizes.q2.makar_lavrov_1.hamster.A21;
import quizes.q2.makar_lavrov_1.hip.A22;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
public class R21 {
    public static void main(String[] args) {
        System.out.println(A21.hei*A21.len);
        String monthName = Month.of(A22.month%12).getDisplayName(
                TextStyle.FULL, Locale.getDefault()
        );
        System.out.println(monthName);
    }
}
