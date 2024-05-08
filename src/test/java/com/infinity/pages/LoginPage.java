package com.infinity.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "Email")
    public WebElement emailInputBox;
    @FindBy(id = "myInput")
    public WebElement passwordBox;
    @FindBy(name = "rememberMe")
    public WebElement rememberMeBox;
    @FindBy(id = "kt_login_forgot")
    public WebElement forgotPasswordBox;
    @FindBy(xpath = "//img[@title='Google Play']")
    public WebElement googlePlayBox;
    @FindBy(xpath = "//img[@title='App Store']")
    public WebElement appStoreBox;
    @FindBy(id = "recaptcha-anchor")
    public WebElement recaptchaBox;
    @FindBy(id = "kt_login_signin_submit")
    public WebElement loginButtonBox;
    @FindBy(xpath = "//div[@class='form text-left']/p")
    public WebElement invalidErrorMessageBox;
    @FindBy(id = "kt_login_forgot_submit")
    public WebElement forgotSendBox;
    @FindBy(xpath = "//div[@class='form text-left']/div")
    public WebElement invalidForgotMessageBox;






}
