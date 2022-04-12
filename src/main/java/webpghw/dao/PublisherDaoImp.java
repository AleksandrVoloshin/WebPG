package webpghw.dao;

import webpghw.model.Publisher;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PublisherDaoImp implements PublisherDao{
    @Override
    public boolean create(Publisher publisher) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        String sql = "INSERT into publishers (name, address) VALUES (?, ?)";
        boolean rowInserted = false;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, publisher.getName());
        statement.setString(2, publisher.getAddress());
        rowInserted = statement.executeUpdate() > 0;
        return rowInserted;

    }

    @Override
    public boolean update(Publisher publisher) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        String sql = "UPDATE publishers SET id = ?, name = ?, address = ?";
        sql += "WHERE id = ?";
        boolean rowUpdated = false;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, publisher.getId());
        statement.setString(2,publisher.getName());
        statement.setString(3, publisher.getAddress());
        rowUpdated = statement.executeUpdate() > 0;
        return rowUpdated;

    }

    @Override
    public boolean delete(int id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        String sql = "DELETE FROM publishers where id = ?";
        boolean rowDeleted = false;
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        rowDeleted = statement.executeUpdate() > 0;
        return rowDeleted;

    }

    @Override
    public List<Publisher> getAll() throws SQLException {
        List<Publisher> listPublisher = new ArrayList<>();
        Connection connection = ConnectionManager.getConnection();
        String sql = "SELECT id, name, address, phone_number FROM publishers";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String address = resultSet.getString("address");
            int phone_number = resultSet.getInt("phone_number");
            Publisher publisher = new Publisher(id, name, address);
            listPublisher.add(publisher);
        }

        return listPublisher;
    }
}
