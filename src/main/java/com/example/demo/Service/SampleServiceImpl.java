package com.example.demo.Service;

import com.example.demo.Dao.SampleRepository;
import com.example.demo.Entity.Sample;
import com.example.demo.Exceptions.SampleNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleServiceImpl implements SampleServiceInterface {


    @Autowired
    SampleRepository sampleRepository;

    @Override
    public Sample savesample(Sample sample) {
        return sampleRepository.save(sample);
    }

    @Override
    public List<Sample> getallsamples() {
        return sampleRepository.findAll();
    }

    @Override
    public Sample updatesample(Sample sample, Long id) {
        if(sampleRepository.findById(id).isPresent()){
            return sampleRepository.save(sample);
        }
        else {
            throw new SampleNotFound("Sample not found",id,"text");
        }
    }
    @Override
    public String deletesample(Long id) {
         if(sampleRepository.findById(id).isPresent()){
             sampleRepository.deleteById(id);
             return "deleted successfully";
         }
         else return "sample not found";
    }
}
