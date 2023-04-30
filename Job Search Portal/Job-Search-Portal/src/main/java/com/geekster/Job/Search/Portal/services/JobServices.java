package com.geekster.Job.Search.Portal.services;

import com.geekster.Job.Search.Portal.model.Job;
import com.geekster.Job.Search.Portal.repository.IJobRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JobServices {
    @Autowired
    IJobRepository jobRepository;

    public String postJob(ArrayList<Job> jobList) {
        Iterable<Job> saveStatus = jobRepository.saveAll(jobList);
        if(saveStatus != null){
            return "Job Added Succesfully!!";
        }else{
            return "Job Not Add Error!!";
        }
    }
    @Transactional
    public void updateOldJob(Job newJob) {
        String myJobType = newJob.getJobType().name();
        jobRepository.updateOldeJobDetails(newJob.getId(),newJob.getTitle(),newJob.getDescription(),newJob.getLocation(),newJob.getSalary(),newJob.getCompanyName(),newJob.getEmployerName(),myJobType,newJob.getAppliedDate());
    }
    @Transactional
    public void deleteJobById(Integer id) {
        jobRepository.deleteJobNow(id);
    }

    public ArrayList<Job> serchJobByTitle(String title) {
        return jobRepository.findByTitle(title);
    }

    public ArrayList<Job> serchJobByDescription(String description) {
        return jobRepository.findByDescription(description);
    }
}
