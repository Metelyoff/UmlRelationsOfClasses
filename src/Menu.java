public  class Menu{
	private int i=0;
	public  void showEmployees(Employee[] employees){// тип отношения Зависимость Menu---use--->Employee
		System.out.println("Список сотрудников:");
		for (i=0; i<employees.length; i++){
			if(employees[i] instanceof Employee){
				System.out.println(employees[i].getName() +" - " + employees[i].getPosition());
			}
		}
	}
}
