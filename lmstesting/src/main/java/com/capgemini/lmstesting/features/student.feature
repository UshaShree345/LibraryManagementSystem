Feature: Student can request,return and able to view books

  Background: 
    Given Student is on Login page
    When Student enters "soumya@gmail.com","Soumya@123"
    Then Student should be logged in

  Scenario: Student should be able to return books
    Given Student is on returning book page
    When Book  and User are given 26, 12002
    Then Book Returned Successfully

  Scenario: Student should be able to request books
    Given Student is on request book page
    When BookId  and UserId are given 48, 12402
    Then Book Requested Successfully

  Scenario: Student should be able to view books based on names
    Given Student is on  viewing books page based on names
    When student enters "maths"
    Then show books based on name

  Scenario: Student should be able to view books based on author name
    Given Student is on  viewing books page based on author Name
    When student enters author name "Jaya Dev"
    Then show books based on  author name

  Scenario: Student should be able to view books based on category
    Given Student is on  viewing books page based on book category
    When student enters book category "social"
    Then show books based on  book category
