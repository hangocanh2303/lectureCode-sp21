# 3 Shuffled Exams
For this problem, we will be working with Exam and Student objects, both of which
have only one attribute: sid, which is a number like any student ID.
PrairieLearn thought it was ready for the final. It had meticulously created two
arrays, one of Exams and the other of Students, and ordered both on sid such that
the ith Exam in the Exams array has the same sid as the ith Student in the Students
array. Note the arrays are not necessarily sorted by sid. However, PrairieLearn
crashed, and the Students array was shuffled, but the Exams array somehow remained untouched.
Time is precious, so you must design a O(N) time algorithm to reorder the Students
array appropriately without changing the Exams array!
Hint: Begin by reordering both the Students and Exams arrays such that ith Exam
in the Exams array has the same sid as the ith Student in the Students array.

# Answer: 
arrExams
arrStudents  

A naive approach is to iterate through the `Exams` array, search for the `Student` with 
the matching `sid` in the `Students` array, and place it in the corresponding position using an auxiliary array.

Create `ExamWrapper`s storing each `Exam` and its original index, radix sort both the `ExamWrapper`s and `Students` by `sid`, 
then use each `ExamWrapper`’s index to place the corresponding `Student` in the correct position.

