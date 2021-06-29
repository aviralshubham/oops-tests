// contradiction usually happens when a programmer uses inheritance and simply inheriting just evrything of parent class.

// class payClassification{

// 	public float calculateSalary(){
// 		System.out.println("Salary for monthly and hourly");
// 		return 0;
// 	}
// 	public void timecard(){
// 		System.out.println("timecard for monthly and hourly");
// 	}
// }
// class monthlySalary extends payClassification{

// }

// class hourlySalary extends payClassification{
//     public static void main(String[] args) {
// 	   payClassification p = new payClassification();
// 	   p.calculateSalary();
// 	   payClassification pt = new monthlySalary();
// 	   pt.calculateSalary();	

// 	   // now this next one will contradict liskov principle
// 	   payClassification pte = new commisionSalary();
// 	   pte.timecard();
// 	}
// }
//  class commisionSalary extends payClassification{
// 	public float calculateSalary(){
// 		System.out.println("Salary for Commision");
// 		return 0;
// 	}
// 	public void timecard(){
// 		throw new RuntimeException("Not Available");
// 	}
// }

// to avoid having it we can use interfaces .

interface payClassification{
	public float calculateSalary();
}
interface timecard extends payClassification{
	public void timedetails();
} 


class monthlySalary implements timecard{
	public float calculateSalary(){
		System.out.println("Monthly salary is calculated");
		return 0;
	}
    
	public void timedetails(){
        System.out.println("timedetails is calculated");
	}

	public void monthlySalaryLogic(){
		System.out.println("Monthly salary Logic");
	}
}

class hourlySalary implements timecard{
	public float calculateSalary(){
		System.out.println("hourly salary is calculated");
		return 0;
	}
    
	public void timedetails(){
        System.out.println("timedetails is calculated");
	}

	public void hourlySalaryLogic(){
		System.out.println("hourly salary Logic");
	}
}


class commisionSalary implements payClassification{
	public float calculateSalary(){
		System.out.println("Monthly salary is calculated");
		return 0;
	}

	public void commisionSalaryLogic(){
		System.out.println("Commision salary Logic");
	}

	public static void main(String[] args) {
		payClassification p = new monthlySalary();
		p.calculateSalary();

		// monthlySalary m = new payClassification(); // not posssible as a child wiil always have more speciality than parent, so a parent can never outdo child , hence some reference of child will remain empty giving error 

		payClassification pte = new commisionSalary();
         pte.calculateSalary();
         //pte.commisionSalaryLogic();
	}
}