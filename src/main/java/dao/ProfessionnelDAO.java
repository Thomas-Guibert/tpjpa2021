package dao;

import domain.Professionnel;

public class ProfessionnelDAO extends AbstractJpaDao <Long,Professionnel>{

	public ProfessionnelDAO() {
		super(Professionnel.class);
	}

}
