Feature: To validate signup page in facebook
@tag1
Scenario: To create New Account
Given To launch the browser and maximize window
When To launch the url of fb
And To click the create new account button

# one dimensional list
And To pass firstname in firstname text box
|Jeeva|Sakthi|Jeevasakthi|

#Two dimensional list
And To pass surname in surname box
|Java      |Selenium|frameworks|
|Api       |TestNg  |cucumber  |
|Automation|Manual  |Testing   |

#One dimensional map
And To pass mob or email in email box
# key           value
|Number1|9677783073               |
|Number2|9043617617               |
|Email1 |jeevasakthi2404@gamil.com|
|Email2 |jkriderns200@gmail.com   |

#Two dimensional Map
And To create new password in new password box
|Password1|Password2|Password3|
|pass@1234|1234@pass|12@34pass|
|4321@pass|pass@4321|@pass1234|

Then To close the browser
@tag2
Scenario: To validate username and password in fb login page
Given To launch the browser and maximaize window
When To launch the url of fb
And To pass the email id in username field
And To pass the password in the password field
And To click the login button
Then To close the browser


