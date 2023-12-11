public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        private static int nextStudentId = 1;
        private String name;
        private int studentId;
        private int numberOfCredits;
        private double gpa;

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        public Student(String name, int studentId) {
                this(name, studentId, 0, 0);
        }

        public Student(String name) {
                this(name, nextStudentId);
                nextStudentId++;
        }
// fbdfdnfgm
        public String studentInfo() {
                return (this.name + " has a GPA of: " + this.gpa);
        }

        public String getName() { return this.name; }
        public void setName(String name) { this.name = name;}
        public int getStudentId() { return this.studentId; }
        private void setStudentId(int studentId) { this.studentId = studentId; };
        public  int getNumberOfCredits() { return this.numberOfCredits; }
        public void setNumberOfCredits(int numberOfCredits) { this.numberOfCredits = numberOfCredits; }
        public double getGpa() {return this.gpa; }
        public void setGpa(double gpa) { this.gpa = gpa; }
}
