public class User {
    private String name;
    private String mobileNumber;
    public User(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobileNumber = mobilenumber;
    }

    public String getName() {
        return name;
    }

    public String getMobilenumber() {
        return mobileNumber;
    }

    public void inquireBalance(MobileWallet wallet){
        System.out.println("your balance is " + wallet.getBalance());
    }
    public void payBills(int amount , Bills type, MobileWallet wallet){
        type.setPrice(type.getPrice() - amount);
        wallet.setBalance(wallet.getBalance() - amount);
        System.out.println("the bill of " +type+" has been paid");
    }

}