package DB;
import java.sql.*;

public class DBConnection {
	public static Connection dbConn;
		public static Connection getConnection()
		{
			Connection conn = null;
			try {
				   String user = "kitri"; //접속할 계정명
	                String pw = "kitri"; //계정의 비밀번호
	                String url = "jdbc:oracle:thin:@localhost:1521:orcl";  //"오라클에게접속하겠다고알려줌: 자신의IP주소 :포트번호 : DB이름"
	                
	                Class.forName("oracle.jdbc.driver.OracleDriver");        //로딩
	                conn = DriverManager.getConnection(url, user, pw);	//주소,계정,비밀번호 를 바탕으로 접속
	                
	                System.out.println("Database에 연결되었습니다.\n");
	                
	            } catch (ClassNotFoundException cnfe) {
	                System.out.println("DB 드라이버 로딩 실패 :"+cnfe.toString());
	            } catch (SQLException sqle) {
	                System.out.println("DB 접속실패 : "+sqle.toString());
	            } catch (Exception e) {
	                System.out.println("Unkonwn error");
	                e.printStackTrace();
	            }
	            return conn;     
	        }
	}