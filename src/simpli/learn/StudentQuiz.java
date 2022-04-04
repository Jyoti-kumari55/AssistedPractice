package simpli.learn;




	class Student{
		int regi_id;
		String Studentname;
		
		public Student(int id,String name) {
			this.regi_id = id;
			this.Studentname = name;
			// TODO Auto-generated constructor stub
		}
		
	}

	public class StudentQuiz {
		public static void main(String agrs[]) {
			Student arr[];
			arr = new Student[5];
			arr[0] = new Student(12345, "Jyoti");
			arr[1] = new Student(12445, "Amit");
			arr[2] = new Student(12348, "Sumit");
			arr[3] = new Student(12347, "Praveen");
			arr[4] = new Student(15675, "Advika");
			
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			for(int i = 0; i < arr.length; i++) {
		
			System.out.println("Student with registration id" + arr[i].regi_id +" is: "+arr[i].Studentname);
			
			}
		}
	}


