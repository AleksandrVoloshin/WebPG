package webpghw.dao;

import webpghw.model.Author;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorDaoImp implements AuthorDao{
    @Override
    public boolean create(Author author) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        String sql = "INSERT into authors (name, birthday) VALUES (?, ?)";
        boolean rowInserted = false;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, author.getName());
        statement.setString(2, author.getBirthday());
        rowInserted = statement.executeUpdate() > 0;
        return rowInserted;
    }

    @Override
    public boolean update(Author author) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        String sql = "UPDATE authors SET name = ?, birthday = ?";
        sql += "WHERE id = ?";
        boolean rowUpdated = false;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, author.getId());
        statement.setString(2, author.getName());
        statement.setString(3, author.getBirthday());
        rowUpdated = statement.executeUpdate() > 0;
        return rowUpdated;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        String sql = "DELETE FROM authors where id = ?";
        boolean rowDeleted = false;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        rowDeleted = statement.executeUpdate() > 0;
        return rowDeleted;

    }

    @Override
    public List<Author> getAll() throws SQLException {
        List<Author> listAuthor = new ArrayList<>();
        Connection connection = ConnectionManager.getConnection();
        String sql = "SELECT id, name, birthday FROM authors";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String birthday = resultSet.getString("birthday");
            Author author = new Author(id, name, birthday);
            listAuthor.add(author);
        }

        return listAuthor;
    }
}
