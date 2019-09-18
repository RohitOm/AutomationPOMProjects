
package he;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

	public class poj extends base{

		public poj() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//input[@placeholder='First Name']")
		private WebElement firstn;
		
		@FindBy (id = "firstpassword")
		private WebElement pword;
		
		@FindBy(xpath = "//input[@placeholder='Last Name']")
		private WebElement last;
		
		@FindBy(xpath = "//textarea[@rows='3']")
		private WebElement address;

		@FindBy(xpath= "//input[@type='email']")
		private WebElement email;
		
	
		@FindBy(xpath= "//input[@type='tel']")
		private WebElement phone;
		
		@FindBy (id = "checkbox2")
		private WebElement hobi;
	
		
		
		public WebElement getHobi() {
			return hobi;
		}

		//select
		@FindBy ( id="Skills" )
		private WebElement skill;
		
		@FindBy (xpath = "//select[@id='countries']" )
		private WebElement country;
		
		@FindBy (xpath = "//select[@id='yearbox']")
		private WebElement year;
		
		@FindBy (xpath = "//select[@placeholder='Month']")
		private WebElement month;
		
		@FindBy (xpath = "//select[@id='daybox']")
		private WebElement day;
		
		@FindBy (id = "secondpassword")
		private WebElement cpword;
		
		@FindBy (xpath = "//label[1]//input[1]")
		private WebElement gender;
		
		@FindBy (xpath ="//div[@class='col-md-4 col-xs-4 col-sm-4']//multi-select")
		private WebElement lang;
		
		
		@FindBy (xpath ="//a[contains(text(),'English')]")
		private WebElement lang1;
		
		@FindBy (xpath ="//li[29]")
		private WebElement lang2;
		
		public WebElement getEmail() {
		return email;
		}
		
		public WebElement getLang1() {
			return lang1;
		}

		public WebElement getLang2() {
			return lang2;
		}

		public WebElement getYear() {
			return year;
		}

		public WebElement getMonth() {
			return month;
		}

	
	
		public WebElement getDay() {
			return day;
		}
		
		
		public WebElement getPhone() {
			return phone;
		}

		public WebElement getGender() {
			return gender;
		}

	

		public WebElement getLang() {
			return lang;
		}

		public WebElement getSkill() {
			return skill;
		}

		public WebElement getCountry() {
			return country;
		}

		public WebElement getPword() {
			return pword;
		}

		public WebElement getCpword() {
			return cpword;
		}

		
		
		public WebElement getFirstn() {
			return firstn;
		}

		public WebElement getLast() {
			return last;
		}

		public WebElement getAddress() {
			return address;
		}
		
		
	}


