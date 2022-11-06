public class Account {

    private String name;
    private int password;
    private double balance;
    private double income;
    private int socialSecurityNumber;
    private int workingHours;




    public Account(String name,int password , double balance, double income, int socialSecurityNumber, int workingHours) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.income = income;
        this.socialSecurityNumber = socialSecurityNumber;
        this.workingHours = workingHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
