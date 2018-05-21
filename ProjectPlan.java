import java.util.ArrayList;
import java.util.List;


public class ProjectPlan {
	private String description = null;
	private int taskCtr = 0;
	private Object[] tasks;
	private List<Tasks> tList=new ArrayList<Tasks>();  
	
	
	public List<Tasks> gettList() {
		return tList;
	}
	public void settList(List<Tasks> tList) {
		this.tList = tList;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
//	public Collection getTasks() {
//		return tasks;
//	}
//	public void setTasks(Collection tasks) {
//		this.tasks = tasks;
//	}
	public int getTaskCtr() {
		return taskCtr;
	}
	public void setTaskCtr(int taskCtr) {
		this.taskCtr = taskCtr;
	}

	public Object[] getTasks() {
		return tasks;
	}
	public void setTasks(Object[] tasks) {
		this.tasks = tasks;
	}
	
	
	

}
