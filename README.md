# pushpa-the-rise
Pushpa:The Rise Movie Project in IMDb and Wikipedia
create seperate POM class for Imdb and Wikipedia webpages
Extend the the Baseclass with PomImdb and PomWiki classes
Create constructor and pass the parameter WebDriver dr 
Create PageFactory class for capture bulk of webelements anf initelements for reinitialize the webelements to avoid the staleelement exceptions.
Find the webelement by using @FindBy annotation
Create private webelement and using getters to return the element.
In Baseclass write the reusable codes for sendkeys,click,launch browser,launch the url,scrolldown and take screenshot.
In TestExecution class create @Test annotation and use the reusable codes inside the method 
Select the project and convert the project TestNG and run the testng.xml file.
