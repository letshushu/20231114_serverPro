package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
	public static void main(String[] args) {
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		String formatDate = dateFormat.format(currentDate);
		String myName = "배현서";
		
		System.out.println(formatDate + "_서버프로그램 구현: " + myName);
	}
}
