
/**
 * Write a description of test class BillfoldTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BillFoldTester
{

    /**
     * Default constructor for objects of class BillfoldTest
     */
    public BillFoldTester()
    {

    }

    public static void main(String[] args)
    {
        IDCard testCard1 = new IDCard("sam","9868");
        DriversLicense testCard2 = new DriversLicense("sam","69");
        Billfold testWallet = new Billfold(testCard1,testCard2);

        System.out.print(testWallet.formatCards());
         
    }
    
}