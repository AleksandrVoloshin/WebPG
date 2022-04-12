package webpghw.dao;


import webpghw.model.Book;
import java.sql.SQLException;
import java.util.List;

public interface BookDao {

    boolean create(Book book) throws SQLException;

    boolean update(Book book) throws SQLException;

    boolean delete(int id) throws SQLException;

    List<Book> getAll() throws SQLException;
}
