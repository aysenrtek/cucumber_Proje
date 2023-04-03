package StepDefinitions;

import Pages.CodeElementPage;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
    CodeElementPage cep= new CodeElementPage();
    @Given("Navigate to parabank site")
    public void navigateToParabankSite() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");

    }

    @When("Click Register Link")
    public void clickRegisterLink() {
        cep.clickFunction(cep.register);
    }

    @And("Enter user infos")
    public void enterUserInfos() {
        cep.sendKeysFunction(cep.firstName, "Cihat");
        cep.sendKeysFunction(cep.lastName, "Degerli");
        cep.sendKeysFunction(cep.address,"Kensington street");
        cep.sendKeysFunction(cep.city,"Houston");
        cep.sendKeysFunction(cep.state,"Texas");
        cep.sendKeysFunction(cep.zipcode,"15489");
        cep.sendKeysFunction(cep.phone,"+1 254 789 15 45");
        cep.sendKeysFunction(cep.ssn,"54796");
        cep.sendKeysFunction(cep.username,"CdCode");
        cep.sendKeysFunction(cep.password,"14589");
        cep.sendKeysFunction(cep.repeatedPassword,"14589");
        cep.clickFunction(cep.registerClick);
    }

    @Then("Verify that account has been created")
    public void verifyThatAccountHasBeenCreated() {
        cep.verifyContains(cep.WelcomeAssortion,"Welcome");
    }
}

