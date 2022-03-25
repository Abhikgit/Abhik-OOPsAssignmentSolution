package gl_department;

class HRDepartment extends AdminDepartment {
	
	 public String departmentName() {
		   return "Welcome to HR Department";

			}
		   public String getTodaysWork() {
			   return "Fill today's worksheet and mark your attendance";

				}
		   public String getWorkDeadline() {
			   return "Complete by EOD";
			   
		   }
		   public String doActivity() {
			   return "team Lunch";
		   }
}