package ru.ibs.steps;

import io.cucumber.java.ru.Допустим;
import ru.ibs.managers.PageManager;

public class LoginPageSteps {
    private final PageManager pageManager = PageManager.getPageManager();

    @Допустим("^Вводим логин (.+) пароль (.+)$")
    public void logIn (String login, String password) {
        pageManager.getLoginPage().logIn(login, password);
    }
}
