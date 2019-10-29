package jdbc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import conntroler.MetodeJdbc;
import model.Kurs;
import model.User;

public class JdbcProject {

	public static void main(String[] args) {
		
		MetodeJdbc metode = new MetodeJdbc();
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Unesite id usera: "); String id = scanner.nextLine();
		 * 
		 * User user = metode.vratiUseraPoId(Integer.parseInt(id)); if (user.getIdUser()
		 * != 0) { System.out.println("ID " + user.getIdUser());
		 * System.out.println("USER NAME " + user.getUserName());
		 * System.out.println("PASSWORD " + user.getPassword());
		 * System.out.println("MSTBR " + user.getMaticniBroj()); } else {
		 * System.out.println("Ne postoji user!"); }
		 */
		/*
		 * List<User> lstUsers = metode.vratiSveUsere();
		 * 
		 * for (User u: lstUsers) { System.out.println("ID " + u.getIdUser());
		 * System.out.println("USER NAME " + u.getUserName());
		 * System.out.println("PASSWORD " + u.getPassword());
		 * System.out.println("MSTBR " + u.getMaticniBroj()); }
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite username: ");
		
		String userName = scanner.nextLine();
		
		int id = metode.vratiIdPoUsername(userName);
		
		List<String> listaBrojevaTelefona = new ArrayList<String>();
		if(id !=0 ) {
			listaBrojevaTelefona = metode.vratiBrojTelefona(id);
			
			for (String s: listaBrojevaTelefona) {
				System.out.println(s);
			}
		} else {
			System.out.println("Nepostojeci user! ");
		}

	}

}
