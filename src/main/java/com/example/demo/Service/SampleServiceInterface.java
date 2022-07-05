package com.example.demo.Service;

import com.example.demo.Entity.Sample;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SampleServiceInterface {

    Sample savesample(Sample sample);

    List<Sample> getallsamples();

    Sample updatesample(Sample sample, Long id);

    String deletesample(Long id);
}
