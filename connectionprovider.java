package mypack;
import java.sql.*;
public class connectionprovider
{
private static connection con;
static
{
 try
{
class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
System.out.println("Connection object created");
}
catch(Exception e)
{
 System.out.println(e);
}
}
public static Connection getConnection()
{
 return(con);
}
}
}
