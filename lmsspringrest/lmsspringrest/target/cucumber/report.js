$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("librarianLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Librarian Login",
  "description": "",
  "id": "librarian-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Librarian login with given details",
  "description": "",
  "id": "librarian-login;librarian-login-with-given-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Librarian is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Librarian enters \u003cemail\u003e,\u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Librarian should be logged in",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "librarian-login;librarian-login-with-given-details;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 10,
      "id": "librarian-login;librarian-login-with-given-details;;1"
    },
    {
      "cells": [
        "\"usha963@gmail.com\"",
        "\"Usha@963\""
      ],
      "line": 11,
      "id": "librarian-login;librarian-login-with-given-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Librarian login with given details",
  "description": "",
  "id": "librarian-login;librarian-login-with-given-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Librarian is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Librarian enters \"usha963@gmail.com\",\"Usha@963\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Librarian should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.librarian_is_on_Login_page()"
});
formatter.result({
  "duration": 283308700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usha963@gmail.com",
      "offset": 18
    },
    {
      "val": "Usha@963",
      "offset": 38
    }
  ],
  "location": "LibrarianSteps.librarian_enters(String,String)"
});
formatter.result({
  "duration": 4404051600,
  "status": "passed"
});
formatter.match({
  "location": "LibrarianSteps.librarian_should_be_logged_in()"
});
formatter.result({
  "duration": 6140200,
  "status": "passed"
});
formatter.uri("librarianOperations.feature");
formatter.feature({
  "line": 1,
  "name": "Librarian can add,delete,update,issue books and able to view books",
  "description": "",
  "id": "librarian-can-add,delete,update,issue-books-and-able-to-view-books",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Librarian should be able to add books",
  "description": "",
  "id": "librarian-can-add,delete,update,issue-books-and-able-to-view-books;librarian-should-be-able-to-add-books",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "Librarian is on adding book page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "librarian enters \u003cbookName\u003e,\u003cauthorName\u003e,\u003cpublisherName\u003e,\u003ccopies\u003e,\u003cbookCategory\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Book \u003cstatus\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "librarian-can-add,delete,update,issue-books-and-able-to-view-books;librarian-should-be-able-to-add-books;",
  "rows": [
    {
      "cells": [
        "bookName",
        "authorName",
        "publisherName",
        "copies",
        "bookCategory",
        "status"
      ],
      "line": 15,
      "id": "librarian-can-add,delete,update,issue-books-and-able-to-view-books;librarian-should-be-able-to-add-books;;1"
    },
    {
      "cells": [
        "\"Glimpses of WorldHistroy\"",
        "\"Jawaharlal Nehru\"",
        "\"Indian publications\"",
        "15",
        "\"Critics\"",
        "\"Added Successfully\""
      ],
      "line": 16,
      "id": "librarian-can-add,delete,update,issue-books-and-able-to-view-books;librarian-should-be-able-to-add-books;;2"
    },
    {
      "cells": [
        "\"Prison Diary\"",
        "\"JayaPrakash Naryan\"",
        "\"ND publications\"",
        "15",
        "\"General\"",
        "\"Added Successfully\""
      ],
      "line": 17,
      "id": "librarian-can-add,delete,update,issue-books-and-able-to-view-books;librarian-should-be-able-to-add-books;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Librarian is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Librarian enters \"usha963@gmail.com\",\"Usha@963\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Librarian should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.librarian_is_on_Login_page()"
});
formatter.result({
  "duration": 35100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usha963@gmail.com",
      "offset": 18
    },
    {
      "val": "Usha@963",
      "offset": 38
    }
  ],
  "location": "LibrarianSteps.librarian_enters(String,String)"
});
formatter.result({
  "duration": 458095600,
  "status": "passed"
});
formatter.match({
  "location": "LibrarianSteps.librarian_should_be_logged_in()"
});
formatter.result({
  "duration": 29000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Librarian should be able to add books",
  "description": "",
  "id": "librarian-can-add,delete,update,issue-books-and-able-to-view-books;librarian-should-be-able-to-add-books;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "Librarian is on adding book page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "librarian enters \"Glimpses of WorldHistroy\",\"Jawaharlal Nehru\",\"Indian publications\",15,\"Critics\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Book \"Added Successfully\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.librarian_is_on_adding_book_page()"
});
formatter.result({
  "duration": 51400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Glimpses of WorldHistroy",
      "offset": 18
    },
    {
      "val": "Jawaharlal Nehru",
      "offset": 45
    },
    {
      "val": "Indian publications",
      "offset": 64
    },
    {
      "val": "15",
      "offset": 85
    },
    {
      "val": "Critics",
      "offset": 89
    }
  ],
  "location": "LibrarianSteps.librarian_enters(String,String,String,int,String)"
});
formatter.result({
  "duration": 385595800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Added Successfully",
      "offset": 6
    }
  ],
  "location": "LibrarianSteps.book(String)"
});
formatter.result({
  "duration": 915300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Librarian is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Librarian enters \"usha963@gmail.com\",\"Usha@963\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Librarian should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.librarian_is_on_Login_page()"
});
formatter.result({
  "duration": 39400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usha963@gmail.com",
      "offset": 18
    },
    {
      "val": "Usha@963",
      "offset": 38
    }
  ],
  "location": "LibrarianSteps.librarian_enters(String,String)"
});
formatter.result({
  "duration": 194165700,
  "status": "passed"
});
formatter.match({
  "location": "LibrarianSteps.librarian_should_be_logged_in()"
});
formatter.result({
  "duration": 27700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Librarian should be able to add books",
  "description": "",
  "id": "librarian-can-add,delete,update,issue-books-and-able-to-view-books;librarian-should-be-able-to-add-books;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "Librarian is on adding book page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "librarian enters \"Prison Diary\",\"JayaPrakash Naryan\",\"ND publications\",15,\"General\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Book \"Added Successfully\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.librarian_is_on_adding_book_page()"
});
formatter.result({
  "duration": 24900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prison Diary",
      "offset": 18
    },
    {
      "val": "JayaPrakash Naryan",
      "offset": 33
    },
    {
      "val": "ND publications",
      "offset": 54
    },
    {
      "val": "15",
      "offset": 71
    },
    {
      "val": "General",
      "offset": 75
    }
  ],
  "location": "LibrarianSteps.librarian_enters(String,String,String,int,String)"
});
formatter.result({
  "duration": 355579800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Added Successfully",
      "offset": 6
    }
  ],
  "location": "LibrarianSteps.book(String)"
});
formatter.result({
  "duration": 163900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Librarian is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Librarian enters \"usha963@gmail.com\",\"Usha@963\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Librarian should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.librarian_is_on_Login_page()"
});
formatter.result({
  "duration": 113500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usha963@gmail.com",
      "offset": 18
    },
    {
      "val": "Usha@963",
      "offset": 38
    }
  ],
  "location": "LibrarianSteps.librarian_enters(String,String)"
});
formatter.result({
  "duration": 244395800,
  "status": "passed"
});
formatter.match({
  "location": "LibrarianSteps.librarian_should_be_logged_in()"
});
formatter.result({
  "duration": 25100,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Librarian should be able to remove books",
  "description": "",
  "id": "librarian-can-add,delete,update,issue-books-and-able-to-view-books;librarian-should-be-able-to-remove-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "Librarian is on removing book page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "librarian enters 4",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Book deleted successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.librarian_is_on_removing_book_page()"
});
formatter.result({
  "duration": 26000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 17
    }
  ],
  "location": "LibrarianSteps.librarian_enters(int)"
});
formatter.result({
  "duration": 236287600,
  "status": "passed"
});
formatter.match({
  "location": "LibrarianSteps.book_deleted_successfully()"
});
formatter.result({
  "duration": 78700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Librarian is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Librarian enters \"usha963@gmail.com\",\"Usha@963\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Librarian should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.librarian_is_on_Login_page()"
});
formatter.result({
  "duration": 49600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usha963@gmail.com",
      "offset": 18
    },
    {
      "val": "Usha@963",
      "offset": 38
    }
  ],
  "location": "LibrarianSteps.librarian_enters(String,String)"
});
formatter.result({
  "duration": 228048300,
  "status": "passed"
});
formatter.match({
  "location": "LibrarianSteps.librarian_should_be_logged_in()"
});
formatter.result({
  "duration": 43800,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Librarian should be able to issue books",
  "description": "",
  "id": "librarian-can-add,delete,update,issue-books-and-able-to-view-books;librarian-should-be-able-to-issue-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "Librarian is on issuing book page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "librarian enters 12402,48",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Book issued successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.librarian_is_on_issuing_book_page()"
});
formatter.result({
  "duration": 93800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12402",
      "offset": 17
    },
    {
      "val": "48",
      "offset": 23
    }
  ],
  "location": "LibrarianSteps.librarian_enters(int,int)"
});
formatter.result({
  "duration": 446222300,
  "status": "passed"
});
formatter.match({
  "location": "LibrarianSteps.book_issued_successfully()"
});
formatter.result({
  "duration": 102900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Librarian is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Librarian enters \"usha963@gmail.com\",\"Usha@963\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Librarian should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.librarian_is_on_Login_page()"
});
formatter.result({
  "duration": 79200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usha963@gmail.com",
      "offset": 18
    },
    {
      "val": "Usha@963",
      "offset": 38
    }
  ],
  "location": "LibrarianSteps.librarian_enters(String,String)"
});
formatter.result({
  "duration": 296467800,
  "status": "passed"
});
formatter.match({
  "location": "LibrarianSteps.librarian_should_be_logged_in()"
});
formatter.result({
  "duration": 25900,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Librarian should be able to view books",
  "description": "",
  "id": "librarian-can-add,delete,update,issue-books-and-able-to-view-books;librarian-should-be-able-to-view-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "Librarian is on  viewing books page based on names",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "librarian enters \"History\"",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "show books based on name",
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.librarian_is_on_viewing_books_page_based_on_names()"
});
formatter.result({
  "duration": 46100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "History",
      "offset": 18
    }
  ],
  "location": "LibrarianSteps.librarian_enters(String)"
});
formatter.result({
  "duration": 111700,
  "status": "passed"
});
formatter.match({
  "location": "LibrarianSteps.show_books_based_on_name()"
});
formatter.result({
  "duration": 161259500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Librarian is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Librarian enters \"usha963@gmail.com\",\"Usha@963\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Librarian should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.librarian_is_on_Login_page()"
});
formatter.result({
  "duration": 331400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usha963@gmail.com",
      "offset": 18
    },
    {
      "val": "Usha@963",
      "offset": 38
    }
  ],
  "location": "LibrarianSteps.librarian_enters(String,String)"
});
formatter.result({
  "duration": 130524000,
  "status": "passed"
});
formatter.match({
  "location": "LibrarianSteps.librarian_should_be_logged_in()"
});
formatter.result({
  "duration": 25800,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Librarian should be able to view books",
  "description": "",
  "id": "librarian-can-add,delete,update,issue-books-and-able-to-view-books;librarian-should-be-able-to-view-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "Librarian is on  viewing books page based on author Name",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "librarian enters author name \"Lorens\"",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "show books based on  author name",
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.librarian_is_on_viewing_books_page_based_on_author_Name()"
});
formatter.result({
  "duration": 31800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lorens",
      "offset": 30
    }
  ],
  "location": "LibrarianSteps.librarian_enters_author_name(String)"
});
formatter.result({
  "duration": 54500,
  "status": "passed"
});
formatter.match({
  "location": "LibrarianSteps.show_books_based_on_author_name()"
});
formatter.result({
  "duration": 137235500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Librarian is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Librarian enters \"usha963@gmail.com\",\"Usha@963\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Librarian should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.librarian_is_on_Login_page()"
});
formatter.result({
  "duration": 36100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usha963@gmail.com",
      "offset": 18
    },
    {
      "val": "Usha@963",
      "offset": 38
    }
  ],
  "location": "LibrarianSteps.librarian_enters(String,String)"
});
formatter.result({
  "duration": 112662400,
  "status": "passed"
});
formatter.match({
  "location": "LibrarianSteps.librarian_should_be_logged_in()"
});
formatter.result({
  "duration": 20600,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Librarian should be able to view books based on id",
  "description": "",
  "id": "librarian-can-add,delete,update,issue-books-and-able-to-view-books;librarian-should-be-able-to-view-books-based-on-id",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 40,
  "name": "Librarian is on  viewing books page based on book id",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "librarian enters book id 51",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "show books based on  book id",
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.librarian_is_on_viewing_books_page_based_on_book_id()"
});
formatter.result({
  "duration": 35100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "51",
      "offset": 25
    }
  ],
  "location": "LibrarianSteps.librarian_enters_book_id(int)"
});
formatter.result({
  "duration": 96300,
  "status": "passed"
});
formatter.match({
  "location": "LibrarianSteps.show_books_based_on_book_id()"
});
formatter.result({
  "duration": 135429200,
  "status": "passed"
});
formatter.uri("register.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration",
  "description": "",
  "id": "user-registration",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User Registration with given details",
  "description": "",
  "id": "user-registration;user-registration-with-given-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \u003cfirstName\u003e,\u003clastName\u003e,\u003cemail\u003e,\u003cpassword\u003e,\u003cmobileNo\u003e,\u003crole\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be \u003cstatus\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "user-registration;user-registration-with-given-details;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "password",
        "mobileNo",
        "role",
        "status"
      ],
      "line": 10,
      "id": "user-registration;user-registration-with-given-details;;1"
    },
    {
      "cells": [
        "\"Shiva\"",
        "\"Kumar\"",
        "\"shiva@gmail.com\"",
        "\"Shiva@123\"",
        "9638527410",
        "\"admin\"",
        "\"registered successfully\""
      ],
      "line": 11,
      "id": "user-registration;user-registration-with-given-details;;2"
    },
    {
      "cells": [
        "\"Venkata\"",
        "\"Chary\"",
        "\"venkata@gmail.com\"",
        "\"Venkata@123\"",
        "987654321",
        "\"student\"",
        "\"registered successfully\""
      ],
      "line": 12,
      "id": "user-registration;user-registration-with-given-details;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "User Registration with given details",
  "description": "",
  "id": "user-registration;user-registration-with-given-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"Shiva\",\"Kumar\",\"shiva@gmail.com\",\"Shiva@123\",9638527410,\"admin\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be \"registered successfully\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.user_is_on_registration_page()"
});
formatter.result({
  "duration": 47400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shiva",
      "offset": 13
    },
    {
      "val": "Kumar",
      "offset": 21
    },
    {
      "val": "shiva@gmail.com",
      "offset": 29
    },
    {
      "val": "Shiva@123",
      "offset": 47
    },
    {
      "val": "9638527410",
      "offset": 58
    },
    {
      "val": "admin",
      "offset": 70
    }
  ],
  "location": "LibrarianSteps.user_enters(String,String,String,String,int,String)"
});
formatter.result({
  "duration": 270210000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "registered successfully",
      "offset": 16
    }
  ],
  "location": "LibrarianSteps.user_should_be(String)"
});
formatter.result({
  "duration": 88500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User Registration with given details",
  "description": "",
  "id": "user-registration;user-registration-with-given-details;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"Venkata\",\"Chary\",\"venkata@gmail.com\",\"Venkata@123\",987654321,\"student\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be \"registered successfully\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LibrarianSteps.user_is_on_registration_page()"
});
formatter.result({
  "duration": 37800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Venkata",
      "offset": 13
    },
    {
      "val": "Chary",
      "offset": 23
    },
    {
      "val": "venkata@gmail.com",
      "offset": 31
    },
    {
      "val": "Venkata@123",
      "offset": 51
    },
    {
      "val": "987654321",
      "offset": 64
    },
    {
      "val": "student",
      "offset": 75
    }
  ],
  "location": "LibrarianSteps.user_enters(String,String,String,String,int,String)"
});
formatter.result({
  "duration": 269451200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "registered successfully",
      "offset": 16
    }
  ],
  "location": "LibrarianSteps.user_should_be(String)"
});
formatter.result({
  "duration": 77000,
  "status": "passed"
});
formatter.uri("studentLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Student Login",
  "description": "",
  "id": "student-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Student login with given details",
  "description": "",
  "id": "student-login;student-login-with-given-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Student is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Student enters \u003cemail\u003e,\u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Student should be logged in",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "student-login;student-login-with-given-details;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 10,
      "id": "student-login;student-login-with-given-details;;1"
    },
    {
      "cells": [
        "\"aravind@gmail.com\"",
        "\"Aravind@1234\""
      ],
      "line": 11,
      "id": "student-login;student-login-with-given-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Student login with given details",
  "description": "",
  "id": "student-login;student-login-with-given-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Student is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Student enters \"aravind@gmail.com\",\"Aravind@1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Student should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_Login_page()"
});
formatter.result({
  "duration": 1484400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aravind@gmail.com",
      "offset": 16
    },
    {
      "val": "Aravind@1234",
      "offset": 36
    }
  ],
  "location": "StudentSteps.student_enters(String,String)"
});
formatter.result({
  "duration": 161756700,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.student_should_be_logged_in()"
});
formatter.result({
  "duration": 46500,
  "status": "passed"
});
formatter.uri("studentOperations.feature");
formatter.feature({
  "line": 1,
  "name": "Student can request,return and able to view books",
  "description": "",
  "id": "student-can-request,return-and-able-to-view-books",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Student is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Student enters \"aravind@gmail.com\",\"Aravind@1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Student should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_Login_page()"
});
formatter.result({
  "duration": 25300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aravind@gmail.com",
      "offset": 16
    },
    {
      "val": "Aravind@1234",
      "offset": 36
    }
  ],
  "location": "StudentSteps.student_enters(String,String)"
});
formatter.result({
  "duration": 106825500,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.student_should_be_logged_in()"
});
formatter.result({
  "duration": 27500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Student should be able to request books",
  "description": "",
  "id": "student-can-request,return-and-able-to-view-books;student-should-be-able-to-request-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Student is on request book page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "BookId  and UserId are given 52, 12202",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Book Requested Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_request_book_page()"
});
formatter.result({
  "duration": 43700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "52",
      "offset": 29
    },
    {
      "val": "12202",
      "offset": 33
    }
  ],
  "location": "StudentSteps.bookid_and_UserId_are_given(int,int)"
});
formatter.result({
  "duration": 292498600,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.book_Requested_Successfully()"
});
formatter.result({
  "duration": 99600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Student is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Student enters \"aravind@gmail.com\",\"Aravind@1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Student should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_Login_page()"
});
formatter.result({
  "duration": 104300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aravind@gmail.com",
      "offset": 16
    },
    {
      "val": "Aravind@1234",
      "offset": 36
    }
  ],
  "location": "StudentSteps.student_enters(String,String)"
});
formatter.result({
  "duration": 270006200,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.student_should_be_logged_in()"
});
formatter.result({
  "duration": 27400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Student should be able to return books",
  "description": "",
  "id": "student-can-request,return-and-able-to-view-books;student-should-be-able-to-return-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "Student is on returning book page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Book  and User are given 26, 12002",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Book Returned Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_returning_book_page()"
});
formatter.result({
  "duration": 63500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "26",
      "offset": 25
    },
    {
      "val": "12002",
      "offset": 29
    }
  ],
  "location": "StudentSteps.book_and_User_are_given(int,int)"
});
formatter.result({
  "duration": 241958700,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.book_Returned_Successfully()"
});
formatter.result({
  "duration": 50500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Student is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Student enters \"aravind@gmail.com\",\"Aravind@1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Student should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_Login_page()"
});
formatter.result({
  "duration": 72500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aravind@gmail.com",
      "offset": 16
    },
    {
      "val": "Aravind@1234",
      "offset": 36
    }
  ],
  "location": "StudentSteps.student_enters(String,String)"
});
formatter.result({
  "duration": 295618300,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.student_should_be_logged_in()"
});
formatter.result({
  "duration": 19800,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Student should be able to view books based on names",
  "description": "",
  "id": "student-can-request,return-and-able-to-view-books;student-should-be-able-to-view-books-based-on-names",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "Student is on  viewing books page based on names",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "student enters \"History\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "show books based on bookname",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_viewing_books_page_based_on_names()"
});
formatter.result({
  "duration": 30000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "History",
      "offset": 16
    }
  ],
  "location": "StudentSteps.student_enters(String)"
});
formatter.result({
  "duration": 101300,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.show_books_based_on_bookname()"
});
formatter.result({
  "duration": 109178400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Student is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Student enters \"aravind@gmail.com\",\"Aravind@1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Student should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_Login_page()"
});
formatter.result({
  "duration": 39100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aravind@gmail.com",
      "offset": 16
    },
    {
      "val": "Aravind@1234",
      "offset": 36
    }
  ],
  "location": "StudentSteps.student_enters(String,String)"
});
formatter.result({
  "duration": 102469600,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.student_should_be_logged_in()"
});
formatter.result({
  "duration": 23200,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Student should be able to view books based on author name",
  "description": "",
  "id": "student-can-request,return-and-able-to-view-books;student-should-be-able-to-view-books-based-on-author-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "Student is on  viewing books page based on author Name",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "student enters author name \"Lorens\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "show books based on  authorname",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_viewing_books_page_based_on_author_Name()"
});
formatter.result({
  "duration": 31200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lorens",
      "offset": 28
    }
  ],
  "location": "StudentSteps.student_enters_author_name(String)"
});
formatter.result({
  "duration": 83900,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.show_books_based_on_authorname()"
});
formatter.result({
  "duration": 128763200,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Student is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Student enters \"aravind@gmail.com\",\"Aravind@1234\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Student should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_Login_page()"
});
formatter.result({
  "duration": 34000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aravind@gmail.com",
      "offset": 16
    },
    {
      "val": "Aravind@1234",
      "offset": 36
    }
  ],
  "location": "StudentSteps.student_enters(String,String)"
});
formatter.result({
  "duration": 121426000,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.student_should_be_logged_in()"
});
formatter.result({
  "duration": 25700,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Student should be able to view books based on id",
  "description": "",
  "id": "student-can-request,return-and-able-to-view-books;student-should-be-able-to-view-books-based-on-id",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "Student is on  viewing books page based on book id",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "student enters book id 51",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "show books based on  bookid",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_viewing_books_page_based_on_book_id()"
});
formatter.result({
  "duration": 30900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "51",
      "offset": 23
    }
  ],
  "location": "StudentSteps.student_enters_book_id(int)"
});
formatter.result({
  "duration": 118800,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.show_books_based_on_bookid()"
});
formatter.result({
  "duration": 133277500,
  "status": "passed"
});
});