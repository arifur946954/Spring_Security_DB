package SpringSecurityDB.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import SpringSecurityDB.Entity.Employe;
import SpringSecurityDB.Repository.EmpRepo;
@Component
public class CustomUserDetailService implements UserDetailsService{
	@Autowired
	private EmpRepo emprepo;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	 Employe emp=	emprepo.findByEmail(email);
	 
	 if(emp==null) {
		 throw new UsernameNotFoundException("email not found try again");
		 
	 }
	 else {
		return new CustomUser(emp);
	}
		
	}

}
