package com.chan.SpringRESTJOB.Repository;

import com.chan.SpringRESTJOB.Model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Repository
public interface jobRepo extends JpaRepository <JobPost,Integer>{


}
//    public List<JobPost> getAllJob(){
//
//        return  jobs;
//    }
//    public void addjob(JobPost job){
//        jobs.add(job);
//        System.out.println(jobs);
//    }
//
//    public JobPost getjob(int postId) {
//        for (JobPost job:jobs){
//                if(job.getPostId()==postId){
//                    return job;
//                }
//     }
//        return  null;
//    }
//
//    public void updatejob(JobPost jobPost) {
//        for(JobPost job:jobs){
//            if(job.getPostId()==jobPost.getPostId()){
//                job.setPostDesc(jobPost.getPostDesc());
//                job.setPostProfile(jobPost.getPostProfile());
//                job.setReqExperience(jobPost.getReqExperience());
//                job.setPostTechStack(jobPost.getPostTechStack());
//            }
//        }
//
//    }
//
//    public void deletejob(int postId) {
//        for(JobPost job:jobs){
//            if(job.getPostId()==postId){
//                jobs.remove(job);
//            }
//        }
//    }
//}
