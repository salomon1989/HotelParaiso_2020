package hotelparaiso.dao;

import java.util.List;

import hotelparaiso.entity.Habitacion;

public interface Habitaciondao {
	int create(Habitacion h);
    int update(Habitacion h);
    int delete(int id);
    Habitacion read(int id);
    List<Habitacion> readAll(int id);
    List<Habitacion> readAll();
}
