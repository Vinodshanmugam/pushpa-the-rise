package com.testExecution;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.baseClass.BaseClass;
import com.pom.PomImdb;
import com.pom.PomWiki;

public class TestExecution extends BaseClass {
	@Test
	public static void pushpa() throws IOException {
		//IMDB
		launchBrowser();
		launchUrl("https://www.imdb.com/");
		PomImdb p=new PomImdb(dr);
		type(p.getSearch(),"Pushpa:The Rise");
		click(p.getSearchBtn());
		click(p.getPart1());
		scrollDown(p.getDetails());
		takeScreenShot(p.getDetails(), "C:\\Users\\LENOVO\\Desktop\\New folder (3)\\IMDB2.png");
		WebElement releaseDate = p.getReleaseDate();
		String releaseDateImdb = releaseDate.getText();
		System.out.println(releaseDateImdb);
		WebElement country = p.getCountry();
		String countryImdb = country.getText();
		System.out.println(countryImdb);
		dr.close();
	//Wikipedia
		launchBrowser();
		launchUrl("https://www.wikipedia.org/");
		PomWiki p2=new PomWiki(dr);
		type(p2.getSearchBox(), "Pushpa:The Rise");
		click(p2.getSearchBtn());
		click(p2.getTitle());
		scrollDown(p2.getScreenShot());
		takeScreenShot(p2.getScreenShot(),"C:\\Users\\LENOVO\\Desktop\\New folder (3)\\Wikipedia.png"); 
		WebElement releaseDate1 = p2.getReleaseDate();
		String releaseDateWiki = releaseDate1.getText();
		System.out.println(releaseDateWiki);
		WebElement countryOfRegion = p2.getCountry();
		String countryWiki = countryOfRegion.getText();
		System.out.println(countryWiki);
		dr.close();
		//comparison
		try {
			Assert.assertEquals(countryImdb, countryWiki);
			System.out.println("Country Name same in IMDB and Wikipedia");

		} catch (Exception e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		try {
			Assert.assertEquals(releaseDateWiki, releaseDateImdb);
		} catch (Exception e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		
	}
}

	

	
	



