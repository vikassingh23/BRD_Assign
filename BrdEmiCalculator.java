
public class BrdEmiCalculator {

	private double installment_Amount;
	private double principal_Amount;
	private double interest_Rate;
	private int number_pay_in_year;
	private int tenure_in_months;
	private double residual_Value = 0;

	public BrdEmiCalculator(double principal_Amount, double interest_Rate, int number_pay_in_year,
			int tenure_in_months) {
		this.principal_Amount = principal_Amount;
		this.interest_Rate = interest_Rate / 100;
		this.number_pay_in_year = number_pay_in_year;
		this.tenure_in_months = tenure_in_months;
	}

	public void setPrincipal_Amount(double principal_Amount) {
		this.principal_Amount = principal_Amount;
	}

	public void setInterest_Rate(double interest_Rate) {
		this.interest_Rate = interest_Rate;
	}

	public void setNumber_pay_in_year(int number_pay_in_year) {
		this.number_pay_in_year = number_pay_in_year;
	}

	public void setTenure_in_months(int tenure_in_months) {
		this.tenure_in_months = tenure_in_months;
	}

	public void setResidual_Value(double residual_Value) {
		this.residual_Value = residual_Value;
	}

	public double getInstallment_Amount() {
		double x = principal_Amount * (interest_Rate / number_pay_in_year);
		double y = residual_Value * (interest_Rate / number_pay_in_year);
		double w = (1 + (interest_Rate / number_pay_in_year));
		double z = Math.pow(w, tenure_in_months);
		installment_Amount = (x - (y / z)) / (1 - (1 / z));
		return installment_Amount;
	}

	public double getPrincipal_Amount() {
		return principal_Amount;
	}

	public double getInterest_Rate() {
		return interest_Rate;
	}

	public int getNumber_pay_in_year() {
		return number_pay_in_year;
	}

	public int getTenure_in_months() {
		return tenure_in_months;
	}

	public double getResidual_Value() {
		return residual_Value;
	}

}
