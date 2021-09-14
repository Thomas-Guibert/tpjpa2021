package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import domain.Professionnel;
import domain.RendezVous;
import domain.User;

public class RendezVousDAO extends AbstractJpaDao<Long,RendezVous>{

	public RendezVousDAO() {
		super(RendezVous.class);
	}
	
	@SuppressWarnings("deprecation")
	public void createRDV(User u, Professionnel p) {
		RendezVous r = new RendezVous(new Date(2021,9,13,18,30), 30, u, p, "Bilan");
		save(r);
		
		List<RendezVous> lru = new ArrayList<RendezVous>();
		lru.addAll(u.getRendezvous());
		lru.add(r);
		u.setRendezvous(lru);
		UserDAO udao = new UserDAO();
		udao.update(u);
		
		List<RendezVous> lrp = new ArrayList<RendezVous>();
		lrp.addAll(u.getRendezvous());
		lrp.add(r);
		u.setRendezvous(lrp);
		ProfessionnelDAO pdao = new ProfessionnelDAO();
		pdao.update(p);
	}

}
