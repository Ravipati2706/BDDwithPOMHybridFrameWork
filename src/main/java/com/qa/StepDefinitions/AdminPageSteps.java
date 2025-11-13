package com.qa.StepDefinitions;

import java.util.List;
import java.util.Map;

import com.qa.factory.DriverFactory;
import com.qa.pages.AdminPage;
import com.qa.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class AdminPageSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private AdminPage adpage;

	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credtable) {
		List<Map<String, String>> credlist = credtable.asMaps();
		String UN = credlist.get(0).get("username");
		String PS = credlist.get(0).get("password");
		DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		adpage = loginPage.doLogin(UN, PS);

	}

	@Given("user is on Admin page")
	public void user_is_on_admin_page() {
		String title = adpage.getAdminPageTitle();
		System.out.println("Admin Page title is: " + title);

	}

	@Then("user gets admin user management section")
	public void user_gets_admin_user_management_section(DataTable admsectiontable) {
		List<String> expadmseclist = admsectiontable.asList();
		System.out.println("Expected Admin Section List:" + expadmseclist);
		List<String> actualadmseclist = adpage.getAdminSectionList();
		System.out.println("Actual Admin Section List:" + actualadmseclist);
		Assert.assertTrue(expadmseclist.containsAll(actualadmseclist));
	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer expectedsectioncount) {
		Assert.assertTrue(adpage.getAdminSectionCount() == expectedsectioncount);

	}

}
