$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FbSignUp.feature");
formatter.feature({
  "name": "To validate signup page in facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To create New Account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "Fb_Signup.to_launch_the_browser_and_maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of fb",
  "keyword": "When "
});
formatter.match({
  "location": "Fb_Signup.to_launch_the_url_of_fb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the create new account button",
  "keyword": "And "
});
formatter.match({
  "location": "Fb_Signup.to_click_the_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass firstname in firstname text box",
  "rows": [
    {
      "cells": [
        "Jeeva",
        "Sakthi",
        "Jeevasakthi"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Fb_Signup.to_pass_firstname_in_firstname_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass surname in surname box",
  "rows": [
    {
      "cells": [
        "Java",
        "Selenium",
        "frameworks"
      ]
    },
    {
      "cells": [
        "Api",
        "TestNg",
        "cucumber"
      ]
    },
    {
      "cells": [
        "Automation",
        "Manual",
        "Testing"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Fb_Signup.to_pass_surname_in_surname_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass mob or email in email box",
  "rows": [
    {
      "cells": [
        "Number1",
        "9677783073"
      ]
    },
    {
      "cells": [
        "Number2",
        "9043617617"
      ]
    },
    {
      "cells": [
        "Email1",
        "jeevasakthi2404@gamil.com"
      ]
    },
    {
      "cells": [
        "Email2",
        "jkriderns200@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Fb_Signup.to_pass_mob_or_email_in_email_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To create new password in new password box",
  "rows": [
    {
      "cells": [
        "Password1",
        "Password2",
        "Password3"
      ]
    },
    {
      "cells": [
        "pass@1234",
        "1234@pass",
        "12@34pass"
      ]
    },
    {
      "cells": [
        "4321@pass",
        "pass@4321",
        "@pass1234"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Fb_Signup.to_create_new_password_in_new_password_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Fb_Signup.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});