abstract class SignUp {
    public void register(String mobileNumber, MobileWallet mobileWallet){
        verify(mobileNumber);
    }
    public void verify(String mobileNumber){
        System.out.println("Send code a verification code  ...");
    }
}