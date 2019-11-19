package webApp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserRepository extends AbstractJpaRepository<User>{

	@PersistenceContext
	private EntityManager em;
	
	protected UserRepository() {
		super(User.class);
		// TODO Auto-generated constructor stub
	}
	
	public User findOneByLogin(String login) {
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		
		Root<User> user = cq.from(User.class);
		Predicate userLoginPredicate = cb.equal(user.get("login"), login);
		cq.where(userLoginPredicate);
		
		TypedQuery<User> query = em.createQuery(cq);
		
		//return query.getResultList().get(0);
		return query.getSingleResult();
		
	}
	
}
