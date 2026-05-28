package spring2021;

//b) (120 Points) First, let's implement the void offerNewCourse(int courseid) method. You may use your
//answer to part a (Utils.contains) as if it is correct. Do not worry about efficiency.

public class CourseCatalog {
    public int[] courses;

    public CourseCatalog() {
        courses = new int[0];
    }

    public void offerNewCourse(int courseid) {
        if (!Utils.contains(courses, courseid)) {
            int[] newArr = new int[courses.length + 1];
            for (int i = 0; i < courses.length; i += 1) {
                newArr[i] = courses[i];
            }
            newArr[courses.length] = courseid;
            courses = newArr;
        }
    }
}