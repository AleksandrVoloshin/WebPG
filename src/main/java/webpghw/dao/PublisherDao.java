package webpghw.dao;

import webpghw.model.Publisher;
import java.sql.SQLException;
import java.util.List;

public interface PublisherDao {

    boolean create(Publisher publisher) throws SQLException;

    boolean update(Publisher publisher) throws SQLException;

    boolean delete(int id) throws SQLException;

    List<Publisher> getAll() throws SQLException;
}
