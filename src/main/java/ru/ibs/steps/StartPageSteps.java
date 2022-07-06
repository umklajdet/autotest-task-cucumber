package ru.ibs.steps;

import io.cucumber.java.ru.И;
import ru.ibs.managers.PageManager;

public class StartPageSteps {
    private final PageManager pageManager = PageManager.getPageManager();

    @И("^Проверяем название стартовой страницы: '(.+)'$")
    public void checkPageTitle(String title){
        pageManager.getStartPage().checkPageTitle(title);
    }

    @И("^Выбор пункта '(.+)' в главном меню$")
    public void selectMainMenuElement(String elementName) {
        pageManager.getStartPage().selectMainMenuElement(elementName);
    }

    @И("^Выбор пункта '(.+)' в подменю$")
    public void selectSubMenuElement(String subElementName){
        pageManager.getStartPage().selectSubMenuElement(subElementName);
    }
}
