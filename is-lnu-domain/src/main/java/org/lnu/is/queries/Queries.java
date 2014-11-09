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

	public static final Queries FIND_SPECOFFERS = new Queries(FIND_SPECOFFERS_QUERY_NAME, FIND_SPECOFFERS_QUERY);
	public static final Queries FIND_SPECIALTIES = new Queries(FIND_SPECIALTIES_QUERY_NAME, FIND_SPECIALTIES_QUERY);
	public static final Queries FIND_DEPARTMENTS = new Queries(FIND_DEPARTMENTS_QUERY_NAME, FIND_DEPARTMENTS_QUERY);
	public static final Queries FIND_PERSONS = new Queries(FIND_PERSONS_QUERY_NAME, FIND_PERSONS_QUERY);

    private final String queryName;
    private final String query;

    /**
     * Constructor, which takes two parameters: name and query.
     * @author ivanursul
     * @param queryName the name of query which will be stored in Queries class.
     * @param query query, which will be stored  in Queries class.
     */
    private Queries(final String queryName, final String query) {
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

