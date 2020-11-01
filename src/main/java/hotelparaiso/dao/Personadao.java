package hotelparaiso.dao;

import java.util.List;
import java.util.Map;

import hotelparaiso.entity.Persona;

public interface Personadao {
	 int create(Persona p);
	 int update(Persona p);
	 int delete(int id);
	 List<Map<String, Object>> readAll(int id);
	 List<Map<String, Object>> readAll();
}
