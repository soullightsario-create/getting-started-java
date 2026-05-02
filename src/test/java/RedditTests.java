import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RedditTests {
    @Test
    void successfulSearchTest() {
        open("https://www.reddit.com/login");
        $("[name='username']").shouldBe(visible).setValue("sario.light@gmail.com");
        $("[name='password']").setValue("qlalalsp").pressEnter();

        $(".AnimatedForm__errorMessage").shouldBe(visible);

    }
}
