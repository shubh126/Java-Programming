import java.util.*;

interface ComputeEmpWagee{
	public void addCompany(String company,int empRatePerHr,int numOfWorkingDays,int maxHrsPerMonth);
	public void computeEmpWage();
	public int getTotalWage(String company);
}

public class EmpWageUC13 implements ComputeEmpWagee {
	//ArrayList Creation
	private List<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> empDailyWageMap;
	
	//Constructor
	public EmpWageUC13(){
		companyEmpWageList =new ArrayList<>();
		empDailyWageMap = new HashMap<>();
		
	}
	
	//method for adding companies in ArrayList
	public void addCompany(String company,int empRatePerHr,int numOfWorkingDays,int maxHrsPerMonth) {
		CompanyEmpWage companyEmpWage=new CompanyEmpWage(company,empRatePerHr,numOfWorkingDays,maxHrsPerMonth);
		companyEmpWageList.add(companyEmpWage);
		empDailyWageMap.put(company,companyEmpWage);
		
		/*CompanyEmpWage companyDailyEmpWage=new CompanyEmpWage(company,empRatePerHr,numOfWorkingDays,maxHrsPerMonth);
		empDailyWageMap.put(company,companyDailyEmpWage);*/
		
	}
	
	//printing ArrayList
	public void printList() {
		for (CompanyEmpWage j:companyEmpWageList) {
			//System.out.println(j);
			System.out.println(companyEmpWageList);
		}

			System.out.println(empDailyWageMap);
	}
	
	//calculation in arrayList
	public void computeEmpWage() {
		for (int i=0;i<companyEmpWageList.size();i++)
		{
			CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
		
		/*for (int i=0;i<empDailyWageMap.size();i++)
		{
			CompanyEmpWage companyDailyEmpWage=empDailyWageMap.get(i);
			companyDailyEmpWage.setTotalEmpWage(this.computeEmpWage(companyDailyEmpWage));
			System.out.println(companyDailyEmpWage);
		}*/
		
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
		}
		return totalEmpHrs*companyEmpWage.empRatePerHr;
	}

	public static void main(String[] args) {
		//creating object
		EmpWageUC13 empWageBuilder =new EmpWageUC13();
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



	@Override
	public int getTotalWage(String company) {
		return empDailyWageMap.get(company).totalEmpWage;
	}

}
