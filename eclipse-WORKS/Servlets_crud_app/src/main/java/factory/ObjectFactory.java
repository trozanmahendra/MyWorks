package factory;

import DAO.ConnectionProvider;
import service.AddStudentService;
import service.DeleteStudentService;
import service.SearchStudentService;

public class ObjectFactory {
	private static ConnectionProvider connectionProvider;
	private static AddStudentService addStudent;

	public static ConnectionProvider connectionProvider() {
		ConnectionProvider connectionProvider = new ConnectionProvider();

		return connectionProvider;
	}

	public static AddStudentService addStudent() {

		AddStudentService addStudent = new AddStudentService();
		return addStudent;

	}

	public static SearchStudentService searchstdent() {
		SearchStudentService searchStudent = new SearchStudentService();
		return searchStudent;

	}
	public static DeleteStudentService deleteStudent() {
		DeleteStudentService deleteStudent = new DeleteStudentService();
		return deleteStudent;
		
	}
}
