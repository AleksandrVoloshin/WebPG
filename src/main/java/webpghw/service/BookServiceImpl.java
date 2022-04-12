package webpghw.service;

import webpghw.dao.BookDao;
import webpghw.dao.BookDaoImp;
import webpghw.model.Book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService{

    private static final BookDao bookDao = new BookDaoImp();

    @Override
    public void create(String title, int price) throws SQLException {
        Book book = new Book(title, price);
        bookDao.create(book);

    }

    @Override
    public void update(int id, String title, int price) throws SQLException{
        Book book = new Book(id, title, price);
        bookDao.create(book);

    }

    @Override
    public void delete(int id) throws SQLException {
        bookDao.delete(id);

    }

    @Override
    public List<Book> getAll() {
        List<Book> books = new ArrayList<>();
        try {
            books = bookDao.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }
}
