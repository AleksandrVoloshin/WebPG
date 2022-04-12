package webpghw.service;

import webpghw.model.Author;

import java.sql.SQLException;
import java.util.List;

public interface AuthorService {

    void create(String name, String birthday) throws SQLException;

    void update(int id, String name, String birthday) throws SQLException;

    void delete(int id) throws SQLException;

    List<Author> getAll() throws SQLException;
}
