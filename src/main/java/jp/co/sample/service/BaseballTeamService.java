package jp.co.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.sample.domain.BaseballTeam;
import jp.co.sample.repository.BaseballTeamRepository;

@Service
public class BaseballTeamService {
	@Autowired
	private BaseballTeamRepository repository;
	
	public BaseballTeam load(Integer id) {
		return repository.load(id);
	}
	public List<BaseballTeam>findAll(){
		return repository.findAll();
	}
}
