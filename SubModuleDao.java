package com.hrms.repository;

import java.util.List;


import com.hrms.model.SubModule;

public interface SubModuleDao
{
	List<SubModule> getAllSubModules();
	public void addSubModule(SubModule subModule);
	public void updateSubModule(SubModule subModule);
	SubModule findSubModuleById(String id);
	void update(SubModule subModule);
	void delete(SubModule subModule);
	
	
}
