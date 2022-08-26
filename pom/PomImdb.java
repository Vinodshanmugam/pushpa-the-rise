package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class PomImdb extends BaseClass {
	public PomImdb(WebDriver dr) {
		PomImdb.dr=dr;
			PageFactory.initElements(dr, this);
			}
		@FindBy(xpath="//input[@type='text']")
		private   WebElement search;
		public  WebElement getSearch() {
			return search;
		}
		@FindBy(id="suggestion-search-button")
		private  WebElement searchBtn;
		public   WebElement getSearchBtn() {
			return searchBtn;
		}
		@FindBy(xpath = "//a[contains(text(),'Part 1')]")
		private  WebElement part1;
		public   WebElement getPart1() {
			return part1;
		}
		@FindBy(xpath = "//span[text()='Details']")
		private  WebElement details;
		public  WebElement getDetails() {
			return details;
		}
		@FindBy(xpath="//a[text()='Release date']//following-sibling::div")
		private WebElement releaseDate;
		public WebElement getReleaseDate() {
			return releaseDate;
		}
		@FindBy(xpath="//span[text()='Country of origin']//following-sibling::div")
		private WebElement country;
		public WebElement getCountry() {
			return country;
		}
	}


