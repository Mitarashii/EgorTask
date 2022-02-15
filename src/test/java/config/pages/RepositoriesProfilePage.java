package config.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RepositoriesProfilePage {

    /**** LOCATORS ****/
    SelenideElement REPOSITORIES_TAB = $("[data-tab-item=repositories]");
    ElementsCollection REPOSITORIES_LIST = $$("[itemprop=owns]");

    /*** METHODS ***/
    public void openRepositoryTab() {
        REPOSITORIES_TAB.shouldHave(Condition.exist).click();
        REPOSITORIES_LIST.first().shouldBe(Condition.visible, Duration.ofSeconds(2));
    }

    public void searchRepositoryName(String repositoryName) {
        REPOSITORIES_LIST.findBy(text(repositoryName)).shouldBe(visible);
    }
}
