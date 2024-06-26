## Running Tests in Spring Boot for Android and iOS
This guide provides instructions for running tests in a Spring Boot application targeted at Android and iOS platforms.

## Prerequisites
Before running tests, ensure you have the following installed:

Java Development Kit (JDK) 8 or higher
Gradle
Android SDK (for Android testing)
Xcode (for iOS testing)

## Setup
1. Clone the Repository
git clone <repository_url>
   cd <project_directory>

2. Build the Project
gradle clean build

## Running Tests
- Android Platform
To run tests for the Android platform, follow these steps:

1. Set Up Android Environment: Ensure your Android SDK is properly configured.

2. Run Tests

Use Gradle with the appropriate profile (android).

``` gradle test -Dspring.profiles.active=android```
or directly change profile in Parent test @ActiveProfile annotation

- iOS Platform
To run tests for the iOS platform, follow these steps:

1. Set Up iOS Environment: Ensure Xcode is installed and configured properly.

2. Run Tests
Gradle with the appropriate profile (ios).
``` gradle test -Dspring.profiles.active=ios```
or directly change profile in Parent test @ActiveProfile annotation
