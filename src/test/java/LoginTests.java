import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {
    @Test
    void successfulLoginTest() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("rick-flat@mail.ru");
        $("[name=password]").setValue("7NqKn3fSfjR7ZCc").pressEnter();


    }


    @Test
    void negativeLoginTest() {
        open("https://school.qa.guru");
        $("[name=email]").setValue("rick-flat@mail.ru");
        $("[name=password]").setValue("akakkddd").pressEnter();


    }

}