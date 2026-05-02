import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OdLoginTests {
    @Test
    void negativeSearchTest() {
        open("https://ok.ru");
        $("[name='st.email']").setValue("somi.tagi@gmail.com");
        $("[name='st.password']").setValue("akdkdkdkd").pressEnter();

    }
}