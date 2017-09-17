import java.util.Scanner;

public class TestEmiCal {

	public static void main(String[] args) {
		
		BrdModuleFunc brdModuleFunc = new BrdModuleFunc();

		Scanner sc = new Scanner(System.in);
		boolean status = true;
		int choice = 0;

		while (status) {

			try {
				System.out.println("<------------------------------ MENU ------------------------------>");
				System.out.println("<=============== Enter Information      Press 1 ===================>");
				System.out.println("<=============== EMI Calculate          Press 2 ===================>");
				System.out.println("<=============== List of Installment    Press 3 ===================>");
				System.out.println("<=============== Perticular Installment Press 4 ===================>");
				System.out.println("<=============== Exit                   Press 5 ===================>");

				choice = sc.nextInt();
				switch (choice) {
				
				case 1:
					brdModuleFunc.get_Information();
					System.out.println("");
					break;

				case 2:
					System.out.println("The installment amount will be of : " +brdModuleFunc.emiCal());
					System.out.println("");
					break;

				case 3:
					brdModuleFunc.list_instalment();
					break;
					
				case 4:
					brdModuleFunc.perticularEmi();
					break;

				case 5:
					System.out.println("Program exist Successfully");
					status = false;
				}
			} catch (Exception e) {
				System.out.println("Kindly chose from the given Input");
				System.out.println("");
				main(args);
			}
		}

		System.exit(1);
	}

}
