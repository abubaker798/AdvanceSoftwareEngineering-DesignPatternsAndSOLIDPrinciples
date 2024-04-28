// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
//        Connection connection = DriverManager.getConnection(
//           "jdbc:mysql://127.0.0.1:3306/login_schema",
//                "root",
//                "pass20200798"
//        );
//
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");
//
//        while (resultSet.next()){
//
//            //statement.executeUpdate("abubaker, oscarab7@&");
//            System.out.println(resultSet.getString("userName"));
//            System.out.println(resultSet.getString("password"));
//
//        }

        Scanner input = new Scanner(System.in);
        //Customer customer;
        SignUp signUp = null;
        MobileWallet  mobileWallet = null;
        String mobileNumber = null;
        int select = 1;
        Account account = null;

        System.out.println("Please enter number of following");
        System.out.println("1- sign-up");
        System.out.println("2- login");select = input.nextInt();

        if(select == 1){
            System.out.println("Please enter number of sign-up Methode");
            System.out.println("1-for sign-up by bank account");
            System.out.println("2-for sign-up by Mobile Wallet");select = input.nextInt();

            if(select == 1){
                signUp = new BankAcountSignUp();

                System.out.print("enter mobile number : ");  mobileNumber = input.next();
                System.out.print("enter wallet Id"); String walletId = input.next();
                System.out.print("enter type of bank wallet\n1-CIB: ");select = input.nextInt();

                if(select == 1)
                    mobileWallet = new CIB(walletId);
            }

            if(select == 2){
              signUp = new MobileWalletSignUp();

              System.out.print("enter mobile number : ");  mobileNumber = input.next();
              System.out.print("enter wallet Id"); String walletId = input.next();
              System.out.println("enter type of mobile wallet\n1-Vodafone Cash\n2-Fawry");

              select = input.nextInt();
              if(select == 1)
                  mobileWallet = new VodafoneCash(walletId);

              if(select == 2)
                  mobileWallet = new Fawry(walletId);

              signUp.register(mobileNumber,mobileWallet);
            }
            System.out.print("enter a username (unique through the system): "); String userName = input.next();
            System.out.print("enter complex password: "); String password = input.next();
            account.setUserName(userName);
            account.setPassword(password);
            // save userName and password in database
        }
        else if(select == 2){
            System.out.print("enter user name: "); String userName = input.next();
            System.out.print("enter password: "); String password = input.next();
            account = new InstapayAccount(userName, password);
            //account.loadProfile();

            System.out.println("1- Transfer to Wallet");
            System.out.println("2- Transfer to Another instapay");
            System.out.println("3- Inquire about balance");
            System.out.println("4- Pay bills");
            System.out.print("select number : "); select = input.nextInt();

            if(select == 1){
                System.out.print("enter the amount "); int amount = input.nextInt();

                TransferMethod mobileTransfer = new TransferToMobileWallet();
                System.out.println("enter type of mobile wallet\n1-Vodafone Cash\n2-Fawry");select = input.nextInt();
                System.out.print("enter mobile number : ");  mobileNumber = input.next();
                System.out.print("enter wallet Id"); String walletId = input.next();
              if (select == 1){
                  mobileWallet = new VodafoneCash(walletId);
              }
              if (select == 2){
                  mobileWallet = new Fawry(walletId);
              }
              mobileTransfer.transfer(amount);
            }
        }
    }
}
