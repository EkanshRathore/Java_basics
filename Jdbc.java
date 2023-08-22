import java.sql.*;

public class Jdbc {
public static void main(String[] args)throws Exception {}
private static void createStatement() {

{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql:/localhost:3306/test","Dryunicron","Sinister@20023");
    Statement stat=con.createStatement();
    ResultSet rs=stat.executeQuery("select * from employee");
    while(rs.next())
    {
        System.out.println(rs.getInt(l)+" "+rs.getString(2));
    }
}


}
