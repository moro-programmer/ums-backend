package org.lnu.is.extractor.enrolment;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.type.EnrolmentType;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Enrolment parameters extractor.
 * 
 * @author kushnir
 *
 */
@ParametersExtractor("enrolmentParametersExtractor")
public class EnrolmentParametersExtractor extends AbstractParametersExtractor<Enrolment> {

	@Resource(name = "markScaleDao")
	private Dao<MarkScale, MarkScale, Long> markScaleDao;
	
	@Resource(name = "personDao")
	private Dao<Person, Person, Long> personDao;

	@Resource(name = "specOfferDao")
	private Dao<SpecOffer, SpecOffer, Long> specOfferDao;

	@Resource(name = "departmentDao")
	private Dao<Department, Department, Long> departmentDao;

	@Resource(name = "personPaperDao")
	private Dao<PersonPaper, PersonPaper, Long> personPaperDao;

	@Resource(name = "enrolmentTypeDao")
	private Dao<EnrolmentType, EnrolmentType, Long> enrolmentTypeDao;

	@Resource(name = "enrolmentDao")
	private Dao<Enrolment, Enrolment, Long> enrolmentDao;

	@Override
	public Map<String, Object> getParameters(final Enrolment entity, final Map<String, Object> parameters) {

		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getSpecOffer(), specOfferDao, "specOffer", parameters);
		addParameter(entity.getDepartment(), departmentDao, "department", parameters);
		addParameter(entity.getPersonPaper(), personPaperDao, "personPaper", parameters);
		addParameter(entity.getEnrolmentType(), enrolmentTypeDao, "enrolmentType", parameters);
		addParameter(entity.getParent(), enrolmentDao, "parent", parameters);
		addParameter(entity.getMarkScale(), markScaleDao, "markScale", parameters);

		addParameter(entity.getMark(), "mark", parameters);
		addParameter(entity.getDocSeries(), "docSeries", parameters);
		addParameter(entity.getDocNum(), "docNum", parameters);
		addParameter(entity.getDocText(), "docText", parameters);
		addParameter(entity.getIsState(), "isState", parameters);
		addParameter(entity.getIsHostel(), "isHostel", parameters);
		addParameter(entity.getIsPrivilege(), "isPrivilege", parameters);
		addParameter(entity.getIsContract(), "isContract", parameters);
		addParameter(entity.getIsEducationState(), "isEducationState", parameters);
		addParameter(entity.getIsInterview(), "isInterview", parameters);
		addParameter(entity.getIsOriginal(), "isOriginal", parameters);
		addParameter(entity.getEvDate(), "evDate", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		addParameter(entity.getPriority(), "priority", parameters);
		
		return parameters;

	}
}
