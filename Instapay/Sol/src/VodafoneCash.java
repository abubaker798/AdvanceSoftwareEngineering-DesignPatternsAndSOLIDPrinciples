class VodafoneCash extends MobileWallet {
    VodafoneCash(String walletId) {
        super(walletId);
    }

    public void setWalletId(String walletId) {
    }

    public void setPalance(int palance) {
        setPalance(palance);
    }

    public int getPalance() {
        return super.getBalance();
    }

    public void inqurePalance() {

    }
}
