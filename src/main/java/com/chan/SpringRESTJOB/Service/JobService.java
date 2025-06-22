package com.chan.SpringRESTJOB.Service;
import com.chan.SpringRESTJOB.Model.JobPost;
import com.chan.SpringRESTJOB.Repository.jobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private jobRepo job;

    public void  addJob(JobPost JOB){

        job.addjob(JOB);
    }

    public List<JobPost> getAllJobs(){

        return job.getAllJob();
    }

    public JobPost getjob(int postId) {
        return job.getjob(postId);

    }

    public void updatejob(JobPost jobPost) {
         job.updatejob(jobPost);

    }

    public void deletejob(int postId) {
        job.deletejob(postId);
    }
}
