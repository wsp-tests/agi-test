package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By buttonLupa = By.id("search-open");
    private By inputSearch = By.cssSelector("div.desktop-search input.search-field");
    private By buttonSearch = By.cssSelector("div.desktop-search input.search-submit");
    private By titleSeachResult = By.cssSelector("div #primary h1");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLupaButton() {
        driver.findElement(buttonLupa).click();
    }

    public void setInputSearch(String text){
        driver.findElement(inputSearch).clear();
        driver.findElement(inputSearch).sendKeys(text);
    }

    public void clickSearchButton(){
        driver.findElement(buttonSearch).click();
    }

    public String getTextSearchResult(){
        return driver.findElement(titleSeachResult).getText();
    }
}
