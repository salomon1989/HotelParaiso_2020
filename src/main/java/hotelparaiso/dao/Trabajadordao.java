package hotelparaiso.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Trabajadordao {
	HashMap<String, Object> validar(String login, String password);
	List<Map<String, Object>> readAll();
}
