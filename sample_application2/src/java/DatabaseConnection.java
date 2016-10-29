
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DatabaseConnection {
    Connection conn;
    Statement stmt;
    ResultSet res;
    
    public DatabaseConnection()
    {
        
    }
    public Connection seConnection()
    {
         try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","root");
             
            }catch(Exception e){
             
            }return conn;
    }
    public ResultSet gResultSet(String sql,Connection conn){
       this.conn = conn;
        try{
            stmt=conn.createStatement();
            res=stmt.executeQuery(sql);
           }catch(Exception e){
               
           }
            return res;
            }
    }  

 

