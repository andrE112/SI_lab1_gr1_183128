class Student {
	String index;
	String firstName;
	String lastName;
	ArrayList<Integer> labPoints = new ArrayList<Integer>();

	//TODO constructor

	public Student(String index, String firstName, String lastName, ArrayList<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}

	//TODO seters & getters

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ArrayList<Integer> getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(ArrayList<Integer> labPoints) {
		this.labPoints = labPoints;
	}

	public double getAverage() {
		//TODO
		points = getLabPoints();
		int zbir=0,broj_labs=0;
		for(Integer i: points){
			zbir+=i;
			broj_labs++;
		}
		return zbir/broj_labs;

	}

	public boolean hasSignature() {
		//TODO
		points = getLabPoints();
		int zbir=0;
		for(Integer i: points){
			zbir+=i;
		}
		if (zbir>8){
			return true;
		}
		else{
			return false;
		}
	}
}
class Course{
	List<Student> students;

	public Course(List<Student> students) {
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int brojPotpisi(){
		students = getStudents();
		int counter=0;
		for(Student i: students){
			if(i.hasSignature()==true){
				counter++;
			}
		}
		return counter;
	}
	public void add(Student nov){
		students=getStudents();
		students.add(nov);
	}
	public void remove(Student nov){
		students=getStudents();
		students.remove(nov);
	}
}
