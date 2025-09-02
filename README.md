# RestAssured API Automation Framework

![Java](https://img.shields.io/badge/Java-17-orange)  
![Maven](https://img.shields.io/badge/Maven-Build-blue)  
![TestNG](https://img.shields.io/badge/TestNG-Framework-green)  
![Allure](https://img.shields.io/badge/Allure-Report-purple)  
![GitHub Actions](https://img.shields.io/badge/CI-GitHub%20Actions-yellowgreen)

Automated API tests using RestAssured for RESTful services, integrated with Java, TestNG, Maven, Allure reporting, and GitHub Actions for CI/CD.

---

## 📑 Table of Contents
1. [Overview](#-overview)
2. [Technologies & Tools](#-technologies--tools)
3. [Project Structure](#-project-structure)
4. [Setup & Installation](#-setup--installation)
5. [Running Tests](#-running-tests)
6. [Test Reporting](#-test-reporting)
7. [Continuous Integration (GitHub Actions)](#-continuous-integration-github-actions)
8. [Screenshots & Logs](#-screenshots--logs)

---

## 🔎 Overview
This framework automates API tests for RESTful services using RestAssured, validating endpoints with various HTTP methods (GET, POST, PUT, DELETE), organized with TestNG and Maven.

---

## 🛠 Technologies & Tools
- **Language**: Java  
- **Build Tool**: Maven (`pom.xml`)  
- **Testing Framework**: TestNG (`testng.xml`)  
- **Reporting**: Allure (`.allure/`, `allure-results/`)  
- **CI/CD**: GitHub Actions (`.github/workflows/`)  
- **Artifacts**: Reports (`target/`), compiled artifacts (`target/`)

---

## 📂 Project Structure
```
RestAssured_test/
├── .allure/
├── allure-results/
├── src/
│   ├── main/java/…
│   └── test/java/…
├── target/
├── .github/
│   └── workflows/
├── pom.xml
├── testng.xml
└── README.md
```

---

## ⚙️ Setup & Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/JlassiHoussem/RestAssured_test.git
   cd RestAssured_test
   ```
2. Build with Maven:
   ```bash
   mvn clean install
   ```

---

## ▶️ Running Tests
- Default TestNG suite:
  ```bash
  mvn test
  ```

---

## 📊 Test Reporting
Generate and view Allure report:
```bash
mvn allure:serve
```
The report opens automatically in the browser.

---

## 🔄 Continuous Integration (GitHub Actions)
The project includes a GitHub Actions workflow for CI pipelines. GitHub Actions can:
- Checkout the repository  
- Build with Maven (`mvn test`)  
- Publish Allure reports  
- Archive artifacts (reports)

---

## 📸 Screenshots & Logs
- Test outputs stored in `target/`  
- Allure results in `allure-results/`  
- Visual reports generated in `.allure/`  

---
