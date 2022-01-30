package learn_fdbc;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://127.0.0.1:3306/employees_database";

//        //establish connection object
//        Connection connection = DriverManager.getConnection(url,"root", "4582490r");
//
//        //create a statement object
//        Statement statement = connection.createStatement();
//
//        //execute statement
//        //statement.executeUpdate("insert into employees_tbl(id, name, dept, salary)" +
//          //      " values(1000, 'Manny', 'Operator', '5000')");
//
//        // in case delete : delete from employees_tbl where id = 1100;
//        // in case update : update employees_tbl set salary = 5999 where id = '8000'
//
//        ResultSet resultSet = statement.executeQuery("select * from employees_tbl");
//
//        //process the result
//        while (resultSet.next()){
//            System.out.print(resultSet.getString("id"));
//            System.out.print(resultSet.getString("name"));
//            System.out.println(resultSet.getString("salary"));
//        }
//
//        System.out.println(Math.abs(-22));

        Connection connection1 = DriverManager.getConnection(url,"root", "4582490r");

        Statement statement1 = connection1.createStatement();

        ResultSet resultSet1 = statement1.executeQuery("select * from employees_tbl");

        while (resultSet1.next()){
            System.out.println(resultSet1.getString("name"));
        }


    }
}
