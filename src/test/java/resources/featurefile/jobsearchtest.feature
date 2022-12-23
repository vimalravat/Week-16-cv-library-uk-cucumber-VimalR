Feature: Job Search functionality
  As user I want to perform job search functionality

  Scenario Outline: verify Job Search Result Using Different Data Set
    Given I am on homepage
    And I accept cookies
    And I enter job title "<jobTitle>"
    And I enter Location "<location>"
    And I select distance "<distance>"
    And I click on moreSearchOptionsLink
    And I enter salaryMin "<salaryMin>"
    And I enter salaryMax "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And I click on Find Jobs button
    Then I verify the result "<result>"

    Examples:
      | jobTitle | location | distance      | salaryMin | salaryMax | salaryType | jobType   | result                                      |
      | Tester   | Harrow   | up to 5 miles | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill |





