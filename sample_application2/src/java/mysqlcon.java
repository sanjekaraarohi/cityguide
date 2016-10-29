import java.sql.*;  
class mysqlcon{  

public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/sample","root","1234");  
  
    System.out.println("connected");
  
String query ;
    query = "insert into emp values(?,? , ?)";
    PreparedStatement psmt = con.prepareStatement(query);
    psmt.setInt(1,102);
   
    psmt.setInt(2,10);
    
    psmt.setString(3, "john");
    int i = psmt.executeUpdate();
    if(i>0)
    {
         System.out.println("data entered");
    }
    else
    { 
        System.out.println("not");
    }
}catch(Exception e)
{ 
    System.out.println(e);
}  
  
}  
}  