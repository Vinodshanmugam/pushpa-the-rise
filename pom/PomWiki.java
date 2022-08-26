package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.baseClass.BaseClass;

public class PomWiki extends BaseClass{
	public PomWiki(WebDriver dr) {
		PomWiki.dr=dr;
		PageFactory.initElements(dr,this);	
	}
	@FindBy(id="searchInput")
	private WebElement searchBox;
	public WebElement getSearchBox() {
		return searchBox;
	}
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchBtn;
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	@FindBy(xpath="//a[@title='Pushpa: The Rise']")
	private WebElement title;
	public WebElement getTitle() {
		return title;
	}
	@FindBy(xpath="(//table[@class='infobox vevent']//descendant::div[@class='plainlist'])[4]")
	private WebElement releaseDate;
	public WebElement getReleaseDate() {
		return releaseDate;
	}
	@FindBy(xpath="//td[text()='India']")
	private WebElement country;
	public WebElement getCountry() {
		return country;
	}
	@FindBy(xpath="//div[text()='Theatrical release poster']")
	private WebElement screen;
	public WebElement getScreenShot() {
		return screen;
	}
}


