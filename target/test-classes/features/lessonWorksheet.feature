Feature: Lesson worksheet
  As a user I want to verify lesson worksheet 

  Scenario Outline: Check number of question in a specific lesson worksheet
    Given Nagwa website is opened
    When  I choose English language to open the home page
    And   click on the search icon to start searching on Nagwa lessons
    And   write "<lesson>"
    And   click search
    And   click on second lesson in the search result
    And   click preview
    Then  return number of questions

    Examples: 
      | lesson   |
      | addition |