package gl_department;

public class Main {

	public static void main(String[] args)
	{
		SuperDepartment obj1 = new AdminDepartment();
		SuperDepartment obj2 = new HRDepartment();
		SuperDepartment obj3 = new TechDepartment();
		HRDepartment obj = new HRDepartment();
		TechDepartment objj = new TechDepartment();
		SuperDepartment day = new AdminDepartment();
		SuperDepartment day1 = new HRDepartment();
		SuperDepartment day2 = new TechDepartment();
		System.out.println(obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		day.today();
		System.out.println(obj2.departmentName());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj.doActivity());
		day1.today();
		System.out.println(obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(objj.getTechStackInformation());
		day2.today();
	}
}
