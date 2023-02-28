package adapter;

import adapter.thirdParty.banks.YESBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter{

    private YESBankAPI yesBankAPI;

    public YesBankAPIAdapter(){
        this.yesBankAPI = new YESBankAPI();
    }
    @Override
    public float checkBalance(String accountNo, String pin) {
        //write logic using YESAPI
        return 0;
    }

    @Override
    public boolean authenticate(String accountNo, String pin) {
        //write logic using YESAPI
        return false;
    }

    @Override
    public boolean transaction(String fromAccountNo, String toAccountNo) {
        //write logic using YESAPI
        return false;
    }
}
