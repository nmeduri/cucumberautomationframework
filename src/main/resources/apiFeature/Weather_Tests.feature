Feature: API End to End Tests for Weather's API

Description: The purpose of these tests are to cover Temprature of Weather.


Scenario: User is able to see weather's temprature accordinng to City.
 Given  Weather url is available.
 When  User hit the weather api.
 Then User get the results.
