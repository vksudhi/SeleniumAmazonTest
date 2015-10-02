import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends  BaseClass {

	String ratingLocator = "acrPopover";

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	public String getRating() {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ratingLocator)));
		return element.getAttribute("title");
	}
}
