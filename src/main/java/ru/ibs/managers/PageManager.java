package ru.ibs.managers;

import ru.ibs.pages.BusinessTripsPage;
import ru.ibs.pages.CreateBusinessTripPage;
import ru.ibs.pages.LoginPage;
import ru.ibs.pages.StartPage;

public class PageManager {
    private static PageManager pageManager;

    // страницы
    private LoginPage loginPage;
    private StartPage startPage;
    private BusinessTripsPage businessTripsPage;
    private CreateBusinessTripPage createBusinessTripPage;

    // пустой конструктор (singleton)
    private PageManager(){
    }

    // инициализация PageManager
    public static PageManager getPageManager(){
        if(pageManager == null){
            pageManager = new PageManager();
        }
        return pageManager;
    }

    // инициализация страниц
    public LoginPage getLoginPage(){
        if(loginPage == null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public StartPage getStartPage(){
        if(startPage == null){
            startPage = new StartPage();
        }
        return startPage;
    }

    public BusinessTripsPage getBusinessTripsPage(){
        if(businessTripsPage == null){
            businessTripsPage = new BusinessTripsPage();
        }
        return businessTripsPage;
    }

    public CreateBusinessTripPage getCreateBusinessTripPage(){
        if(createBusinessTripPage == null){
            createBusinessTripPage = new CreateBusinessTripPage();
        }
        return createBusinessTripPage;
    }
}
