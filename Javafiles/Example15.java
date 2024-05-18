
class InsufficientFundException extends Exception
{
    InsufficientFundException(String message)
    {
        super(message);
    }
}

class Transaction{
    static int minimumBalance=5000;
    static int currentAmount=5000;

    static void deposit(int depAmount)
    {
        if(depAmount<0)
        {
            throw new IllegalArgumentException("Amount cannot be below 0");
        }
        currentAmount+=depAmount;
    }

    static void withdraw( int withdrawAmount) throws InsufficientFundException
    {
        if(withdrawAmount<0)
        {
            throw new IllegalArgumentException("Amount cannot be below 0");
        }
        if(currentAmount<minimumBalance)
        {
            throw new InsufficientFundException("Insuffcient fund");
        }
        else
        {
            currentAmount-=withdrawAmount;
        }
    }

    int showBalance()
    {
        return currentAmount;
    }
}

public class Example15 {
    public static void main(String args[])
    {
        Transaction t= new Transaction();
        Transaction.deposit(0);
        try{
            Transaction.withdraw(200);
            Transaction.withdraw(100);
            System.out.println(t.showBalance());
        }
        catch(InsufficientFundException | IllegalArgumentException ex)
        {
            System.out.println("Error "+ex.getMessage());
            System.out.println(t.showBalance());
        }
    }
}
