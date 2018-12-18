# NeSI-S - NeSI Scheduler

![Build Status](https://travis-ci.org/alex-bretet/cloudstreetmarket.com.svg?branch=master)
![License](http://img.shields.io/:license-gpl3-blue.svg)

This project is the application developed for NeSI [New Zealand eScience Infrastructure](https://www.nesi.org.nz/)

The latest Release of the application is running at: [projects.nesi.org.nz]

Read more in the [WIKI](https://nznesi.atlassian.net/wiki/x/JQBzFg) 
Release note in the [Releases](	https://nznesi.atlassian.net/wiki/x/NICdHg) page.

## Quickstart

1. You must have a %JAVA_HOME% environment variable pointing to the root directory of a JDK8.
2. From the command line do:

  ```
  git clone https://github.com/nesi/nesi-scheduler.git
  cd nesi-scheduler
  mvn clean install
  mvn spring-boot:run
  ```

3. Copy-paste the entire [app](https://github.com/nesi/nesi-scheduler) directory to your ${user.home}
4. Deploy the WARs in Tomcat
   After a mvn clean install build, copy the war to /webapps directory of your tomcat. 

## IDE setup

For the usage inside an IDE do the following:

1. Make sure you have an Eclipse with m2e installed.
2. Import the checked out code through *File > Import > Existing Maven Project…*

## Project description

The project uses:

- [Spring Boot](https://github.com/spring-projects/spring-boot) - 2.1.1.RELEASE
