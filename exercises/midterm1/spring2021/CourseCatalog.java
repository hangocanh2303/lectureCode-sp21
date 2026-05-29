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

//    d) (30 Points) The design of the classes above is poor. One issue is that the classes expose their instance
//    variables as public. Instead, access to these variables should be private and the classes should provide
//    methods that do semantically useful tasks, e.g. the CourseCatalog might have a boolean
//    courseNumberExists(int i) method.
//    Another significant issue is the poor choice of data structure, specifically int[] in both classes. The
//    resulting code is awkward and overly verbose. As we said in the first lecture "Good programmers care
//    about the data structures [in their code]." One better choice of data structure would have been a List.
//    Give one reason why a List is better.
//    List Advantage: courses operation simple, save full course instance list in Course catalog and CalStudent, courses size in List, don't need to track
//    Note that later in 61B, we will learn about the Set, which is an even better data structure for this task
//    than a List
}