package hotelparaiso.dao;

import java.util.List;
import java.util.Map;

import hotelparaiso.entity.Cliente;

public interface Clientedao {
	int create(Cliente c);
    int update(Cliente c);
    int delete(int id);
    List<Map<String, Object>> readAll(int id);
    List<Map<String, Object>> readAll();
}
