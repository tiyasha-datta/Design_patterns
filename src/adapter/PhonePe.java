package adapter;

public class PhonePe {

    private BankAPIAdapter bankAPIAdapter;
    public PhonePe(BankAPIAdapter bankAPIAdapter) {
        this.bankAPIAdapter = bankAPIAdapter;
    }

    public boolean doTransaction(String fromAccountNo, String toAccountNo, int amount, String pin){
        if(bankAPIAdapter.authenticate(fromAccountNo, pin)){
            float balance = bankAPIAdapter.checkBalance(fromAccountNo,pin);
            if(balance >= amount){
                if(bankAPIAdapter.transaction(fromAccountNo, toAccountNo)){
                    return true;
                }
            }
        }
        return false;
    }
}
