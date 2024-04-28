public class BankAcountSignUp extends SignUp{

    public void register(String mobileNumber, Account account) {
        verify(mobileNumber);
    }
}
