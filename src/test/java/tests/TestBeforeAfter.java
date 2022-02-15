package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class TestBeforeAfter {

    @BeforeAll
    static void beforeAll() {
        open("https://github.com/Mitarashii");
    }

    @AfterAll
    static void afterAll() {
        Selenide.closeWebDriver();
    }

    @Test
    void openMitarashiiRepositories() {
        System.out.println();
     $("[data-tab-item=repositories]").shouldHave(Condition.exist).click();
     $("#user-repositories-list").shouldHave(Condition.visible, Duration.ofSeconds(2));
        // Open GitHub -> Your repositories and check one of your repositories is displayed



    $$("[itemprop=owns]").findBy(Condition.text("EgorTask")).shouldBe(Condition.visible);


    //REPOSITORIES_LIST.findBy(text(repositoryName)).shouldBe(visible);
    }


}
