package org.lnu.is.domain.profession;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OB;
import org.lnu.is.domain.InformationModel;

/**
 * Profession entity.
 * 
 * @author kushnir
 *
 */
@OB
@Entity
@Table(name = "q_ob_profession")
public class Profession extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Profession parent;

	@Column(name = "abbrname")
	private String abbrName;

	@Column(name = "name")
	private String name;

	public Profession getParent() {
		return parent;
	}

	public void setParent(final Profession parent) {
		this.parent = parent;
	}

	public String getAbbrName() {
		return abbrName;
	}

	public void setAbbrName(final String abbrName) {
		this.abbrName = abbrName;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Profession other = (Profession) obj;
		if (abbrName == null) {
			if (other.abbrName != null) {
				return false;
			}
		} else if (!abbrName.equals(other.abbrName)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Profession [abbrName=" + abbrName + ", name=" + name + "]";
	}

}
