<<<<<<< HEAD
# Mini Bootcamp WebAutomation Selenium
=======
# Project Name
Web Automation After Office
---
🚀 Quick Start
### 1. Clone the repository:
```bash
git clone https://github.com/simanjuntakalbert57/minibootcampwebautomation.git
```

### 2. Build the project:
```bash
mvn clean install
```

### 3. Run the tests:
```bash
mvn test -Dsurefire.suiteXmlFiles=testng.xml
```


## 🛠️ How to Run the Tests

This project uses **Maven** for build automation and test execution. Follow the steps below to run the tests.

### 1. Run Tests with Maven

To execute the tests using Maven, use the following command:

```bash
mvn test -Dsurefire.suiteXmlFiles=testng.xml
```

### 2. Run Tests with Parallel

To execute the tests using Parallel, adjust testng.xml:

```bash
<suite name="ParallelSuite" parallel="methods" thread-count="4">
    <test name="Test1">
        <classes>
            <class name="<class_name>" />
        </classes>
    </test>
</suite>
```
>>>>>>> 3be714c (final mini bootcamp after)
