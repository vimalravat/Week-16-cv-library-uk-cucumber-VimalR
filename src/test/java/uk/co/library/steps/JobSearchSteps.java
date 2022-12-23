package uk.co.library.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import uk.co.library.pages.HomePage;

public class JobSearchSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
    @And("^I accept cookies$")
    public void iAcceptCookies() throws InterruptedException {
        new HomePage().setAcceptCookies();
    }

    @And("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle)  {
       new HomePage().enterJobTitle(jobTitle);
    }

    @And("^I enter Location \"([^\"]*)\"$")
    public void iEnterLocation(String location)  {
        new HomePage().enterLocation(location);
    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance)  {
       new HomePage().selectDistance(distance);
    }

    @And("^I click on moreSearchOptionsLink$")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter salaryMin \"([^\"]*)\"$")
    public void iEnterSalaryMin(String minSalary)  {
        new HomePage().enterMinSalary(minSalary);
    }

    @And("^I enter salaryMax \"([^\"]*)\"$")
    public void iEnterSalaryMax(String maxSalary)  {
        new HomePage().enterMaxSalary(maxSalary);
    }

    @And("^I select salaryType \"([^\"]*)\"$")
    public void iSelectSalaryType(String sType) {
        new HomePage().selectSalaryType(sType);
    }

    @And("^I select jobType \"([^\"]*)\"$")
    public void iSelectJobType(String jobType) throws Throwable {
        new HomePage().selectJobType(jobType);
    }

    @And("^I click on Find Jobs button$")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("^I verify the result \"([^\"]*)\"$")
    public void iVerifyTheResult(String searchPageHeader) throws Throwable {
        Assert.assertEquals("Permanent Tester jobs in Harrow on the Hill not displayed", searchPageHeader, new HomePage().getSearchPageHeaderMessage());
    }


}
