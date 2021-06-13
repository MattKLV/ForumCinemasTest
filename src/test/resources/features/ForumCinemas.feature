@SmokeTest
  Feature: Webpage forumcinemas.lv login and change profile settings test

    Scenario: Changes to profile information validation
      Given Open Chrome
      And Open ForumCinemas Homepage
      And Press Login
      And Enter Username
      And Enter Password
      And Enter Profile
      When Open Profile Tab
      Then Click On Change Profile Information
      And Change Name
      And Last Name
      And Date
      And Month
      And Year
      And Save Changes
      And Close Chrome