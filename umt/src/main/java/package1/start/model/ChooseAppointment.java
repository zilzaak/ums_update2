package package1.start.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table
@Entity
public class ChooseAppointment {
     private int chid;
     private String prname;
     private String dname;
     public String getPrname() {
		return prname;
	}
	public void setPrname(String prname) {
		this.prname = prname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}


	private String chsmg;
     private int sirialno;
     public int getSirialno() {
		return sirialno;
	}
	public void setSirialno(int sirialno){
		this.sirialno = sirialno;
	}
	public String getChsmg() {
		return chsmg;
	}
	public void setChsmg(String chsmg) {
		this.chsmg = chsmg;
	}
	@Id
     @GeneratedValue
	public int getChid() {
		return chid;
	}
	public void setChid(int chid) {
		this.chid = chid;
	}
	public ChooseAppointment() {
		super();
		
	}
	
	
	
	public int getChsid() {
		return chsid;
	}
	public void setChsid(int chsid) {
		this.chsid = chsid;
	}
	
	
	public ChooseAppointment(String prname, String dname, String chsmg, int sirialno, int chsid, int chdid,
			Date chdate) {
		super();
		this.prname = prname;
		this.dname = dname;
		this.chsmg = chsmg;
		this.sirialno = sirialno;
		this.chsid = chsid;
		this.chdid = chdid;
		this.chdate = chdate;
	}
	public int getChdid() {
		return chdid;
	}
	public void setChdid(int chdid) {
		this.chdid = chdid;
	}
	public Date getChdate() {
		return chdate;
	}
	public void setChdate(Date chdate) {
		this.chdate = chdate;
	}


	private int chsid;
	private int chdid;
	private Date chdate;
		
}
