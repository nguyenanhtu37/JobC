package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:1433/JobC";
    private static final String JDBC_USER = "sa";
    private static final String JDBC_PASSWORD = "admin";

    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String sql = "SELECT * FROM account";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        Account account = new Account();
                        account.setId(resultSet.getInt("id"));
                        account.setUsername(resultSet.getString("username"));
                        // ... (thêm các trường khác của tài khoản)

                        accounts.add(account);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return accounts;
    }
}
