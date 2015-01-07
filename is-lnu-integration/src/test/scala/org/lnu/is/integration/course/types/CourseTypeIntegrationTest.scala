package org.lnu.is.integration.course.types

import io.gatling.core.Predef.checkBuilder2Check
import io.gatling.core.Predef.findCheckBuilder2ValidatorCheckBuilder
import io.gatling.core.Predef.jsonFile
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.bodyString
import io.gatling.http.Predef.http
import io.gatling.http.request.RawFileBody


object CourseTypeIntegrationTest {
  
  val response = RawFileBody("data/course/type/response.json")

  val scn = scenario("Course Type Scenario")
    .exec(http("Course Types Get Paged Result")
      .get("/courses/types")
      .check(bodyString.is(response))
    )

}