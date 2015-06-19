package org.lnu.is.resource.person;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.MultiSearchResource;

import java.util.Date;
import java.util.List;

/**
 * Resource for person.
 * @author ivanursul
 *
 */
@CrudableResource
public class PersonResourceList extends MultiSearchResource {

	private List<Long> parentIds;

	private List<Long> personTypeIds;
	
	private List<Long> genderTypeIds;
	
	private List<Long> marriedTypeIds;
	
	private List<Long> citizenCountryIds;

	private List<String> names;
	
	private List<String> firstNames;
	
	private List<String> fatherNames;
	
	private List<String> surnames;
	
	private List<String> photos;
	
	private List<String> docSeries;
	
	private List<String> docNums;
	
	private List<String> identifiers;

	private List<String> birthPlaces;

	private Integer resident;

	private Date begDate;
	
	private Date endDate;
	
	private Integer isMilitary;
	
	private Integer isHostel;

	@Override
	public String getRootUri() {
		return "/persons";
	}

	public List<Long> getParentIds() {
		return parentIds;
	}

	public void setParentIds(final List<Long> parentIds) {
		this.parentIds = parentIds;
	}

	public List<Long> getPersonTypeIds() {
		return personTypeIds;
	}

	public void setPersonTypeIds(final List<Long> personTypeIds) {
		this.personTypeIds = personTypeIds;
	}

	public List<Long> getGenderTypeIds() {
		return genderTypeIds;
	}

	public void setGenderTypeIds(final List<Long> genderTypeIds) {
		this.genderTypeIds = genderTypeIds;
	}

	public List<Long> getMarriedTypeIds() {
		return marriedTypeIds;
	}

	public void setMarriedTypeIds(final List<Long> marriedTypeIds) {
		this.marriedTypeIds = marriedTypeIds;
	}

	public List<Long> getCitizenCountryIds() {
		return citizenCountryIds;
	}

