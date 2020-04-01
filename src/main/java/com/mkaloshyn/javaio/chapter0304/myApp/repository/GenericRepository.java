package main.java.com.mkaloshyn.javaio.chapter0304.myApp.repository;

import java.util.List;

public interface GenericRepository<T, ID> {

    void getById(ID id);

    List<T> getAll();

    T createReport(String name, String status);

    void save(T t);

    void update(T t);

    void deleteById(ID id);

}
