package SpringSecurityDB.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringSecurityDB.Entity.Employe;



public interface EmpRepo extends JpaRepository<Employe, Integer>{
	public Employe findByEmail(String email);

}
