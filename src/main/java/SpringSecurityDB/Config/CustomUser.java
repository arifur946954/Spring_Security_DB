package SpringSecurityDB.Config;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import SpringSecurityDB.Entity.Employe;

public class CustomUser implements UserDetails{
	private Employe emp;
	

	public CustomUser(Employe emp) {
		super();
		this.emp = emp;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority=   new SimpleGrantedAuthority(emp.getRole());
		return Arrays.asList(authority);
	}

	@Override
	public String getPassword() {
		
		return emp.getPassword();
	}

	@Override
	public String getUsername() {
	
		return emp.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
	
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}

}
