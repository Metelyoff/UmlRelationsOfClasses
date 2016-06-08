import java.util.HashSet;
import java.util.Set;

// наследуем класс Man
	public  class Employee extends Man{ //тип отношения обобщение (наследование) ---> класса Man
		private String position;
		private IdCard iCard;// тип отношения бинарная ассоциация Emploee --1к1----1к1--> IdCard
		private Set<Room> room = new HashSet<Room>();// N-арная ассоциация Employee --1к1----1..*--> Room
		private Department department;// тип отношения Агрегация Employee --0..*----1..1--<>Department
		private Set<PastPosition> pastPosition = new HashSet<PastPosition>();// тип отношения Композиция Employee<+>--1..1----0..*--PastPosition
		// создаем и конструктор
		public  Employee(String cName, String cSurname, String cPosition){
			name = cName;
			surname = cSurname;
			position = cPosition;
		}
		public void setPosition(String newPosition){				
				// сначала должность заносим в список прежних должностей
				PastPosition pastPosition = new PastPosition(this.getPosition(), this.getDepartment());				
				this.setPastPosition(pastPosition);
				// меняем должность
				position = newPosition;
		}
		public String getPosition(){
				return position;
		}
		public void setIdCard(IdCard c){
			iCard = c;
		}
		public IdCard getIdCard(){
			return iCard;
		}
		public void setRoom(Room newRoom){
			room.add(newRoom);
		}
		public Set<Room>  getRoom(){
			return room;
		}
		
		public void  deleteRoom(Room r){
			room.remove(r);
		}
		
		public void setDepartment(Department d){
			department = d;
		}
		
		public Department getDepartment(){
			return department;
		}
		
		public void setPastPosition(PastPosition p){
			pastPosition.add(p);
		}
		
		public Set<PastPosition>  getPastPosition(){
			return pastPosition;
		}
		
		public void deletePastPosition(PastPosition p){
			pastPosition.remove(p);
		}
	}
