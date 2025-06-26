package com.chan.SpringRESTJOB.Controller;

import com.chan.SpringRESTJOB.Model.JobPost;
import com.chan.SpringRESTJOB.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://localhost:3000/" ) // to resolve the issue react and spring
public class JobController {

    @Autowired
    public JobService service;



    @GetMapping("jobposts")
    @ResponseBody
    public List<JobPost> getAllJobPost(){

        return service.getAllJobs();
    }
    // get Mapping

    @GetMapping("jobPost/{postId}")
    public  JobPost getjob(@PathVariable("postId")int postId){

        return service.getjob(postId);
    }

    // post mapping
    @PostMapping("jobposts")
    public void addjob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
    }

    // put mapping
    @PutMapping("jobPost")
    public JobPost updating(@RequestBody JobPost jobPost){
        service.updatejob(jobPost);
        return service.getjob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public void delete(@PathVariable("postId")int postId){
        System.out.println("Deleted sucessfully");
        service.deletejob(postId);
    }



    @PostMapping("load")
    public void loadJob()
    {
        System.out.println("success");
         service.loadJob();
    }
}
