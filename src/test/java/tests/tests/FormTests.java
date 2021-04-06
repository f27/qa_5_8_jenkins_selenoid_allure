package tests.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.pages.FormPage;

import static tests.TestData.expectedData;
import static tests.TestData.userData;

@DisplayName("Form tests")
public class FormTests extends TestBase {
    FormPage formPage;

    @Test
    @Owner("f27")
    @DisplayName("Successful form test")
    void successfulFormTest() {
        formPage = new FormPage();
        formPage.openFormPage()
                .fillForm(userData)
                .checkData(expectedData);
    }
}
