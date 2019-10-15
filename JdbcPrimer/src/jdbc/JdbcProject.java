package jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import conntroler.MetodeJdbc;

public class JdbcProject {

	public static void main(String[] args) {
		
		Connection konekcija = null;
		Statement statement = null;
		
		try {
			konekcija = MetodeJdbc.uspostaviKonekciju("kursevi");
			System.out.println("Konekcija je uspostavljena");
			String query = "INSERT INTO courses VALUES(null,'CSS',7000)";
			statement = konekcija.createStatement();
			statement.execute(query);
			System.out.println("Uspesan unos");
		} catch (SQLException e) {
			System.out.println("Nije uspostavljena");
		}
		
		

	}

}
