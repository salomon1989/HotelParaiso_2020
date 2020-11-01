package hotelparaiso.dao;

import java.util.List;
import java.util.Map;

import hotelparaiso.entity.Reserva;

public interface Reservadao {
	public int create(Reserva r);
	public int update(Reserva r);
	public int delete(int id);
	List<Map<String, Object>> readAll(int id);
    List<Map<String, Object>> readAll();
}
