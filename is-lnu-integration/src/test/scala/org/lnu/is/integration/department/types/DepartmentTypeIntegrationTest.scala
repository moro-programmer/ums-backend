package org.lnu.is.integration.department.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef.stringToExpression
import io.gatling.core.json.Jackson
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http

object DepartmentTypeIntegrationTest {

  val feed = jsonFile("data/department/type/json_data.json").circular
  
  val scn = scenario("Department Type Simple GET Scenario")
    .feed(feed)
    .exec(http("Department Type Get Paged Result")
      .get("${targetUrl}")
      .check(bodyString.transform(string => string).is("${expectedResponse}"))
    )
}