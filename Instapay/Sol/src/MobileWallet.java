abstract class MobileWallet {

     private int balance = 0;
    private String walletId;
    MobileWallet(String walletId){
        this.walletId = walletId;
    }

    public void setWalletId(String walletId){
        this.walletId = walletId;
    }
    public void setBalance(int palance){
        this.balance = palance;
    }

    public int getBalance(){
        return this.balance;
    }

}
