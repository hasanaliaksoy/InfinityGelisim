package com.infinity.step_definitions;

import com.infinity.pages.Driver;
import com.infinity.pages.LoginPage;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("^Infinity Gelişim web sitesine erişilir$")
    public void openBrowser() {
        Driver.getDriver().get("https://www.infinitygelisim.com/");
    }

    @When("Kullanıcı adını label'ında placeholder olarak {string} yazdığını doğrulayınız.")
    public void verifyUsernameLabel(String message) {
        assertEquals(message, loginPage.emailInputBox.getAttribute("placeholder"));
    }

    @When("Şifre label'ında placeholder olarak {string} yazdığını doğrulayınız.")
    public void verifyPasswordLabel(String message) {
        assertEquals(message, loginPage.passwordBox.getAttribute("placeholder"));
    }

    @When("Login Butonu doğrulanır")
    public void verifyLoginButton() {
        assertTrue(loginPage.loginButtonBox.isEnabled());
    }

    @When("Şifremi Unuttum Butonu doğrulanır")
    public void verifyForgotPasswordButton() {
        assertTrue(loginPage.forgotPasswordBox.isEnabled());
    }

    @When("Beni Hatırla Butonu doğrulanır")
    public void verifyRememberMeButton() {
        assertTrue(loginPage.rememberMeBox.isEnabled());
    }

    @When("Recaptcha doğrulanır")
    public void verifyRecaptcha() {
        assertTrue(loginPage.recaptchaBox.isEnabled());
    }

    @When("Kullanıcı adı alanına geçersiz bir kullanıcı adı girilir")
    public void enterInvalidUsername() {
        loginPage.emailInputBox.sendKeys("123abc@gmail.");
        loginPage.loginButtonBox.click();
    }

    @Then("Hatalı kullanıcı adı mesajı görüntülenir")
    public void verifyInvalidUsernameMessage() {
        assertTrue(loginPage.invalidErrorMessageBox.isDisplayed());
    }

    @When("Şifre alanına geçersiz bir şifre girilir")
    public void enterInvalidPassword() {
        loginPage.passwordBox.sendKeys("1234567abc.");
        loginPage.loginButtonBox.click();
    }

    @Then("Hatalı şifre mesajı görüntülenir")
    public void verifyInvalidPasswordMessage() {
        assertTrue(loginPage.invalidErrorMessageBox.isDisplayed());
    }


    @Then("Kullanıcı adı alanı veri girişine açık olduğunu doğrulayınız")
    public void verifyUserNameFieldEnabled() {
        assertTrue(loginPage.emailInputBox.isEnabled());
    }

    @Then("Şifre alanı veri girişine açık olduğunu doğrulayınız.")
    public void verifyUserPasswordFieldEnabled() {
        assertTrue(loginPage.passwordBox.isEnabled());
    }

    @When("Login butonunun mevcut olduğunu ve işlevsel olduğunu kontrol edin.")
    @When("Şifremi Unuttum butonunun mevcut olduğunu ve işlevsel olduğunu kontrol edin.")
    @When("Beni Hatırla butonunun mevcut olduğunu ve işlevsel olduğunu kontrol edin.")
    public void verifyLoginButtonDisplayedAndFunctional() {
        assertTrue(loginPage.passwordBox.isEnabled());
    }


    @When("Recaptcha'nın mevcut olduğunu ve işlevsel olduğunu kontrol edin.")
    public void verifyRecaptchaPresentAndFunctional() {
        assertTrue(loginPage.recaptchaBox.isEnabled());
    }

    @Then("{string} mesajının görüntülendiğini kontrol edin.")
    public void verifyInvalidUserNamePasswordMessage(String message) {
        assertEquals(message,loginPage.invalidErrorMessageBox.getText());
    }

    @When("Google Play butonunun mevcut olduğunu ve işlevsel olduğunu kontrol edin")
    public void verifyGooglePlayButton() {
        assertTrue(loginPage.googlePlayBox.isEnabled());
    }

    @Then("App Store butonunun mevcut olduğunu ve işlevsel olduğunu kontrol edin")
    public void verifyAppStoreButton() {
        assertTrue(loginPage.appStoreBox.isEnabled());
    }


    @When("Şifre Al butonuna tıklanır ve geçersiz bir kullanıcı adı girilir")
    public void verifyForgotPasswordFunctional() {
        loginPage.forgotPasswordBox.click();
        loginPage.emailInputBox.sendKeys("123abc@gmail.com");
        loginPage.recaptchaBox.click();
        loginPage.forgotSendBox.click();
    }

    @Then("Şifre yenileme e-posta SMS hatalı kullanıcı adı mesajı görüntülenir")
    public void verifyInvalidForgotEmailMessage() {
        assertTrue(loginPage.invalidForgotMessageBox.isDisplayed());
    }
}
