package spring2021;

public class CalStudent {
    public String name;
    public int[] courses;
    public int numOfCourses;

    public CalStudent(String name) {
        this.name = name;
        this.courses = new int[4];
        numOfCourses = 0;
    }

    public void addCourse(int courseid, CourseCatalog cc) {
        if (Utils.contains(cc.courses, courseid) && !Utils.contains(courses, courseid) && numOfCourses < 4) {
            courses[numOfCourses] = courseid;
            numOfCourses += 1;
        }
    }
}
