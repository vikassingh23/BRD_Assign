import java.util.Scanner;

public class BrdModuleFunc {
	static BrdEmiCalculator brdEmiCalculator;
	double interest=0;
	double principal_Comp=0;
	double principalNext=0;

	public void get_Information() {
		Scanner sc = new Scanner(System.in);

		// Accepting the principal amount
		double principal;
		do {
			System.out.println("Enter the principal amount");
			while (!sc.hasNextDouble()) {
				System.out.println("That's not a valid amount");
				sc.next();
			}
			principal = sc.nextDouble();
		} while (principal <= 0);

		// accepting the interest rate
		double interest_Rate;
		do {
			System.out.println("Enter the Interest Rate");
			while (!sc.hasNextDouble()) {
				System.out.println("That's not a valid rate of interest");
				sc.next();
			}
			interest_Rate = sc.nextDouble();
		} while (interest_Rate <= 0);

		// Accepting the number pay
		int number_pay_in_year;
		do {
			System.out.println("Enter the number pay in year");
			while (!sc.hasNextInt()) {
				System.out.println("That's not a valid rate of number pay in year");
				sc.next();
			}
			number_pay_in_year = sc.nextInt();
		} while (number_pay_in_year <= 0);

		// Accepting the tenure in terms of number of months
		int tenure_in_months;
		do {
			System.out.println("Enter the tenur in months");
			while (!sc.hasNextInt()) {
				System.out.println("That's not a valid rate of tenure in months");
				sc.next();
			}
			tenure_in_months = sc.nextInt();
		} while (tenure_in_months <= 0);

		brdEmiCalculator = new BrdEmiCalculator(principal, interest_Rate, number_pay_in_year, tenure_in_months);
	}

	public static double emiCal() {
		System.out.println("");
		return brdEmiCalculator.getInstallment_Amount();
	}

	public void list_instalment() {
		double interest_Rate = brdEmiCalculator.getInterest_Rate();
		double principal = brdEmiCalculator.getPrincipal_Amount();
		int tenure = brdEmiCalculator.getTenure_in_months();
		double emiCalc = BrdModuleFunc.emiCal();
		int count=0;
		
		System.out.println("Tenure       O/S Principal        Interest Component           Principal                      EMI");
		for(int i=0; count<tenure; i++){
			interest = principal*interest_Rate/12;
			principal_Comp=emiCalc-interest;
			count++;
			System.out.println(count+"       "+principal+"        "+interest+"            "+principal_Comp+"             "+emiCalc);
			principal=principal-principal_Comp;
		}
		System.out.println("");
	}
	
	public void perticularEmi(){
		Scanner sc = new Scanner(System.in);
		int tenure_of_month;
		do {
			System.out.println("Enter the tenure of month to view EMI");
			while (!sc.hasNextInt()) {
				System.out.println("That's not a valid rate of tenure in months");
				sc.next();
			}
			tenure_of_month = sc.nextInt();
		} while (tenure_of_month <= 0);
		System.out.println(tenure_of_month);
		
		double interest_Rate = brdEmiCalculator.getInterest_Rate();
		double principal = brdEmiCalculator.getPrincipal_Amount();
		double emiCalc = BrdModuleFunc.emiCal();
		
		int count=0;
		
		System.out.println("Tenure       O/S Principal          Interest Component              Principal                       EMI");
		for(int i=0; count<tenure_of_month; i++){
			interest = principal*interest_Rate/12;
			principal_Comp=emiCalc-interest;
			count++;
			if(count==tenure_of_month){
			System.out.println(count+"          "+principal+"        "+interest+"            "+principal_Comp+"             "+emiCalc);}
			principal=principal-principal_Comp;
		}
		System.out.println("");
		
	}
	

}
