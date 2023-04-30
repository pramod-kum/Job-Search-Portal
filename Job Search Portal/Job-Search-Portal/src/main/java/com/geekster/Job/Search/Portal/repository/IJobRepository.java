package com.geekster.Job.Search.Portal.repository;

import com.geekster.Job.Search.Portal.model.EnumJobType;
import com.geekster.Job.Search.Portal.model.Job;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;

@Repository
public interface IJobRepository extends CrudRepository <Job , Integer> {

    //Update :
    @Modifying
    @Query(value = "update job set id = :id , title = :title , description = :description , location = :location , salary = :salary , company_Name = :companyName , employer_Name = :employerName , job_Type = :jobType , applied_Date = :appliedDate where id = :id" , nativeQuery = true)
     void updateOldeJobDetails(Long id, String title, String description, String location, Double salary, String companyName, String employerName, String jobType, LocalDate appliedDate);

    //Delete :
    @Modifying
    @Query(value = "delete from job where ID = :id" , nativeQuery = true)
    public void deleteJobNow(Integer id);

    //Find by title :
    public ArrayList<Job> findByTitle(String title);

    //Find by title :
    public ArrayList<Job> findByDescription(String description);

//    Custom Finder
//    Use custom Query

//    crud operations using inbuilt @CrudRepo methods,
//    custom get methods using your own custom finders (No implementations, correct queries should be fired based on method names)
//    write operations (update and delete) using Custom queries (using @Query)

//    search api on job   and use field  like title , description

}
