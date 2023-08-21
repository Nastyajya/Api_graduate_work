<h1 >API test automation project for <a href="https://dummy.restapiexample.com/#google_vignette/">dummy.restapiexample.com</a></h1>
<p align="center">
  <img src="media/logo_header .png" width="100">
</p>
<a name="Ссылка"></a>

- <a href="#tools">Stack of technologies</a>
- <a href="#tests">List of checks</a>
- <a href="#run">Running tests from the terminal</a>
- <a href="#remote">Remote running tests</a>
- <a href="#jenkins-report">Running tests in Jenkins</a>
- <a href="#allure-report">Test results report in Allure Report</a>
- <a href="#allure-testops">Integration with Allure TestOps</a>
- <a href="#jira">Integration with Jira</a>
- <a href="#telegram">Integration with Telegram</a>


<a id="tools"></a>
## :computer: Stack of technologies

| Java                                                                                                    | IntelliJ Idea                                                                                                                | Allure                                                                                                                    | Allure TestOps                                                                                                      | GitHub                                                                                                    | JUnit 5                                                                                                           | Gradle                                                                                                   | REST Assured                                                                                                   |  Jenkins                                                                                                                |
|:--------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------------------------------|
| <a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50"  alt="Java"/></a> | <a id ="tech" href="https://www.jetbrains.com/idea/"><img src="media/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/allure-framework"><img src="media/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> | <a href="https://qameta.io/"><img src="media/logo/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/></a> | <a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="media/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://rest-assured.io/"><img src="media/logo/RestAssured.svg" width="50" height="50"  alt="RestAssured"/></a>  |   <a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://www.atlassian.com/ru/software/jira"><img src="media/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a> |
<a id="tests"></a>

## Checks carried out:


- [x] Checking id and username
- [x] Checking user creation
- [x] Checking username change
- [x] User deletion check

<a id="run"></a>
## :computer: Running tests from the terminal
### Remote running tests

```
gradle clean test  
```

<a id="jenkins-report"></a>
## <img width="4%" title="Jenkins" src="media/logo/Jenkins.svg"> Running tests in [Jenkins](https://jenkins.autotests.cloud/job/Api_graduate_work_Zelenskaia/)

To pass autotests, you need to click on <code><strong>*Собрать сейчас*</strong></code> 

<p align="center">
  <img src="media/screenshot/JenkinsSborka.png" alt="Jenkins" width="800">
</p>


<a id="allure-report"></a>
## <img width="4%" title="Allure Report" src="media/logo/Allure.svg"> Test results report in [Allure Report](https://jenkins.autotests.cloud/job/Api_graduate_work_Zelenskaia/allure/)

<p align="center">
  <img src="media/logo/allure.svg" alt="Jenkins" width="600">
</p>

From <code><strong>Jenkins</strong></code> 
With Jenkins, reports are generated in <code><strong>Allure</strong></code>

<p align="center">
  <img src="media/screenshots/rest_report.png" alt="jenkins-allure" width="600">
</p>

<a id="allure-testops"></a>
## <img width="4%" title="Allure TestOPS" src="media/logo/Allure_TO.svg"> Integration with [Allure TestOps](https://allure.autotests.cloud/launch/28997)

## Test-cases

<p align="center">
  <img src="media/logo/rest_allure.png" alt="testops" width="600">
</p>

<a id="telegram"></a>
## <img width="4%" title="Telegram" src="media/logo/Telegram.svg"> Telegram notifications using a bot
After passing all the tests, an automatic report is sent to the <code>Telegram</code> messenger

<p align="center">
<img title="Telegram Notifications" src="media//logo/telegram_rest.png" width="500">
</p>



[Вернуться к оглавлению ⬆](#Ссылка)