	public void setCitizenCountryIds(final List<Long> citizenCountryIds) {
		this.citizenCountryIds = citizenCountryIds;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(final List<String> names) {
		this.names = names;
	}

	public List<String> getFirstNames() {
		return firstNames;
	}

	public void setFirstNames(final List<String> firstNames) {
		this.firstNames = firstNames;
	}

	public List<String> getFatherNames() {
		return fatherNames;
	}

	public void setFatherNames(final List<String> fatherNames) {
		this.fatherNames = fatherNames;
	}

	public List<String> getSurnames() {
		return surnames;
	}

	public void setSurnames(final List<String> surnames) {
		this.surnames = surnames;
	}

	public List<String> getPhotos() {
		return photos;
	}

	public void setPhotos(final List<String> photos) {
		this.photos = photos;
	}

	public List<String> getDocSeries() {
		return docSeries;
	}

	public void setDocSeries(final List<String> docSeries) {
		this.docSeries = docSeries;
	}

	public List<String> getDocNums() {
		return docNums;
	}

	public void setDocNums(final List<String> docNums) {
		this.docNums = docNums;
	}

	public List<String> getIdentifiers() {
		return identifiers;
	}

	public void setIdentifiers(final List<String> identifiers) {
		this.identifiers = identifiers;
	}

	public List<String> getBirthPlaces() {
		return birthPlaces;
	}

	public void setBirthPlaces(final List<String> birthPlaces) {
		this.birthPlaces = birthPlaces;
	}

	public Integer getResident() {
		return resident;
	}

	public void setResident(final Integer resident) {
		this.resident = resident;
	}

	public Date getBegDate() {
		return begDate;
	}

	public void setBegDate(final Date begDate) {
		this.begDate = begDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	public Integer getIsMilitary() {
		return isMilitary;
	}

	public void setIsMilitary(final Integer isMilitary) {
		this.isMilitary = isMilitary;
	}

	public Integer getIsHostel() {
		return isHostel;
	}

	public void setIsHostel(final Integer isHostel) {
		this.isHostel = isHostel;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}

		PersonResourceList that = (PersonResourceList) o;

		if (parentIds != null ? !parentIds.equals(that.parentIds) : that.parentIds != null) {
			return false;
		}
		if (personTypeIds != null ? !personTypeIds.equals(that.personTypeIds) : that.personTypeIds != null) {
			return false;
		}
		if (genderTypeIds != null ? !genderTypeIds.equals(that.genderTypeIds) : that.genderTypeIds != null) {
			return false;
		}
		if (marriedTypeIds != null ? !marriedTypeIds.equals(that.marriedTypeIds) : that.marriedTypeIds != null) {
			return false;
		}
		if (citizenCountryIds != null ? !citizenCountryIds.equals(that.citizenCountryIds) : that.citizenCountryIds != null) {
			return false;
		}
		if (names != null ? !names.equals(that.names) : that.names != null) {
			return false;
		}
		if (firstNames != null ? !firstNames.equals(that.firstNames) : that.firstNames != null) {
			return false;
		}
		if (fatherNames != null ? !fatherNames.equals(that.fatherNames) : that.fatherNames != null) {
			return false;
		}
		if (surnames != null ? !surnames.equals(that.surnames) : that.surnames != null) {
			return false;
		}
		if (photos != null ? !photos.equals(that.photos) : that.photos != null) {
			return false;
		}
		if (docSeries != null ? !docSeries.equals(that.docSeries) : that.docSeries != null) {
			return false;
		}
		if (docNums != null ? !docNums.equals(that.docNums) : that.docNums != null) {
			return false;
		}
		if (identifiers != null ? !identifiers.equals(that.identifiers) : that.identifiers != null) {
			return false;
		}
		if (birthPlaces != null ? !birthPlaces.equals(that.birthPlaces) : that.birthPlaces != null) {
			return false;
		}
		if (resident != null ? !resident.equals(that.resident) : that.resident != null) {
			return false;
		}
		if (begDate != null ? !begDate.equals(that.begDate) : that.begDate != null) {
			return false;
		}
		if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) {
			return false;
		}
		if (isMilitary != null ? !isMilitary.equals(that.isMilitary) : that.isMilitary != null) {
			return false;
		}
		return !(isHostel != null ? !isHostel.equals(that.isHostel) : that.isHostel != null);

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (parentIds != null ? parentIds.hashCode() : 0);
		result = 31 * result + (personTypeIds != null ? personTypeIds.hashCode() : 0);
		result = 31 * result + (genderTypeIds != null ? genderTypeIds.hashCode() : 0);
		result = 31 * result + (marriedTypeIds != null ? marriedTypeIds.hashCode() : 0);
		result = 31 * result + (citizenCountryIds != null ? citizenCountryIds.hashCode() : 0);
		result = 31 * result + (names != null ? names.hashCode() : 0);
		result = 31 * result + (firstNames != null ? firstNames.hashCode() : 0);
		result = 31 * result + (fatherNames != null ? fatherNames.hashCode() : 0);
		result = 31 * result + (surnames != null ? surnames.hashCode() : 0);
		result = 31 * result + (photos != null ? photos.hashCode() : 0);
		result = 31 * result + (docSeries != null ? docSeries.hashCode() : 0);
		result = 31 * result + (docNums != null ? docNums.hashCode() : 0);
		result = 31 * result + (identifiers != null ? identifiers.hashCode() : 0);
		result = 31 * result + (birthPlaces != null ? birthPlaces.hashCode() : 0);
		result = 31 * result + (resident != null ? resident.hashCode() : 0);
		result = 31 * result + (begDate != null ? begDate.hashCode() : 0);
		result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
		result = 31 * result + (isMilitary != null ? isMilitary.hashCode() : 0);
		result = 31 * result + (isHostel != null ? isHostel.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("parentIds", parentIds)
				.append("personTypeIds", personTypeIds)
				.append("genderTypeIds", genderTypeIds)
				.append("marriedTypeIds", marriedTypeIds)
				.append("citizenCountryIds", citizenCountryIds)
				.append("names", names)
				.append("firstNames", firstNames)
				.append("fatherNames", fatherNames)
				.append("surnames", surnames)
				.append("photos", photos)
				.append("docSeries", docSeries)
				.append("docNums", docNums)
				.append("identifiers", identifiers)
				.append("birthPlaces", birthPlaces)
				.append("resident", resident)
				.append("begDate", begDate)
				.append("endDate", endDate)
				.append("isMilitary", isMilitary)
				.append("isHostel", isHostel)
				.toString();
	}
}
