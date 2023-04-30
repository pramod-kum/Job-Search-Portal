package com.geekster.Job.Search.Portal.controller;

import com.geekster.Job.Search.Portal.model.Job;
import com.geekster.Job.Search.Portal.services.JobServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class JobController {
    @Autowired
    JobServices jobServices;
    //AddJob :post
    @PostMapping("/addJob")
    public String AddJob(@Valid @RequestBody ArrayList<Job> jobList){
        return jobServices.postJob(jobList);
    }
    //Update job :Put
    @PutMapping("/updateJob")
    public void UpdateJob(@RequestBody Job newJob){
         jobServices.updateOldJob(newJob);
    }
    //Delete Job :Delete
    @DeleteMapping("/deleteJob/{id}")
    public void DeleteJob(@PathVariable Integer id){
        jobServices.deleteJobById(id);
    }

    // Get by title :Get
    @GetMapping("/findJobByTitle/{title}")
    public ArrayList<Job> FindJob(@PathVariable String title){
        return jobServices.serchJobByTitle(title);
    }
    // Get by description :Get
    @GetMapping("/findJobByDescription/{description}")
    public ArrayList<Job> FindJobByDescription(@PathVariable String description){
        return jobServices.serchJobByDescription(description);
    }

}
