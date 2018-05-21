
public class Tasks{
	private double duration;
	private String taskDescription = null;
	private int prioritization;
	private String startDate = null;
	private String EndDate = null;
	
	public Tasks(){
	}

	public Tasks(String taskDescription, double duration, int prioritization,
			String startDate, String EndDate){
		this.duration = duration;
		this.taskDescription = taskDescription;
		this.prioritization = prioritization;
		this.startDate = startDate;
		this.EndDate = EndDate;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public int getPrioritization() {
		return prioritization;
	}

	public void setPrioritization(int prioritization) {
		this.prioritization = prioritization;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	
	
}