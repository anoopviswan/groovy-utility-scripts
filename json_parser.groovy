// Script to parse and process json data
import groovy.json.JsonSlurper

String apiString = "http://dummy.restapiexample.com/api/v1/employees"
URL apiUrl = new URL(apiString)

Map parsedJson = new JsonSlurper().parseText(apiUrl.text)

for (item in parsedJson.data){
    println item.employee_name + " : " + item.employee_age
}