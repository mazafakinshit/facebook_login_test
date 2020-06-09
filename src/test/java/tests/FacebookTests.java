package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.*;

@Epic("QA.GURU automation course")
@Story("Facebook tests")
@Tag("facebook")
class FacebookTests extends TestBase {

    @Test
    @Description("Negative test with testid, account blocked")
    void unSuccessfulLoginWithTestId() {
        open(url);

        $(by("data-testid", "royal_email")).setValue(email); // Do not store private data in code!
        $(by("data-testid", "royal_pass")).setValue(password);
        $(by("data-testid", "royal_login_button")).click();

        $(byText("Ваш аккаунт отключен")).shouldBe(visible);
    }

}
