
import org.openqa.selenium.By;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    SelenideElement loginL = $(By.id("user-name"));
    SelenideElement passwordP= $(By.id("password"));
    SelenideElement buttonB = $("#login-button");


    void login() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/main/resources/user.properties"));
        loginL.sendKeys(props.getProperty("user.username"));
        passwordP.sendKeys(props.getProperty("user.password"));
        buttonB.click();
    }

    public void openLoginPage(){
        open("https://www.saucedemo.com/");
    }



}