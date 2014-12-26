package org.lnu.is.integration

import org.lnu.is.integration.asset.types.AssetTypeIntegrationTest
import org.lnu.is.integration.department.types.DepartmentTypeIntegrationTest
import org.lnu.is.integration.enrolment.statustype.EnrolmentStatusTypeIntegrationTest
import org.lnu.is.integration.enrolment.subject.EnrolmentSubjectIntegrationTest
import org.lnu.is.integration.enrolment.types.EnrolmentTypeIntegrationTest
import org.lnu.is.integration.gendertype.GenderTypeIntegrationTest
import org.lnu.is.integration.language.LanguageIntegrationTest
import org.lnu.is.integration.operation.types.OperationTypeIntegrationTest
import org.lnu.is.integration.order.types.OrderTypeIntegrationTest
import org.lnu.is.integration.partner.PartnerIntegrationTest
import org.lnu.is.integration.person.name.PersonNameIntegrationTest
import org.lnu.is.integration.person.types.PersonTypeIntegrationTest
import org.lnu.is.integration.reasons.ReasonIntegrationTest
import org.lnu.is.integration.specialty.types.SpecialtyTypeIntegrationTest
import org.lnu.is.integration.timeperiod.TimePeriodIntegrationTest
import org.lnu.is.integration.timeperiod.types.TimePeriodTypeIntegrationTest
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef.atOnceUsers
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.http
import io.gatling.http.config.HttpProtocolBuilder.toHttpProtocol
import org.lnu.is.integration.asset.state.AssetStateIntegrationTest
import org.lnu.is.integration.asset.status.AssetStatusIntegrationTest
import org.lnu.is.integration.specialty.SpecialtyIntegrationTest
import org.lnu.is.integration.adminunit.AdminUnitIntegrationTest
import org.lnu.is.integration.benefit.BenefitIntegrationTest
import org.lnu.is.integration.person.PersonIntegrationTest
import org.lnu.is.integration.eduformtypes.EduFormTypeIntegrationTest
import org.lnu.is.integration.address.types.AddressTypeIntegrationTest
import org.lnu.is.integration.contact.types.ContactTypeIntegrationTest

class IntegrationTest extends Simulation {

	val httpConf = http
			.baseURL("http://localhost:8080/is-lnu-rest-api/api")
			.acceptHeader("application/json")
	
	val injectStep = atOnceUsers(1);
	
	setUp(
		AssetTypeIntegrationTest.scn.inject(injectStep),
		AssetStatusIntegrationTest.scn.inject(injectStep),
		AssetStateIntegrationTest.scn.inject(injectStep),
		PersonIntegrationTest.scn.inject(injectStep),
		PersonNameIntegrationTest.scn.inject(injectStep),
		PersonTypeIntegrationTest.scn.inject(injectStep),
		ContactTypeIntegrationTest.scn.inject(injectStep),
		EduFormTypeIntegrationTest.scn.inject(injectStep),
		AddressTypeIntegrationTest.scn.inject(injectStep),
		EnrolmentStatusTypeIntegrationTest.scn.inject(injectStep),
		EnrolmentTypeIntegrationTest.scn.inject(injectStep),
		EnrolmentSubjectIntegrationTest.scn.inject(injectStep),
		GenderTypeIntegrationTest.scn.inject(injectStep),
		LanguageIntegrationTest.scn.inject(injectStep),
		OrderTypeIntegrationTest.scn.inject(injectStep),
		TimePeriodIntegrationTest.scn.inject(injectStep),
		TimePeriodTypeIntegrationTest.scn.inject(injectStep),
		PartnerIntegrationTest.scn.inject(injectStep),
		AdminUnitIntegrationTest.scn.inject(injectStep).protocols(httpConf)
		//BenefitIntegrationTest.scn.inject(injectStep),
		//DepartmentTypeIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		//SpecialtyTypeIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		//ReasonIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		//OperationTypeIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		//SpecialtyIntegrationTest.scn.inject(injectStep).protocols(httpConf),
	).protocols(httpConf)
}
