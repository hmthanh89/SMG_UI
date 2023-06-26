# Introduction:

This repository contains a Selenium Framework designed for web application testing and API testing. The framework provides a structured and efficient approach to automate web testing using Selenium WebDriver and Java programming language.

# Features:

1. Page Object Model (POM): The framework follows the Page Object Model design pattern, which promotes modular and reusable test code. Each web page is represented as a separate class, encapsulating the elements and actions related to that page.

2. Test Data Management: The framework supports test data management separately from test scripts. 

3. Configuration Management: A configuration file (driver.setting.properties) is provided to manage various test environment configurations such as browser settings, timeouts, and other properties. This allows easy customization and adaptability to different testing environments.

4. Reporting: The framework generates detailed test reports that provide a comprehensive view of test execution results. It includes information about test steps, assertions, and any failures or errors encountered during the test run.

5. Logging: Logging functionality is implemented to capture relevant information during test execution. Detailed logs help in debugging and troubleshooting issues encountered during test runs.

# Setup and Usage:
1. Prerequisites:
	- Java Development Kit (JDK) installed.<br />
	- IDE (Eclipse, IntelliJ, etc.) for Java development.<br />
	- Browser drivers (Chrome, Firefox, etc.) installed and added to the system PATH.<br />
2. Clone the Repository:
	- Clone this repository to your local machine using Git or download the source code as a ZIP file.
3. Import the Project:
	- Open your preferred IDE and import the project as a Maven project.
4. Execute Tests:
	- UI Test: Right click on ui_test.xml and select 'Run as TestNG Suite'.<br />
	- API Test: Right click on api_test.xml and select 'Run as TestNG Suite'.<br />
	- xml files are placed at 'src/test/resources/suites'<br />
5. View Test Reports:
	- After test execution, the framework generates detailed test reports. Access the generated reports to view the test results, including any failures or errors encountered.<br />
	- Report location: SeleniumJava-master\SeleniumLevel3\TestReport <br />

# Contact:
For any inquiries or questions regarding this Selenium Framework, please contact hoangmaithanh7772@gmail.com.

Happy Testing!