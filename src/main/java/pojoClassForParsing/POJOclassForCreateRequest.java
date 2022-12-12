package pojoClassForParsing;

public class POJOclassForCreateRequest {
	
	String createdBy;
	String projectName;
	String status;
	Integer teamsize;
	
	public POJOclassForCreateRequest(String createdBy, String projectName, String status, Integer teamsize)
	{
		this.createdBy=createdBy;
		this.projectName=projectName;
		this.status=status;
		this.teamsize=teamsize;
	}
	public POJOclassForCreateRequest()
	{}
	
	public String getcreatedBy()
	{
		return createdBy;
	}
	public void setcreatedBy(String createdBy)
	{
		this.createdBy=createdBy;
	}
	public String getprojectName()
	{
		return projectName;
	}
	public void setprojectName(String projectName)
	{
		this.projectName=projectName;
	}
	public String getstatus()
	{
		return status;
	}
	public void setstatus(String status)
	{
		this.status=status;
	}

	public Integer getteamsize()
	{
		return teamsize;
	}
	public void setteamsize(Integer teamsize)
	{
		this.teamsize=teamsize;
	}
}
