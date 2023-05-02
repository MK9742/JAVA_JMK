package Day11.Ex0_4WildCard;

public class WildCardEx {
	
	// 수강생들이, 교육과정(Course)에 수강등록을 합니다.
	
	// 일반 과정
	public static void joincourse(Course<?> course) {
		System.out.println( "과정명: " + course.getName() );
		System.out.println( course.getStudents() );
	}
	
	// 학생 과정
	public static void joincourseStudent(Course<? extends Student> course) {
		System.out.println( "과정명: " + course.getName() );
		System.out.println( course.getStudents() );
	}
	
	
	// 직장인 과정
	public static void joincourseWorker(Course<? super Worker> course) {
		System.out.println( "과정명: " + course.getName() );
		System.out.println( course.getStudents() );
	}
	
	
	public static void main(String[] args) {
		// 일반과정, 정원 5명
		Course<Person> personCourse = new Course<>("일반과정", 5);
		personCourse.add( new Person("일반인") );
		personCourse.add( new Worker("직장인") );
		personCourse.add( new Student("학생") );
		personCourse.add( new HighStudent("고등학생") );
		personCourse.add( new MiddleStudent("중학생") );
		
		// 직장인과정, 정원 5명
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		workerCourse.add( new Worker("직장인") );
		// workerCourse.add( new Student("학생") );
		
		// 학생과정, 정원 5명
		Course<Student> studentCourse = new Course<>("학생과정", 5);
		studentCourse.add( new Student("학생") );
		studentCourse.add( new HighStudent("고등학생") );
		studentCourse.add( new MiddleStudent("중학생") );
		// studentCourse.add( new Worker("직장인" ));
		
		// 고등학생과정, 정원 3명
		Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 3);
		highStudentCourse.add( new HighStudent("고등학생") );
		
		
		// 일반과정에 수강등록
		joincourse( personCourse );
		joincourse( workerCourse );
		joincourse( studentCourse );
		joincourse( highStudentCourse );
		System.out.println();
		
		// 직장인과정에 수강등록
		joincourseWorker( personCourse );
		joincourseWorker( workerCourse );
		// joincourseWorker( studentCourse );
		// joincourseWorker( highStudentCourse );
		System.out.println();
		
		// 학생과정에 수강등록
		// joincourseStudent( personCourse );
		// joincourseStudent( workerCourse );
		joincourseStudent( studentCourse );
		joincourseStudent( highStudentCourse );
		System.out.println();
		
		
	}

}








































