package ru.ibs.steps;

import io.cucumber.java.ru.И;
import ru.ibs.managers.PageManager;

public class BusinessTripsPageSteps {
    private final PageManager pageManager = PageManager.getPageManager();

    @И("^Находим кнопку '(.+)' и кликаем ее$")
    public void clickButton(String buttonName) throws InterruptedException {
        pageManager.getBusinessTripsPage().clickButton(buttonName);
    }
}
