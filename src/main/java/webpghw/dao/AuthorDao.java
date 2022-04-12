package webpghw.dao;

import webpghw.model.Author;
import java.sql.SQLException;
import java.util.List;

public interface AuthorDao {

    boolean create(Author author) throws SQLException;

    boolean update(Author author) throws SQLException;

    boolean delete(int id) throws SQLException;

    List<Author> getAll() throws SQLException;
}
