

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


 
public class DBConnection 
{
    public static Connection dbConn;
    
        public static Connection getConnection()
        {
            Connection conn = null;
            try {
                String user = "kitri"; 
                String pw = "kitri";
                String url = "jdbc:oracle:thin:@192.168.14.36:1521:orcl";
                
                Class.forName("oracle.jdbc.driver.OracleDriver");        
                conn = DriverManager.getConnection(url, user, pw);
                
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