package nsv.custom.utilities;

public class Print {
	
	public Print() {}
	
	public static void println(Object message) {
		System.out.println(""+message);
	}
	
	/*this method accepts 2 parameters - 
	 *1- Title: meaningful you would like to provide to differentiate the results in console
	 *2- Message: the actual result/message you would like to print
	 */
	public static void prettyPrint(String title, Object message) {
		System.out.println("------------ "+title+" ------------");
		System.out.println(""+message);
		System.out.println("------------ ------------ ------------");
	}
}
