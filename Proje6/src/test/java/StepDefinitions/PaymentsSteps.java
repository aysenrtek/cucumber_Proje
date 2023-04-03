package StepDefinitions;

import Pages.CodeElementPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentsSteps {
    CodeElementPage cep=new CodeElementPage();
    @When("Click the bill pay")
    public void clickTheBillPay() {
        cep.clickFunction(cep.billpayClick);

    }
    @And("Payment of the bills  {string}")
    public void paymentOfTheBills(String arg0) {
        cep.sendKeysFunction(cep.payeeName, "Cihat");
        cep.sendKeysFunction(cep.adress2, "Kensington street");
        cep.sendKeysFunction(cep.city2,"Houston");
        cep.sendKeysFunction(cep.state2,"Texas");
        cep.sendKeysFunction(cep.zipcode2,"12458");
        cep.sendKeysFunction(cep.phonenumber,"+1478933512");
        cep.sendKeysFunction(cep.accountNumber,"19116");
        cep.sendKeysFunction(cep.verifyAccount,"19116");
        cep.sendKeysFunction(cep.amount, arg0);
        cep.clickFunction(cep.payment);

    }


    @Then("Verify that you have paid for the bill")
    public void verifyThatYouHavePaidForTheBill() {
        cep.verifyContains(cep.verifyPayment,"Payment");
    }


}
