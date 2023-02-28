package adapter;

import adapter.thirdParty.banks.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPIAdapter {

    private ICICIBankAPI iciciBankAPI;

    public ICICIBankAPIAdapter(){
        this.iciciBankAPI = new ICICIBankAPI();
    }

    @Override
    public float checkBalance(String accountNo, String pin) {
        //write logic using ICICIAPI
        return 0;
    }

    @Override
    public boolean authenticate(String accountNo, String pin) {
        //write logic using ICICIAPI
        return false;
    }

    @Override
    public boolean transaction(String fromAccountNo, String toAccountNo) {
        //write logic using ICICIAPI
        return false;
    }
}
