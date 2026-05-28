package spring2021;

//1. Cal Central.
//a) (30 points). Let's start with a short helper method that will be useful in later questions. Fill in public
//static boolean contains(int[] a, int x) so it returns true if and only if the integer array a contains the
//integer x. Your solution may use at most 9 lines. (Clarification: you can assume a will never be null.)
//public class Utils {
//    public static boolean contains(int[] a, int x) {
//
//    }
//}
//For the remainder of this problem we'll be trying to complete the CalStudent and CourseCatalog classes
//given below. Quick note: You might observe that these classes are poorly designed (public instance
//variables and a bad choice of data structure). We'll address this in part d of this problem.
//public class CourseCatalog {
//    public int[] courses;
//    public CourseCatalog() {
//        courses = new int[0];
//    }
//
//    public void offerNewCourse(int courseid) {
//        /* ... */
//    }
//}
//public class CalStudent {
//    public String name;
//    public int[] courses;
//    public int numOfCourses;
//    public CalStudent(String name) {
//        this.name = name;
//        this.courses = new int[4];
//        numOfCourses = 0;
//    }
//    public void addCourse(int courseid, CourseCatlog cc) {
//        /* ... */
//    }
//}


//
//The behavior we are interested in is as follows:
//• Courses at Cal are referred to by their integer courseid.
//• To add a course for CalStudent x , we call the x.addCourse(int courseid, CourseCatalog
//cc) method. If the course obeys the three restrictions below, the course is added to the first
//available spot in x's length 4 courses array. If it does not obey the restrictions, nothing happens.
//1. Students may only take courses that are available in the course catalog.
//2. Students may only be in at most 4 courses at the same time.
//3. Students cannot add the same class more than once.
//• To offer a new course to a CourseCatalog called cc, we call the cc.offerNewCourse(int
//courseid) method. If the course is not already in the catalog, it is added. If it is already in the
//catalog, nothing happens.
//Here is an example usage of these classes:
//CourseCatalog cc = new CourseCatalog(); -> initially empty
//CalStudent omar = new CalStudent();
//omar.addCourse(22076, cc); // nothing added, invalid course
//cc.offerNewCourse(22076); // 22076 added to course catalog
//cc.offerNewCourse(22076); // nothing added, 22076 already exists
//cc.offerNewCourse(24890); // 24890 added to course catalog
//omar.addCourse(22076, cc); // omar.courses: [22076, 0, 0, 0]
//omar.addCourse(22076, cc); // omar.courses: [22076, 0, 0, 0] (no change)
//omar.addCourse(24890, cc); // omar.courses: [22076, 24890, 0, 0]
//cc.offerNewCourse(22078); // 22078 added to course catalog
//cc.offerNewCourse(33150); // 33150 added to course catalog
//cc.offerNewCourse(28108); // 28108 added to course catalog
//omar.addCourse(22078, cc); // omar.courses: [22076, 24890, 22078, 0]
//omar.addCourse(33150, cc); // omar.courses: [22076, 24890, 22078, 33150]
//omar.addCourse(28108, cc); // [22076, 24890, 22078, 33150] (no change)
