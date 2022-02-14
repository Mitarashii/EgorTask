import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TaskTest {

    private static final String googleURL = "https://google.com";
    private static final String valoURL = "https://playvalorant.com";
    private static final String valorant = "Valorant";

    @BeforeAll
    static void beforeAll() {
        open(googleURL);
    }

    @Test
    void selenideSearchTests() {

        // Ввести "Valorant" в поле поиска
        $("[name=q]").setValue(valorant).pressEnter();

        // Проверить, что "playvalorant.com" появилось в результатах поиска
        $("#search").shouldHave(text(valoURL));

    }


    @AfterAll
    static void afterAll() {
        Selenide.closeWebDriver();
    }
}