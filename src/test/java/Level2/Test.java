package Level2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	static Integer number = 20;

	public static void main(String[] args) {
		System.out.println("Hello, Lets test out chrome web driver!");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:3000/");
		driver.manage().window().maximize();
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("a@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("aq");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div/form/button")).click();
		for(int i = 0; i <= number; i++) {
			System.out.println(i);
			if(i == number) {
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[2]/div/form/button")).click();

			}
		}
	}

}
