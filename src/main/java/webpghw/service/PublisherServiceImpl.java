package webpghw.service;

import webpghw.dao.PublisherDao;
import webpghw.dao.PublisherDaoImp;
import webpghw.model.Publisher;

import java.sql.SQLException;
import java.util.List;

public class PublisherServiceImpl implements PublisherService {

    private static final PublisherDao publisherDao = new PublisherDaoImp();

    @Override
    public void create(String name, String address, int phoneNumber) throws SQLException {
        Publisher publisher = new Publisher(name, address);
        publisherDao.create(publisher);

    }

    @Override
    public void update(int id, String name, String address, int phoneNumber) throws SQLException {
        Publisher publisher = new Publisher(id, name, address);
        publisherDao.update(publisher);

    }

    @Override
    public void delete(int id) throws SQLException {
        publisherDao.delete(id);


    }

    @Override
    public List<Publisher> getAll() throws SQLException {
        return publisherDao.getAll();
    }
}
