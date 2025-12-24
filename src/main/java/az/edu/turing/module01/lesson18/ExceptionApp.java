package az.edu.turing.module01.lesson18;

public class ExceptionApp {
    public static void main(String[] args) {
        Account[] accounts = new Account[5];
        accounts[0] = new Account(100, "Ali");
        accounts[1] = new Account(100, "Bayram");
        accounts[2] = new Account(100, "Ceyhun");
        accounts[3] = new Account(100, "Davud");
        accounts[4] = new Account(100, "Elen");
        try {

            System.out.println(findAccount(accounts, "Elen"));
        }catch (AccountNotFoundException | NullPointerException e){
            System.out.println(e.getMessage());
        } catch ( ArithmeticException e){
            System.out.println("Arithmetic exception");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static Account findAccount(Account[]accounts,String owner) throws Exception{
        try {
            System.out.println("Try block");
            boolean found = false;
            for (int i = 0; i < accounts.length; i++) {
                if (accounts[i].getOwner().equals(owner)) {
                    found = true;
                    return accounts[i];
                }
            }
            if (!found) {
                throw new AccountNotFoundException("Account not found");
            }
        } catch (AccountNotFoundException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Finally block");
            throw new NullPointerException("Runtime exception in finally block");
        }
    }
}
