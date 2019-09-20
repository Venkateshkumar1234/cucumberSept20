$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Training1/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Success Login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enter \"sam\" and \"abcd12\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.Credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "When "
});
formatter.match({
  "location": "Step.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.home_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});