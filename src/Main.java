public class Main {
  public static void main(String[] args) {
    int initCreditCardBalance = 5000;
    double intRate = 0.17;

    /* Month 1 */
    double monthOneBalance = initCreditCardBalance + initCreditCardBalance * intRate;
    System.out.println("The credit card balance after one month is: " + monthOneBalance);

    /* Month 2 */
    double monthTwoBalance = monthOneBalance + monthOneBalance * intRate;
    System.out.println("The credit card balance after two months is: " + monthTwoBalance);

  }
}