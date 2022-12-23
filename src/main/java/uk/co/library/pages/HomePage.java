package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
    WebElement iframe;


    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;


    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitlee;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locations;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropdown;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Permanent Tester jobs in Harrow on the Hill')]")
    WebElement searchPageHeader;



    public void setAcceptCookies() throws InterruptedException {
      driver.switchTo().frame(iframe);
      clickOnElement(acceptCookies);
     driver.switchTo().defaultContent();
      Thread.sleep(2000);
    }


    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitlee, jobTitle);
    }

    public void enterLocation(String location) {
        sendTextToElement(locations, location);

    }

    public void selectDistance(String distance) {
        selectByVisibleTextFromDropDown(distanceDropDown, distance);

    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);

    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);


    }

    public void selectSalaryType(String sType) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);

    }

    public void selectJobType(String jobType) {
        selectByVisibleTextFromDropDown(jobTypeDropdown, jobType);

    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobsBtn);
    }

    public String getSearchPageHeaderMessage() {
        return getTextFromElement(searchPageHeader);
    }








    }

