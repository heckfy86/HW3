package github;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class  JUnitSearchTest  {
    @Test
    void findJUnit5Example() {

        Selenide.open("https://github.com/selenide/selenide");
        $("[id=wiki-tab]").click();
        $("#wiki-pages-filter").setValue("Softassertions").pressEnter();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $(byText("SoftAssertions")).click();
        $("div.markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
