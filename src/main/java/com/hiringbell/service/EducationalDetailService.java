package com.hiringbell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hiringbell.entity.EducationalDetail;
import com.hiringbell.repository.EducationalDetailRepository;

@Service
@Component
public class EducationalDetailService {
	
	@Autowired
	EducationalDetailRepository educationalDetailRepository;
	
	
	public String addEducationalDetailService(EducationalDetail ed) {
		var result = this.educationalDetailRepository.addEducationalDetailRepo(ed);
		return result;
	}
	
	public String updateEducationalDetailService(EducationalDetail ed, long educationalDetailId) {
		var result = this.educationalDetailRepository.updateEducationalDetailRepo(ed, educationalDetailId);
		return result;
	}

	public String getAllEducationalDetailService() {
		var result = this.educationalDetailRepository.getAllEducationalDetailRepo();
		return result;
	}
	
	public String getByIdEducationalDetailService(long educationalDetailId) {
		var result = this.educationalDetailRepository.getByIdEducationalDetailRepo(educationalDetailId);
		return result;
	}

	public String deleteByIdEducationalDetailService(long educationalDetailId) {
		var result = this.educationalDetailRepository.deleteByIdEducationalDetailRepo(educationalDetailId);
		return result;
		
	}
	
}
