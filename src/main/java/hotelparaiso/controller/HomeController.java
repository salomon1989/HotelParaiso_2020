package hotelparaiso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import hotelparaiso.entity.Trabajador;
import hotelparaiso.security.JwtUtil;


@RestController
public class HomeController {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
    private JwtUtil jwtUtil;
	@GetMapping("/")
	public String mensaje() {
		return "Bienvenidos a Microservicios Síncronos";
	}
	@PostMapping("/authenticate")
	    public String generateToken(@RequestBody Trabajador authRequest) throws Exception {
	        try {
	        	System.out.println(authRequest.getLogin());
	        	
	            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getLogin(), authRequest.getPassword()));
	        } catch (Exception ex) {
	            throw new Exception("Error: "+ex);
	        }
            return jwtUtil.generateToken(authRequest.getLogin());
	    }

}
