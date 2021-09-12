package dao;

import domain.RendezVous;

public class RendezVousDAO extends AbstractJpaDao<Long,RendezVous>{

	public RendezVousDAO() {
		super(RendezVous.class);
	}

}
