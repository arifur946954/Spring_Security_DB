package SpringSecurityDB;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Demo {
  public static void main(String[] args) {
	  System.out.println("paSSWORD IS: ");
	  
	  System.out.println(new BCryptPasswordEncoder().encode("1234"));
	  
  }
}
