public class CarLoan {
  //This project calculate the monthly car payment a user should expect to make after taking out a car loan.
	public static void main(String[] args) {
    int carLoan = 10000;
    int loanLenght = 3;
    int interestRate = 5;
    int downPayment = 2000;
    if(loanLenght <= 0 || interestRate <= 0){
      System.out.println("Error! You must take out a valid car loan.");
    }else if(downPayment >= carLoan){
      System.out.println("The car can be paid in full.");
    }else{
      int remainingBalance = carLoan - downPayment;
      int months = loanLenght * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (monthlyBalance * interestRate) / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println("The monthly payment is $" + monthlyPayment);
    }
	}
}
