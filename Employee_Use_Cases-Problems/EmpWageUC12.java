import java.util.*;

interface ComputeEmpWage1 {
	public void addCompany(String company,int empRatePerHr,int numOfWorkingDays,int maxHrsPerMonth);
	public void computeEmpWage();
}

public class EmpWageUC12 implements ComputeEmpWage1 {
	//arrayList Creation
	private List<CompanyEmpWage> companyEmpWageList;
	
	//Constructor
	public EmpWageUC12(){
		companyEmpWageList =new ArrayList<>();
	}
	
	//method for adding company in arrayList
	public void addCompany(String company,int empRatePerHr,int numOfWorkingDays,int maxHrsPerMonth) {
		CompanyEmpWage companyEmpWage=new CompanyEmpWage(company,empRatePerHr,numOfWorkingDays,maxHrsPerMonth);
		
		companyEmpWageList.add(companyEmpWage);
	}
	
	//printing ArrayList
	public void printList() {
		for (CompanyEmpWage j:companyEmpWageList) {
			//System.out.println(j);
			System.out.println(companyEmpWageList);
		}
	}
	
	//calculation in arrayList
	public void computeEmpWage() {
		for (int i=0;i<companyEmpWageList.size();i++)
		{
			CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}
	
	
	//calculation of wage
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		//local Variables
		int totalEmpHrs=0;
		int totalWorkingDays=0;
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
		EmpWageUC12 empWageBuilder =new EmpWageUC12();
		empWageBuilder.addCompany("Euronet", 20, 20, 100);
		empWageBuilder.addCompany("TCS", 30, 27, 100);
		empWageBuilder.computeEmpWage();
		empWageBuilder.printList();

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
