package ru.ibs.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.И;
import ru.ibs.managers.PageManager;

import java.util.List;

public class CreateBusinessTripPageSteps {

    PageManager pageManager = PageManager.getPageManager();

    @И("^Проверяем заголовок страницы создания командировок: '(.+)'$")
    public void checkPageTitle(String title) {
        pageManager.getCreateBusinessTripPage().checkPageTitle(title);
    }

    @И("^Открываем список подразделений$")
    public void openDepartmentList() {
        pageManager.getCreateBusinessTripPage().openDepartmentsList();
    }

    @И("^Выбираем подразделение '(.+)'$")
    public void selectDepartment(String depTitle) {
        pageManager.getCreateBusinessTripPage().chooseDepartment(depTitle);
    }

    @И("^Выбираем организацию '(.+)'$")
    public void selectOrg(String orgTitle) {
        pageManager.getCreateBusinessTripPage().chooseOrg(orgTitle);
    }

    @И("^Выбираем задачу '(.+)'$")
    public void selectTask(String taskTitle) {
        pageManager.getCreateBusinessTripPage().chooseTask(taskTitle);
    }

    @И("^Вводим города$")
    public void inputCityNames(List<String> cityNames) {
        pageManager.getCreateBusinessTripPage().inputCities(cityNames.get(0), cityNames.get(1));
    }

    @И("^Вводим даты с учетом дней до командировки$")
    public void inputDates(List<Integer> daysToBusinessTrip) {
        pageManager.getCreateBusinessTripPage().inputDates(daysToBusinessTrip.get(0), daysToBusinessTrip.get(1));
    }

    @И("^Возвращаемся к странице$")
    public void focusToPage() {
        pageManager.getCreateBusinessTripPage().focusToPage();
    }

    @И("^Проверяем заполнение полей, выбранных из списка$")
    public void checkSelectedFromList(DataTable fieldsNameAndValue) {
        fieldsNameAndValue.asMap(String.class, String.class).forEach((name, value)
                -> pageManager.getCreateBusinessTripPage().checkSelectedData((String) name, (String) value));
    }

    @И("^Проверяем заполнение полей, введенных с клавиатуры$")
    public void checkEnteredValues(DataTable fieldsNameAndValue) {
        fieldsNameAndValue.asMap(String.class, String.class).forEach((name, value)
                -> pageManager.getCreateBusinessTripPage().CheckEnteredData ((String) name, (String) value));
    }

    @И("^Проверяем выбранные чекбоксы$")
    public void checkSelectedCheckbox(List<String> taskNames) {
        taskNames.forEach(taskName -> pageManager.getCreateBusinessTripPage().CheckSelectedCheckboxData((String) taskName));
    }

    @И("^Сохраняем командировку с введенными данными$")
    public void saveBusinessTrip() {
        pageManager.getCreateBusinessTripPage().clickSaveAndClose();
    }

    @И("^Проверяем сообщения об ошибке '(.+)'$")
    public void checkErrorMsg(String errorMsg) {
        pageManager.getCreateBusinessTripPage().checkErrorMessage(errorMsg);
    }
}
