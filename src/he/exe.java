
package he;

public class exe extends base {

		public static void main(String[] args) throws InterruptedException {
				
			launchBrowser("http://demo.automationtesting.in/Register.html");
			poj p=new poj();
			max();
			filltxt(p.getFirstn(), "Rohit");
			filltxt(p.getLast(),"Ronny");
			filltxt(p.getAddress(), "No.5,S.S Devar Street,"
					+ "\nNavalur,Chennai - 98");
			filltxt(p.getPhone(),"+91-81246 65897");
			filltxt(p.getPword(), "123456789");
			filltxt(p.getCpword(), "123456789");
			filltxt(p.getEmail(),"rohit87569@gmail.com" );
			opt(p.getSkill(),3 );
			opt(p.getCountry(),15);
			opt(p.getDay(),4);
			opt(p.getYear(), 80);
			opt(p.getMonth(), 8);
			clk(p.getGender());
			clk(p.getHobi());
			clk(p.getLang());
			mulOpt(p.getLang(),p.getLang1(),p.getLang2());
			
		
		}
		
		
	}

