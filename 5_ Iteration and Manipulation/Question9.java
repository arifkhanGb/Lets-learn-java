package Day_11_12;

import java.sql.*;

public class Question9 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        try {
            String Url = "jdbc:h2:mem:test";
            Connection con = null;
            Statement stmt = null;

            Class.forName("org.h2.Driver");

            con = DriverManager.getConnection(Url, "sa", "sa");

            stmt = con.createStatement();
            String sql = "CREATE TABLE   REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);

            System.out.println("table created in DB");

             sql = "INSERT INTO Registration " + "VALUES (100, 'Zara', 18)";

            stmt.executeUpdate(sql);
            System.out.println("recort inserted");



            sql = "select first from Registration";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                // Retrieve by column name

                String first = rs.getString("first");


                // Display values

                System.out.print(", name: " + first);

            }


            con.close();
            stmt.close();

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("");
        }
    }
}
