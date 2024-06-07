package Utilities2;

import Page2.AdminPage2;
import Page2.HomePage2;
import Page2.LoginPage2;

public class PageInitializer2 extends Driver2{
	
	//it contains object of page classes
		public static HomePage2 hp;
		public static AdminPage2 amp;
		public static LoginPage2 lp;
		
		
		public static void initializer() {
			
			hp = new HomePage2();
			amp = new AdminPage2();
			lp = new LoginPage2();
		}
			

}
