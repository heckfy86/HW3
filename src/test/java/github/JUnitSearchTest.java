package github;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class  JUnitSearchTest  {
    @Test
    void FindJUnit5Example() {

        Selenide.open("https://github.com/selenide/selenide");
        $("[id=wiki-tab]").click();
        $(".markdown-body").$$("ul li").find(text("Soft assertions")).$("a").click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
