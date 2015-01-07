package org.lnu.is.integration.eduformtypes

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody

object EduFormTypeIntegrationTest {

  val response = RawFileBody("data/eduformtypes/response.json")

  val scn = scenario("Edu Form Type Scenario")
    .exec(http("Edu Form Types Get Paged Result")
      .get("/eduformtypes")
      .check(bodyString.is(response))
    )

}
