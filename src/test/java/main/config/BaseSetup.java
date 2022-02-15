package main.config;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseSetup {

    /**** VARIABLES ****/
    public static final String mitarashiiProfileUrl = "https://github.com/Mitarashii";
    public final String repositoryEgorTask = "EgorTask";

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }
}

