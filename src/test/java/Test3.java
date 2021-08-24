import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Assertions;
import java.io.IOException;

    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    public class Test3 {

        @BeforeEach
        public void startUp() {
//        Configuration.headless = true;
            Configuration.startMaximized = true;

        }

        @AfterEach
        public void tearDown() {
            closeWebDriver();
        }


        @Test
        @Order(1)
        public void loginTest() throws IOException {
            LoginPage loginPage = new LoginPage();
            loginPage.openLoginPage();
            loginPage.login();
            Selenide.sleep(5000);
        }

        @Test
        @Order(2)
        public void buyTest() throws IOException  {
            LoginPage loginPage = new LoginPage();
            LocatorsPage locators = new LocatorsPage();
            loginPage.openLoginPage();
            loginPage.login();
            locators.add_to_cart_1.click();
            locators.container.click();
            locators.checkout_buy.click();
            locators.first_name.sendKeys("julija");
            locators.last_name.sendKeys("jaholovich");
            locators.post_code.click();
            locators.continue_buy.click();
            Selenide.sleep(5000);
        }

        @Test
        @Order(3)
        public void no_buyTest() throws IOException {
            LoginPage loginPage = new LoginPage();
            LocatorsPage locators = new LocatorsPage();
            loginPage.openLoginPage();
            loginPage.login();
            locators.add_to_cart_1.click();
            locators.container.click();
            locators.checkout_buy.click();
            locators.cancel_buy.click();
            Selenide.sleep(5000);
        }

        @Test
        @Order(4)
        public void deleteTest() throws IOException {
            LoginPage loginPage = new LoginPage();
            LocatorsPage locators = new LocatorsPage();
            loginPage.openLoginPage();
            loginPage.login();
            locators.add_to_cart_1.click();
            locators.container.click();
            locators.delete1.click();
            Selenide.sleep(5000);
        }

        @Test
        @Order(5)
        public void summaTest() throws IOException {
            LoginPage loginPage = new LoginPage();
            LocatorsPage locatorsPage = new LocatorsPage();
            loginPage.openLoginPage();
            loginPage.login();
            locatorsPage.add_to_cart_1.click();
            locatorsPage.add_to_cart_2.click();
            locatorsPage.container.click();
            String cena_1Title = locatorsPage.cena_1.getText();
            String cena_2Title = locatorsPage.cena_2.getText();
            int start = 1;
            int end = 6;
            char[] cena1=new char[end - start];
            cena_1Title.getChars( start, end, cena1, 0);
            int start2 = 1;
            int end2 = 5;
            char [] cena2=new char[end2 - start2];
            cena_2Title.getChars( start2, end2, cena2, 0);
            String [] arr = new String[2];
            System.out.println(cena1);
            System.out.println(cena2);
           /* arr[0] = cena_1Title;
            arr[1] = cena_2Title;
            for ( int i = 0; i< 2; i++) {
                    System.out.println(arr[i]);
            }*/



        }

    }
