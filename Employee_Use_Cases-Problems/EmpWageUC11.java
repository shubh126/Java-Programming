import java.util.Random;

public class EmpWageUC11 {
	//array Creation
	private int numOfCompanies;
	private CompanyEmpWage[] companyEmpWageArray;
	
	//Constructor
	public EmpWageUC11(){
		companyEmpWageArray =new CompanyEmpWage[5];
	}
	
	//method for adding company in array & abstract method
	public void addCompany(String company,int empRatePerHr,int numOfWorkingDays,int maxHrsPerMonth) {
		companyEmpWageArray [numOfCompanies]=new CompanyEmpWage(company,empRatePerHr,numOfWorkingDays,maxHrsPerMonth);
			numOfCompanies++;	
	}
	
	//calculation in array & abstract method
	public void computeEmpWage() {
		for (int i=0;i<numOfCompanies;i++)
		{
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	
	//calculation of wage
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		//local Variables
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int totalSalary=0;
		int empHrs=0;
		
		while (totalEmpHrs < companyEmpWage.maxHrsPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays)
		{
			totalWorkingDays++;
			Random rand=new Random();
			int empCheck=rand.nextInt(3);
			//System.out.println("Random: no is "+empCheck);
			switch (empCheck) {
			case 1:
				empHrs=8;
				break;
			case 2:
				empHrs=4;
				break;
			default:
				empHrs=0;
			}
			totalEmpHrs+=empHrs;
			//System.out.println("Day: "+totalWorkingDays+" Total Working Hours: "+totalEmpHrs);
			
		}
		return totalEmpHrs*companyEmpWage.empRatePerHr;		
	}

	public static void main(String[] args) {
		//creating object
		EmpWageUC11 empWageBuilder =new EmpWageUC11();
		empWageBuilder.addCompany("Euronet", 20, 20, 100);
		empWageBuilder.addCompany("TCS", 30, 27, 100);
		empWageBuilder.computeEmpWage();

	}
	//interface
	public interface ComputeEmpWagee{
		public void addCompany(String company,int empRatePerHr,int numOfWorkingDays,int maxHrsPerMonth);
		public void computeEmpWage();
	}
	
	public class CompanyEmpWage{
		public final String company;
		public final int empRatePerHr;
		public final int numOfWorkingDays;
		public final int maxHrsPerMonth;
		public int totalEmpWage;
		
		public CompanyEmpWage(String company,int empRatePerHr,int numOfWorkingDays,int maxHrsPerMonth) {
			this.company=company;
			this.empRatePerHr=empRatePerHr;
			this.numOfWorkingDays=numOfWorkingDays;
			this.maxHrsPerMonth=maxHrsPerMonth;
		}
		
		public void setTotalEmpWage(int totalEmpWage) {
			this.totalEmpWage=totalEmpWage;
		}
		
		@Override
		public String toString() {
			return "Total Employee wage for Company: "+company+" is: "+totalEmpWage;
		}
	
	}

}
