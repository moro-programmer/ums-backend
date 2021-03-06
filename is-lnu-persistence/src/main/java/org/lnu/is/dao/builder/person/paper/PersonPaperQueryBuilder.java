package org.lnu.is.dao.builder.person.paper;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.person.paper.PersonPaper;

/**
 * Person Paper Query builder.
 * @author ivanursul
 *
 */
@QBuilder("personPaperQueryBuilder")
public class PersonPaperQueryBuilder extends AbstractQueryBuilder<PersonPaper> {
	private static final String DOCSERIES_CONDITION = "e.docSeries LIKE CONCAT('%',:docSeries,'%') ";
	private static final String DOCNUM_CONDITION = "e.docNum LIKE CONCAT('%',:docNum,'%') ";
	private static final String PERSON_CONDITION = "e.person = :person ";
	private static final String PAPERTYPE_CONDITION = "e.paperType = :paperType ";
	private static final String HONORS_TYPE = "e.honorsType = :honorsType ";
	private static final String DOC_DATE_CONDITION = "e.docDate = :docDate ";
	private static final String DOCISSUED_CONDITION = "e.docIssued = :docIssued ";
	private static final String DOCPIN_CONDITION = "e.docPin = :docPin ";
	private static final String MARK_CONDITION = "e.mark = :mark ";
	private static final String ISCHECKED_CONDITION = "e.isChecked = :isChecked ";
	private static final String ISFOREIGN_CONDITION = "e.isForeign = :isForeign ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PersonPaper e %s";
	}

	@Override
	protected BaseQueryBuilder build(final PersonPaper context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(PERSON_CONDITION, context.getPerson())
					.addAndCondition(PAPERTYPE_CONDITION, context.getPaperType())
					.addAndCondition(HONORS_TYPE, context.getHonorsType())
					.addAndCondition(DOC_DATE_CONDITION, context.getDocDate())
					.addAndCondition(DOCSERIES_CONDITION, context.getDocSeries())
					.addAndCondition(DOCNUM_CONDITION, context.getDocNum())
					.addAndCondition(DOCISSUED_CONDITION, context.getDocIssued())
					.addAndCondition(DOCPIN_CONDITION, context.getDocPin())
					.addAndCondition(MARK_CONDITION, context.getMark())
					.addAndCondition(ISCHECKED_CONDITION, context.getIsChecked())
					.addAndCondition(ISFOREIGN_CONDITION, context.getIsForeign())
				.closeBracket();
	}

}
