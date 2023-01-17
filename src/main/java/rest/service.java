package rest;

public interface service {
    void create(calculator client);
   // List<rest> readAll();
   calculator read(int n);
    boolean update(calculator client, int n);
    boolean delete(int n);
}

