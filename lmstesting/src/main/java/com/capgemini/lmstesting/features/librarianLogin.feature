Feature: Librarian Login

  Scenario Outline: Librarian login with given details
    Given Librarian is on Login page
    When Librarian enters <email>,<password>
    Then Librarian should be logged in

    Examples: 
      | email               | password      |
      | "mamatha@gmail.com" | "Mamatha@123" |
