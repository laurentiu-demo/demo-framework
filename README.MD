## How To Run Tests

### Cucumber Plugin
Via terminal use the following:

For default browser driver `./gradlew cucumber` and for specific driver for example FireFox: `./gradlew cucumber -Dbrowser=FireFoxDriver`

### Junit

There is a TestRunner to be able to run cucumber tests as junit tests using the following command in terminal:`./gradlew test --tests *TestRunner`
or all tests with `./gradlew test` and if you want a specific browser add it as above

## From GitHub Actions
By triggering manually the CI workflow, though Firefox Driver needs more setup for tests
![img.png](img.png)