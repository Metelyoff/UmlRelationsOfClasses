public class PastPosition{
	private String name;
	private Department department;// тип отношения бинарная ассоциация PastPosition --1к1----1к1--> Department
	public PastPosition(String position, Department dep){
		name = position;
		department = dep;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	public void setDepartment(Department d){
		department = d;
	}
	public Department getDepartment(){
		return department;
	}
}
