package com.mindtree.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stagingtable database table.
 * 
 */
@Entity
@NamedQuery(name="Stagingtable.findAll", query="SELECT s FROM Stagingtable s")
public class Stagingtable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idStagingtable;

	private String stagcol1;

	private String stagcol2;

	private String stagecol3;

	private String stagingtablecol4;

	public Stagingtable() {
	}

	public int getIdStagingtable() {
		return this.idStagingtable;
	}

	public void setIdStagingtable(int idStagingtable) {
		this.idStagingtable = idStagingtable;
	}

	public String getStagcol1() {
		return this.stagcol1;
	}

	public void setStagcol1(String stagcol1) {
		this.stagcol1 = stagcol1;
	}

	public String getStagcol2() {
		return this.stagcol2;
	}

	public void setStagcol2(String stagcol2) {
		this.stagcol2 = stagcol2;
	}

	public String getStagecol3() {
		return this.stagecol3;
	}

	public void setStagecol3(String stagecol3) {
		this.stagecol3 = stagecol3;
	}

	public String getStagingtablecol4() {
		return this.stagingtablecol4;
	}

	public void setStagingtablecol4(String stagingtablecol4) {
		this.stagingtablecol4 = stagingtablecol4;
	}

}