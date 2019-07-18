package testcase;

import java.sql.Timestamp;

import model.manager.ManagerBean;
import model.manager.ManagerService;

public class TestManagerService {
	public static void main(String[] args) {

		String url = "jdbc:sqlserver://localhost:1433;";
		String dbName = "databaseName=FinalProject;";
		String user = "sa";
		String password = "passw0rd";
		ManagerService service = new ManagerService(url + dbName, user, password);

		try {
//			ManagerBean test = service.insertManager(
//					new ManagerBean(1, "peterchao", "peterchao","a12345"));
//			System.out.println(test.toString());
//			System.out.println(service.delete(1));
			System.out.println(service.select("peterchao").toString());
			System.out.println(service.select().get(0).toString());
			System.out.println(service.select().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		service.close();
	}
}
