package gl_department;


class SuperDepartment {
	public void today()
	{
		int ad = 0;
		if(ad==0) {
			System.out.println("Today is not a Holiday");
		}
		else {
			System.out.println("Today is a Holiday");
		}
	}

   public String departmentName() {
   return "Welcome to Super Department";

	}
   public String getTodaysWork() {
	   return "No Work as of now";

		}
   public String getWorkDeadline() {
	   return "Nil";
	   
   }
}
