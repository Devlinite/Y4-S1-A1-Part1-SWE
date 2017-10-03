package assignment1;

import org.joda.time.LocalDate;

public class CourseProgramme {
	private String name;
	private Module[] moduleList;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public CourseProgramme(String name, Module[] moduleList) {
		this.name = name;
		this.moduleList = moduleList;
		this.startDate = new LocalDate(2017, 9, 1);
		this.endDate = new LocalDate(2018, 5, 13);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Module[] getModuleList() {
		return moduleList;
	}
	
	public void setModuleList(Module[] moduleList) {
		this.moduleList = moduleList;
	}
	
	public String getStartDate() {
		return startDate.toString();
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public String getEndDate() {
		return endDate.toString();
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
}
