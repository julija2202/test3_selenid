import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class LocatorsPage {
    SelenideElement add_to_cart_1 = $ ("#add-to-cart-sauce-labs-bolt-t-shirt");
    SelenideElement add_to_cart_2 = $ ("#add-to-cart-sauce-labs-onesie");
    SelenideElement container = $ ("#shopping_cart_container > a > span");
    SelenideElement checkout_buy = $ ("#checkout");
    SelenideElement first_name = $ ("#first-name");
    SelenideElement last_name = $ ("#last-name");
    SelenideElement post_code = $ ("#postal-code");
    SelenideElement continue_buy = $ ("#continue");
    SelenideElement cancel_buy = $ ("#cancel");
    SelenideElement delete1 = $ ("#remove-sauce-labs-bolt-t-shirt");
    //SelenideElement delete2 = $ ("(//button[@class='btn btn_secondary btn_small cart_button'])[2]");
    SelenideElement cena_1 = $ ("#cart_contents_container > div > div.cart_list > div:nth-child(3) > div.cart_item_label > div.item_pricebar > div");
    SelenideElement cena_2 = $ ("#cart_contents_container > div > div.cart_list > div:nth-child(4) > div.cart_item_label > div.item_pricebar > div");
}
