package application;

import java.util.Locale;
import java.util.Scanner;

import services.OnlinePaymentService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		OnlinePaymentService ps = new PaypalService();
		
		System.out.println(ps.paymentFee(200.00));
		System.out.println(ps.interest(200.00, 3));

	}

}
