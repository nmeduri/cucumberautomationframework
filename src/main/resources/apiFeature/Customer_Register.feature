Feature: API End to End Tests for Customer's Registration

Description: The purpose of these tests are to cover Usre's Registration.


Scenario: User is able to see Registration Form.
 Given  User hit Registration's API.
 When  User enter personal Details.
 Then User get th results.