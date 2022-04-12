package webpghw.service;

import webpghw.model.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookService {

    void create(String title, int price) throws SQLException;

    void update(int id, String title, int price) throws SQLException;

    void delete(int id) throws SQLException;

    List<Book> getAll() throws SQLException;
}
