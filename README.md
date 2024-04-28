# Java Selenium Project: Automated Actitime Software

## Overview
This project automates functionality within Actitime, an employee time tracking software, using Java Selenium. It utilizes Selenium WebDriver for browser automation, divides the application into pages for easier maintenance, and incorporates data-driven testing capabilities.

## Project Structure
The project is structured as follows:

```
project-root/
│
├── src/
│   ├── Generic/
│   │   └── [Common Selenium methods]
│   ├── PagePackage/
│   │   └── [Divided application into pages]
│   └── TestPackage/
│       └── [Test cases]
│
├── drivers/
│   └── [Driver-specific files for Chrome and Firefox]
│
└── data/
    └── [Data required for testing, e.g., login credentials]
```

## Installation
1. Clone the repository: `git clone https://github.com/Rahulraj7867/project-framework1.git`
2. Install Eclipse IDE.
3. Install Java JDK 1.8.
4. Download Selenium WebDriver.
5. Set up the project in Eclipse.
6. Ensure the required drivers for Chrome and Firefox are in the `drivers/` folder.

## Usage
1. Run the test cases located in the TestPackage directory.
2. Monitor test execution using TestNG annotations and reporting.
3. Access Actitime software via the provided URL: [Actitime](https://www.actitime.com/).

## Contributing
Contributions are welcome! Please fork the repository, make changes, and submit a pull request.


## Acknowledgments
- Thanks to gdpoul333@gmail.com for their contributions.
- Special thanks to (https://github.com/gdpoul) for their assistance.

## Support
For any inquiries or support, please contact rajputrahul12797@gmail.com.
