package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DestinationCandidateService {

	@Autowired
	DestinationCandidateRepository destinationCandidateRepository;

	public List<DestinationCandidate> findAll(){
		return destinationCandidateRepository.findAll();
	}
	public DestinationCandidate save(DestinationCandidate product){
        return destinationCandidateRepository.save(product);
    }

    public DestinationCandidate getOne(Integer id){
        return destinationCandidateRepository.getOne(id);
    }

    public void deleteOne(Integer id){
    	destinationCandidateRepository.deleteById(id);
    }


}
