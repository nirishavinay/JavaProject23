package src;

public class EncapsulationTest3
{
    private double Account_Balance;

    public EncapsulationTest3(){
        System.out.println("DC");
    }

    public EncapsulationTest3(double xyz)
    {
      double temp = xyz;
        System.out.println("PC");
    }
    public double getAccount_Balance()
    {
        return Account_Balance;
    }

    public void setAccount_Balance(double account_Balance)
    {
        Account_Balance = account_Balance;
    }
public void deposit(double amount)
{
Account_Balance += amount;
}
    public void withdraw(double amount)
    {
        Account_Balance -= amount;
    }

    public static void main(String[] args)
    {

        EncapsulationTest3 encapsulationTest3 = new EncapsulationTest3();
        encapsulationTest3.deposit(2000);
        encapsulationTest3.withdraw(100);
        System.out.println("Current Balance: $" +encapsulationTest3.getAccount_Balance());
    }
}
