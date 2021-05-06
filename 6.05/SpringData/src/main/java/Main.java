
import org.postgresql.*;
import org.postgresql.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

public class Main {

    static List<User> result = new ArrayList<>();

    static String SQL_SELECT = "select * from users";

    public static void main(String[] args) throws Exception {
        try (Connection connection = getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT);
            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {

                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");

                User obj = new User();
                obj.setId(id);
                obj.setName(name);

                result.add(obj);

            }
            result.forEach(x -> System.out.println(x));

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() throws Exception {

        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd", "bebes", "2812tyHx_8");
    }
}
