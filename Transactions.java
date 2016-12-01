import java.net.MalformedURLException;
import java.net.URL;

public class Transactions {

//Load Transactions
	void getAllTransactions() throws MalformedURLException{
		URL uri = new URL("https://2016.api.levelmoney.com/api/v2/core/get-all-transactions");
	}
}
