package com.example.demo.Controller;

import com.example.demo.Entity.Sample;
import com.example.demo.Service.SampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SampleController {
    @Autowired
    SampleServiceImpl sampleService;

    @GetMapping("/sample/all")
    public List<Sample> getallsample(){
        return sampleService.getallsamples();

    }

    @PostMapping("/sample")
    public Sample savesample(@RequestBody Sample sample){
        return sampleService.savesample(sample);
    }

    @PutMapping("/sample/{id}")
    public ResponseEntity<Sample> updatesample(@RequestBody Sample sample, @PathVariable("id") Long id){
        return new ResponseEntity<>(sampleService.updatesample(sample,id), HttpStatus.OK);
    }

    @DeleteMapping("/sample/{id}")
    public String deletesample(@PathVariable("id") Long id){
        return sampleService.deletesample(id);
    }
}
