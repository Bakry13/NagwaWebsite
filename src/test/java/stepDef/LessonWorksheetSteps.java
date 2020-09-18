package stepDef;

import java.io.IOException;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Home;
import pages.Lesson;
import pages.Search;
import pages.Worksheet;
import utilities.ExtentReport;
import utilities.Screenshot;
import utilities.TestBase;

public class LessonWorksheetSteps 
{
	@Given("^Nagwa website is opened$")
	public void nagwa_website_is_opened() {
		ExtentReport.startTC("Get the number of questions in lesson worksheet");
		TestBase.openWebsite(); //Open Nagwa website
	}

	@When("^I choose English language to open the home page$")
	public void i_choose_a_language_to_open_the_home_page() {
		Home.clickEnglish();
	}

	@When("^click on the search icon to start searching on Nagwa lessons$")
	public void click_on_the_search_icon_to_start_searching_on_nagwa_lessons() {
		Home.clickSearch();
	}

	@When("^write \"(.*)\"$")
	public void write(String word) {
		Home.writeSearchTxt(word);
	}

	@When("^click search$")
	public void press_search() {
		Home.clickGlobalSearch();
	}

	@When("^click on second lesson in the search result$")
	public void press_on_second_lesson_in_the_search_result() {
		Search.clickSecondResult();
	}

	@When("^click preview$")
	public void press_preview() {
		Lesson.clickPreview();
	}

	@Then("^return number of questions$")
	public void return_number_of_questions() throws IOException {
		int questionCount = Worksheet.questionContainerSize();
		ExtentReport.test.log(LogStatus.PASS, "Number of questions in second search result of addition lesson is: "+ Integer.toString(questionCount));
		Screenshot.saveScreenshot(TestBase.driver, "Get the number of questions in lesson worksheet"); //take screenshot
		System.out.println(questionCount);
	}
}
