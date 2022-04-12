package webpghw.dao;

import webpghw.model.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImp implements BookDao{
    @Override
    public boolean create(Book book) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        String sql = "INSERT into books (name, price) VALUES (?, ?)";
        boolean rowInserted = false;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, book.getName());
        statement.setInt(2, book.getPrice());
        rowInserted = statement.executeUpdate() > 0;
        connection.close();
        return rowInserted;

    }

    @Override
    public boolean update(Book book) throws SQLException{
        Connection connection = ConnectionManager.getConnection();
        String sql = "UPDATE books SET id = ?, name = ?, price = ?, publisher_id = ?";
        sql += "WHERE id = ?";
        boolean rowUpdated = false;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, book.getId());
        statement.setString(2, book.getName());
        statement.setInt(3, book.getPrice());
        statement.setInt(4, book.getPublisherId());
        rowUpdated = statement.executeUpdate() > 0;
        connection.close();
        return rowUpdated;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        String sql = "DELETE FROM books where id = ?";
        boolean rowDeleted = false;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        rowDeleted = statement.executeUpdate() > 0;
        connection.close();
        return rowDeleted;

    }

    @Override
    public List<Book> getAll() throws SQLException {
        List<Book> listBook = new ArrayList<>();
        Connection connection = ConnectionManager.getConnection();
        String sql = "SELECT id, name, price, publisher_id FROM books";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int price = resultSet.getInt("price");
            int publisher_id = resultSet.getInt("publisher_id");
            Book book = new Book(id, name, price, publisher_id);
            listBook.add(book);
        }
        connection.close();
        return listBook;
    }
}
