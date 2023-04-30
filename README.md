<center>
<h1> 🏚️JOB SEARCH PORTALL</h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>
This project is a Job Search Portal built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The Job data model is defined in the Job class with validation anotation, which has the following attributes:

   id : Job ID <br>
   title : Job title <br>
   description : Job description <br>
   location : Job location <br>
   salary : Job Salary <br>
   companyName : Job Company <br>
   employerName : Job Employee Name <br>
   jobType : Job Type <br>
   appliedDate : Job Date <br>


---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-
</br>
<b> Add Job </b>

* PostMapping: /addJob

This endpoint makes a call to method in jobService class which is connected to database. In database we add a new user given through API.


* GetMapping: /"findJobByTitle/{title}"

This endpoint returns data of specific jov title based on userid through API


* GetMapping: "findJobByDescription/{description}"

This endpoint returns data of specific job description based on userid through API


* PutMapping: "/updateJob"

This endpoint makes a call to method in JobService class which is connected to database. In database we update a job through API.


* DeleteMapping: "/deleteJob/{id}"

This endpoint makes a call to method in JobService class which is connected to database. In database we delete a Job through API.


---

## CrudRepository extends by IJobRepository interface.


We have used CrudRepository as a database to implement CRUD Operations.

---

## 📝Project Summary

In this job search portal project, I have used CrudRepositoryThru all Maping i.e. @PutMapping , @GateMapping , @DeleteMapping all for for search and update , delete.  In this project user can search job through description and title and we can also update the job.  We can also delete the job.  All logic is written in this project.  You can easily use everything.

![Alt text](https://media.tenor.com/Ra5kgH_k8yMAAAAj/thank-you-thank-you-heart.gif)
