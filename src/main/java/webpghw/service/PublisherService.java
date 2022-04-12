package webpghw.service;


import webpghw.model.Publisher;

import java.sql.SQLException;
import java.util.List;

public interface PublisherService {

    void create(String name, String address, int phoneNumber) throws SQLException;

    void update(int id, String name, String address, int phoneNumber) throws SQLException;

    void delete(int id) throws SQLException;

    List<Publisher> getAll() throws SQLException;
}
