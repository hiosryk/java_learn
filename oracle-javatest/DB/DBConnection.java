package DB;
import java.sql.*;

public class DBConnection {
	public static Connection dbConn;
		public static Connection getConnection()
		{
			Connection conn = null;
			try {
				   String user = "kitri"; //������ ������
	                String pw = "kitri"; //������ ��й�ȣ
	                String url = "jdbc:oracle:thin:@localhost:1521:orcl";  //"����Ŭ���������ϰڴٰ�˷���: �ڽ���IP�ּ� :��Ʈ��ȣ : DB�̸�"
	                
	                Class.forName("oracle.jdbc.driver.OracleDriver");        //�ε�
	                conn = DriverManager.getConnection(url, user, pw);	//�ּ�,����,��й�ȣ �� �������� ����
	                
	                System.out.println("Database�� ����Ǿ����ϴ�.\n");
	                
	            } catch (ClassNotFoundException cnfe) {
	                System.out.println("DB ����̹� �ε� ���� :"+cnfe.toString());
	            } catch (SQLException sqle) {
	                System.out.println("DB ���ӽ��� : "+sqle.toString());
	            } catch (Exception e) {
	                System.out.println("Unkonwn error");
	                e.printStackTrace();
	            }
	            return conn;     
	        }
	}