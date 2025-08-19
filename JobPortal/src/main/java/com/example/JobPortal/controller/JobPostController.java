package com.example.JobPortal.controller;

import com.example.JobPortal.model.JobPost;
import com.example.JobPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*") // allow all origins for frontend testing
@RequestMapping("/jobPosts")
public class JobPostController {

    @Autowired
    private JobService service;

    // Get all jobs (public)
    @GetMapping
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    // Get job by ID
    @GetMapping("/{postId}")
    public JobPost getJob(@PathVariable int postId) {
        return service.getJob(postId);
    }

    // Search by keyword
    @GetMapping("/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable String keyword) {
        return service.search(keyword);
    }

    // Add job (admin)
    @PostMapping()
    public JobPost addJob(@RequestBody JobPost jobPost) {
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    // Update job (admin)
    @PutMapping("/{postId}")
    public JobPost updateJob(@PathVariable int postId, @RequestBody JobPost jobPost) {
        jobPost.setPostId(postId); // ensure ID is set from path
        service.updateJob(jobPost);
        return service.getJob(postId);
    }

    // Delete job (admin)
    @DeleteMapping("/{postId}")
    public String deleteJob(@PathVariable int postId) {
        service.deleteJob(postId);
        return "Deleted";
    }

    // Load sample data (optional)
    @GetMapping("/load")
    public String loadData() {
        service.load();
        return "success";
    }
}
