package org.lnu.is.queries;
/**
 * Class, that contains all required queries.
 * @author ivanursul
 */
public final class Queries {
	
	private static final String FIND_SPECOFFERS_QUERY_NAME = "SpecOffers.findSpecOffers";
	private static final String FIND_SPECOFFERS_QUERY = "SELECT s FROM SpecOffer s";

	private static final String FIND_SPECIALTIES_QUERY_NAME = "Specialties.findSpecialties";
	private static final String FIND_SPECIALTIES_QUERY = "SELECT s FROM Specialty s";

	private static final String FIND_DEPARTMENTS_QUERY_NAME = "Departments.findDepartments";
	private static final String FIND_DEPARTMENTS_QUERY = "SELECT d FROM Department d";

	private static final String FIND_PERSONS_QUERY_NAME = "Persons.findPersons";
	private static final String FIND_PERSONS_QUERY = "SELECT p FROM Person p";

	private static final String FIND_ENROLMENT_SUBJECTS_QUERY_NAME = "EnrolmentSubject.findEnrolmentSubjects";
	private static final String FIND_ENROLMENT_SUBJECTS_QUERY = "SELECT e FROM EnrolmentSubject e";

	private static final String FIND_TIME_PERIODS_QUERY_NAME = "TimePeriod.findTimePeriods";
	private static final String FIND_TIME_PERIODS_QUERY = "SELECT t FROM TimePeriod t";

	private static final String FIND_EDU_FORM_TYPES_QUERY_NAME = "EduFormType.getEduFormTypes";
	private static final String FIND_EDU_FORM_TYPES_QUERY = "SELECT e FROM EduFormType e";
	
	private static final String FIND_SPECOFFER_TYPES_QUERY_NAME = "SpecOfferType.findSpecOfferTypes";
	private static final String FIND_SPECOFFER_TYPES_QUERY = "SELECT s FROM SpecOfferType s";

	private static final String FIND_ENROLMENT_STATUS_TYPES_QUERY_NAME = "EnrolmentStatusType.findEnrolmentStatusTypes";
	private static final String FIND_ENROLMENT_STATUS_TYPES_QUERY = "SELECT e FROM EnrolmentStatusType e";
	
	private static final String FIND_GENDER_TYPES_QUERY_NAME = "GenderType.findGenderTypes";
	private static final String FIND_GENDER_TYPES_QUERY = "SELECT g FROM GenderType g";
	
	public static final Queries FIND_SPECOFFERS = new Queries(FIND_SPECOFFERS_QUERY_NAME, FIND_SPECOFFERS_QUERY);
	public static final Queries FIND_SPECIALTIES = new Queries(FIND_SPECIALTIES_QUERY_NAME, FIND_SPECIALTIES_QUERY);
	public static final Queries FIND_DEPARTMENTS = new Queries(FIND_DEPARTMENTS_QUERY_NAME, FIND_DEPARTMENTS_QUERY);
	public static final Queries FIND_PERSONS = new Queries(FIND_PERSONS_QUERY_NAME, FIND_PERSONS_QUERY);
	public static final Queries FIND_ENROLMENT_SUBJECTS = new Queries(FIND_ENROLMENT_SUBJECTS_QUERY_NAME, FIND_ENROLMENT_SUBJECTS_QUERY);
	public static final Queries FIND_TIME_PERIODS = new Queries(FIND_TIME_PERIODS_QUERY_NAME, FIND_TIME_PERIODS_QUERY);
	public static final Queries FIND_EDU_FORM_TYPES = new Queries(FIND_EDU_FORM_TYPES_QUERY_NAME, FIND_EDU_FORM_TYPES_QUERY);
	public static final Queries FIND_SPECOFFER_TYPES = new Queries(FIND_SPECOFFER_TYPES_QUERY_NAME, FIND_SPECOFFER_TYPES_QUERY);
	public static final Queries FIND_ENROLMENT_STATUS_TYPES = new Queries(FIND_ENROLMENT_STATUS_TYPES_QUERY_NAME, FIND_ENROLMENT_STATUS_TYPES_QUERY);
	public static final Queries FIND_GENDER_TYPES = new Queries(FIND_GENDER_TYPES_QUERY_NAME, FIND_GENDER_TYPES_QUERY);
	
    private final String queryName;
    private final String query;

    /**
     * Constructor, which takes two parameters: name and query.
     * @author ivanursul
     * @param queryName the name of query which will be stored in Queries class.
     * @param query query, which will be stored  in Queries class.
     */
    public Queries(final String queryName, final String query) {
        this.queryName = queryName;
        this.query = query;
    }

    public String getQueryName() {
        return queryName;
    }

    public String getQuery() {
        return query;
    }
    
}

