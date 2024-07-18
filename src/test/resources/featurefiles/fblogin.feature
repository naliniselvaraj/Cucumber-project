@Feature1
Feature:

To validate login functionality of facebook application

Scenario:

To validate login with valid username and invalid password

Given to launch the chrome browser

When to enter the valid username in email field
#one dimensional list
#|selenium@gmail.com|java@gmail.com|framework@gmail.com|sql@gmail.com|

#one dimensional map
|email1|java@gmail.com|
|email2|ccc@gmail.com|
|email3|c++@gmail.com|
|email4|ipt@gmail.com|

And to enter the invalid password in the password field
#Two dimensional list
#|selenium|java|framework|sql|
#|123     |456 |789      |000|
#|abc     |efg |hij      |xyz|

#two dimensional map
|password1|password2|password3| 
|java     |selenium |sql      |
|123      |456      |789      |
|abc      |def      |hij      |
And to click the login button

Then to close the browser

@Feature2
Scenario Outline:

To validate login with invalid username and invalid password

Given to hit the chrome browser

When to enter the invalid username in "<email>"email field

And to enter the invalid password in "<password>"password field

And to click the button login

Then to close the chrome browser

Examples:

|email              |password |
|selenium@gmail.com |selenium |
|java@gmail.com     |java     |
|framework@gmail.com|framework|
|sql@gmail.com      |sql      |
|cucumber@gmail.com |cucumber |


