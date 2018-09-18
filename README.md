# Cucumber_Selenium_Maven
Demo maven project using Cucumber BDD with selenium

Requirements:
Jdk 1.8+
IDE such as Eclipse/Intellij

Setup:
Open IntelliJ
Import Project
Import project from external model
Select Maven
Next
Put file path for this project in root directory
Next
Next
Verify jdk1.8 set as the SDK
Next
Finish

Run
Initially run maven clean install (Run, Run configurations, click the + and select Maven)
  put clean install as the command line arguments and run
  
After, run as maven test
  put test in the command line arguments and run

To Run as Junit:
Run the 'RuneCukeTest' class as a junit test

Other notes:
Configuration for web driver is in src/main/java/config
Step definitions are located in src/test/java/stepDefintions(the actual code)
ALL feature files should be in src/test/resources
Step definitions and feature file steps are 'glued' together by specifying the path to each in RunCukeTest
Test steps are broken up into 'actions'

Currently only Chrome is working




