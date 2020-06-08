Feature: Librarian can add,delete,update,issue books and able to view books

  Background: 
    Given Librarian is on Login page
    When Librarian enters "mamatha@gmail.com","Mamatha@123"
    Then Librarian should be logged in

  Scenario: Librarian should be able to issue books
    Given Librarian is on issuing book page
    When Librarian enters 12202,26
    Then Book issued successfully

  Scenario: Librarian should be able to update books
    Given Librarian is on updating book page
    When Librarian enters 49,"Biology","Ratnakaran","SM Publications","20","Sciencee"
    Then Book updated successfully

  Scenario Outline: Librarian should be able to add books
    Given Librarian is on adding book page
    When Librarian enters <bookName>,<authorName>,<publisherName>,<copies>,<bookCategory>
    Then Book <status>

    Examples: 
      | bookName         | authorName      | publisherName       | copies | bookCategory | status               |
      | "HalfGirlfriend" | "Chetan Bhagat" | "Rupa publications" |     21 | "novel"      | "Added Successfully" |

  Scenario: Librarian should be able to remove books
    Given Librarian is on removing book page
    When Librarian enters 6
    Then Book deleted successfully

  Scenario: Librarian should be able to users
    Given: Librarian is on users page
    When: Librarian clicks on show users button
    Then list of users should be displayed

  Scenario: Librarian should be able to view books based on bookname
    Given Librarian is on  viewing books page based on bookname
    When librarian enters "maths"
    Then show books based on bookname

  Scenario: Librarian should be able to view books based on authorname
    Given Librarian is on  viewing books page based on authorname
    When librarian enters authorname "Jaya Dev"
    Then show books based on  authorname

  Scenario: Librarian should be able to view books based on bookcategory
    Given Librarian is on  viewing books page based on bookcategory
    When librarian enters bookcategory "social"
    Then show books based on  bookcategory
