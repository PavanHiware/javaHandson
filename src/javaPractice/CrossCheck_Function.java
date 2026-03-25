package javaPractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CrossCheck_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date currentDate=new Date();
		
		
		String currentDate= new SimpleDateFormat("dd.MM.yyyy HH.mm.ss").format(new Date());
		System.out.println(currentDate);
		System.out.println(currentDate.replace(" ", "_").replace(".", "_")+".png");
	}

}
