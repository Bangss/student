package neusoft.test;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;


public class Test {
    @org.junit.Test
    public void dateTest() {
        String date = String.valueOf(LocalDate.now());
        System.out.println(date);
    }

}
