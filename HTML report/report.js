$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/LENOVO/eclipse-workspace/cucumber%20project/src/test/resources/featurefiles/fblogin.feature");
formatter.feature({
  "name": "",
  "description": "To validate login functionality of facebook application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "To validate login with valid username and invalid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "to launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.to_launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter the valid username in email field",
  "rows": [
    {
      "cells": [
        "email1",
        "java@gmail.com"
      ]
    },
    {
      "cells": [
        "email2",
        "ccc@gmail.com"
      ]
    },
    {
      "cells": [
        "email3",
        "c++@gmail.com"
      ]
    },
    {
      "cells": [
        "email4",
        "ipt@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "facebook.to_enter_the_valid_username_in_email_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter the invalid password in the password field",
  "rows": [
    {
      "cells": [
        "password1",
        "password2",
        "password3"
      ]
    },
    {
      "cells": [
        "java",
        "selenium",
        "sql"
      ]
    },
    {
      "cells": [
        "123",
        "456",
        "789"
      ]
    },
    {
      "cells": [
        "abc",
        "def",
        "hij"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "facebook.to_enter_the_invalid_password_in_the_password_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "",
  "description": "To validate login with invalid username and invalid password",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.step({
  "name": "to hit the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "to enter the invalid username in \"\u003cemail\u003e\"email field",
  "keyword": "When "
});
formatter.step({
  "name": "to enter the invalid password in \"\u003cpassword\u003e\"password field",
  "keyword": "And "
});
formatter.step({
  "name": "to click the button login",
  "keyword": "And "
});
formatter.step({
  "name": "to close the chrome browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "selenium@gmail.com",
        "selenium"
      ]
    },
    {
      "cells": [
        "java@gmail.com",
        "java"
      ]
    },
    {
      "cells": [
        "framework@gmail.com",
        "framework"
      ]
    },
    {
      "cells": [
        "sql@gmail.com",
        "sql"
      ]
    },
    {
      "cells": [
        "cucumber@gmail.com",
        "cucumber"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "To validate login with invalid username and invalid password",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Feature2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "to hit the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Fbsceneriooutline.to_hit_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter the invalid username in \"selenium@gmail.com\"email field",
  "keyword": "When "
});
formatter.match({
  "location": "Fbsceneriooutline.toEnterTheInvalidUsernameInEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter the invalid password in \"selenium\"password field",
  "keyword": "And "
});
formatter.match({
  "location": "Fbsceneriooutline.toEnterTheInvalidPasswordInPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click the button login",
  "keyword": "And "
});
formatter.match({
  "location": "Fbsceneriooutline.toClickTheButtonLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Fbsceneriooutline.toCloseTheChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "To validate login with invalid username and invalid password",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Feature2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "to hit the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Fbsceneriooutline.to_hit_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter the invalid username in \"java@gmail.com\"email field",
  "keyword": "When "
});
formatter.match({
  "location": "Fbsceneriooutline.toEnterTheInvalidUsernameInEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter the invalid password in \"java\"password field",
  "keyword": "And "
});
formatter.match({
  "location": "Fbsceneriooutline.toEnterTheInvalidPasswordInPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click the button login",
  "keyword": "And "
});
formatter.match({
  "location": "Fbsceneriooutline.toClickTheButtonLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Fbsceneriooutline.toCloseTheChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "To validate login with invalid username and invalid password",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Feature2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "to hit the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Fbsceneriooutline.to_hit_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter the invalid username in \"framework@gmail.com\"email field",
  "keyword": "When "
});
formatter.match({
  "location": "Fbsceneriooutline.toEnterTheInvalidUsernameInEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter the invalid password in \"framework\"password field",
  "keyword": "And "
});
formatter.match({
  "location": "Fbsceneriooutline.toEnterTheInvalidPasswordInPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click the button login",
  "keyword": "And "
});
formatter.match({
  "location": "Fbsceneriooutline.toClickTheButtonLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Fbsceneriooutline.toCloseTheChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "To validate login with invalid username and invalid password",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Feature2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "to hit the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Fbsceneriooutline.to_hit_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter the invalid username in \"sql@gmail.com\"email field",
  "keyword": "When "
});
formatter.match({
  "location": "Fbsceneriooutline.toEnterTheInvalidUsernameInEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter the invalid password in \"sql\"password field",
  "keyword": "And "
});
formatter.match({
  "location": "Fbsceneriooutline.toEnterTheInvalidPasswordInPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click the button login",
  "keyword": "And "
});
formatter.match({
  "location": "Fbsceneriooutline.toClickTheButtonLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Fbsceneriooutline.toCloseTheChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "To validate login with invalid username and invalid password",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Feature2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "to hit the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Fbsceneriooutline.to_hit_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter the invalid username in \"cucumber@gmail.com\"email field",
  "keyword": "When "
});
formatter.match({
  "location": "Fbsceneriooutline.toEnterTheInvalidUsernameInEmailField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter the invalid password in \"cucumber\"password field",
  "keyword": "And "
});
formatter.match({
  "location": "Fbsceneriooutline.toEnterTheInvalidPasswordInPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click the button login",
  "keyword": "And "
});
formatter.match({
  "location": "Fbsceneriooutline.toClickTheButtonLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Fbsceneriooutline.toCloseTheChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});