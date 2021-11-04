import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class NambafoodTest {

    @Test
    public void searchInNambafood () {
        open("https://nambafood.kg/");
        $(By.xpath("*//section[2]/ul/li[3]/a")).click();//кликаем по разделу
        $(By.xpath("//a[2]/div/div[1]")).click();// топ 5 супермаркетов1
        $(By.xpath("//a[1]/div[2]/div[1]/div")).shouldHave(text("Globus"));
        $(By.xpath("//a[2]/div[2]/div[1]/div")).shouldHave(text("Народный"));
        $(By.xpath("//a[3]/div[2]/div[1]/div")).shouldHave(text("Namba Market"));
        $(By.xpath("//a[4]/div[2]/div[1]/div")).shouldHave(text("Мыломойка «Бай Ордо» Маркет"));
        $(By.xpath("//a[5]/div[2]/div[1]/div")).shouldHave(text("Product market SRT Group"));
        Selenide.sleep(2000);

        



    }
}
