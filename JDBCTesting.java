import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class JDBCTesting {

	public static void main(String[] args) throws Exception {

		String dbURL = "jdbc:derby://localhost:1527/rpsdb;user=guest;password=password";
		Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
		Connection conn = DriverManager.getConnection(dbURL);

		

		Statement stmt = conn.createStatement();
		ResultSet results = stmt.executeQuery("select * from GAMESUMMARY");
		ResultSetMetaData rsmd = results.getMetaData();
		int numberCols = rsmd.getColumnCount();

		for (int i = 1; i <= numberCols - 1; i++) {
			System.out.print(rsmd.getColumnLabel(i) + "\t\t");
		}

		System.out.println("\n-------------------------------------------------------");

		while (results.next()) {
			GameSummary gameSummary = new GameSummary();
			gameSummary.id = results.getInt(1);
			gameSummary.client = results.getString(2);
			gameSummary.server = results.getString(3);
			gameSummary.result = results.getString(4);
			System.out.println(gameSummary.id + "\t\t" + gameSummary.client + "\t\t" + gameSummary.server + "\t\t" + gameSummary.result);
		}
		results.close();
		stmt.close();
	}
}




/*


ID		CLIENT		SERVER		RESULT		
---------------------------------------
1		ROCK		ROCK		TIE
2		PAPER		ROCK		TIE
3		ROCK		ROCK		TIE
4		Rock		Paper		Loss
5		Rock		Paper		Loss


*/




/*

ID		CLIENT		SERVER		RESULT		
---------------------------------------
1		ROCK		ROCK		TIE
2		PAPER		ROCK		TIE
3		ROCK		ROCK		TIE
4		Rock		Paper		Loss
5		Rock		Paper		Loss

*/


class GameSummary {

	public long id;
	public String toString() {
		return "GameSummary [id=" + id + ", client=" + client + ", server=" + server + ", result=" + result + ", date="
				+ date + "]";
	}
	public String client;
	public String server;
	public String result;
	public java.util.Date date;

}
