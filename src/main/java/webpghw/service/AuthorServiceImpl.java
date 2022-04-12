package webpghw.service;

import webpghw.dao.AuthorDao;
import webpghw.dao.AuthorDaoImp;
import webpghw.model.Author;

import java.sql.SQLException;
import java.util.List;

public class AuthorServiceImpl implements AuthorService{

    private static final AuthorDao authorDao = new AuthorDaoImp();

    @Override
    public void create(String name, String birthday) throws SQLException {
        Author author = new Author(name, birthday);
        authorDao.create(author);

    }

    @Override
    public void update(int id, String name, String birthday) throws SQLException {
        Author author = new Author(id, name, birthday);
        authorDao.update(author);

    }

    @Override
    public void delete(int id) throws SQLException {
        authorDao.delete(id);

    }

    @Override
    public List<Author> getAll() throws SQLException {
        return authorDao.getAll();
    }
}
