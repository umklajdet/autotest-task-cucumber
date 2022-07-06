package ru.ibs.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import ru.ibs.managers.DriverManager;
import ru.ibs.managers.PageManager;
import ru.ibs.managers.PropManager;

public class Hooks {

    private static final DriverManager driverManager = DriverManager.getDriverManager();
    protected PageManager pageManager = PageManager.getPageManager();
    private final PropManager propManager = PropManager.getPropManager();

    @Before
    public void before() {
        driverManager.getDriver().get(propManager.getProperty("base.url"));
    }

    @After
    public void after() {
        driverManager.quitDriver();
    }

}
