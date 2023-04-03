package StepDefinitions;

import Pages.CodeElementPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    CodeElementPage cep= new CodeElementPage();
    @When("Login the website with the current account {string} {string}")

    public void loginTheWebsiteWithTheCurrentAccountUsernamePassword(String username, String password) {
        cep.sendKeysFunction(cep.username2,username);
        cep.sendKeysFunction(cep.password2, password);
        cep.clickFunction(cep.login);


    }

    @And("Verify that you are logged in")
    public void verifyThatYouAreLoggedIn() {
         cep.verifyContains(cep.loginSuccess,"Accounts");


    }

    @Then("Log out")
    public void logOut() {
        cep.clickFunction(cep.logoutLink);
    }

    @When("Login with invalid account details {string} {string}")
    public void loginWithInvalidAccountDetailsWrongusernameWrongpassword(String wrongusername, String wrongpassword) {
        cep.sendKeysFunction(cep.username2, wrongusername);
        cep.sendKeysFunction(cep.password2, wrongpassword);
        cep.clickFunction(cep.login);
        System.out.println(cep.loginError.getText());
    }

    @Then("verify that you are not logged in")
    public void verifyThatYouAreNotLoggedIn() {
        cep.verifyContains(cep.loginError,"not");

    }
}
