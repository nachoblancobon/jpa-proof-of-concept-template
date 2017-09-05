
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.uqbarproject.jpa.java8.extras.PerThreadEntityManagers;

import jacklow.model.Robo;
import jacklow.model.Vehiculo;

public class Main {

	private static EntityManager entityManager = PerThreadEntityManagers.getEntityManager();
	
	public static void main(String[] args) {
		EntityTransaction tx = entityManager.getTransaction();
		
		tx.begin();
		
		Vehiculo vehiculo = entityManager.find(Vehiculo.class, new Long(1));

		Robo robo = new Robo();
		robo.setVehiculo(vehiculo);
		
		entityManager.persist(vehiculo);
		entityManager.persist(robo);
		
		tx.commit();
	}
	
	
	
	
	
	
}
