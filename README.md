# 🎓 PDEU 3rd SEM CGPA Calculator

A Java Swing-based application that calculates your CGPA based on marks entered for each subject in **Semester 3 of PDEU** (Theory and Lab subjects). It supports grade conversion and CGPA computation according to a standard university scale.

## 📚 Subjects Included

### Theory:
- Discrete Mathematics
- Data Structures
- Object Oriented Programming with Java
- Digital Electronics and Computer Organization
- Microprocessor Programming and Interfacing
- Open Elective

### Lab:
- Data Structures Lab
- Java Lab
- DECO Lab
- Microprocessor Lab

## 📊 Grade Mapping

| Marks Range | Grade Point |
|-------------|-------------|
| 80+         | 10          |
| 70 - 79     | 9           |
| 60 - 69     | 8           |
| 55 - 59     | 7           |
| 50 - 54     | 6           |
| 45 - 49     | 5           |
| 40 - 44     | 4           |
| < 40        | 0           |

## 💡 Features

- Input Mid Sem, IA, and End Sem marks for theory subjects.
- Input File/Lab and Lab Exam marks for lab subjects.
- Automated calculation of grade points.
- CGPA computed based on subject-wise credit weighting.
- Error handling for invalid or incomplete entries.

## 🧮 Credit Weightage

| Subject                                  | Credits |
|------------------------------------------|---------|
| Discrete Mathematics                     | 4       |
| Data Structures                          | 3       |
| Java                                     | 3       |
| Digital Electronics and Computer Org.    | 3       |
| Microprocessor Programming & Interfacing | 2       |
| Open Elective                            | 3       |
| Each Lab (4 Labs)                        | 1 each  |

**Total Credits: 22**

## 🚀 How to Run

1. Ensure Java is installed (`java -version`)
2. Save the code as `Grade.java`
3. Compile and run:
   
   ```bash
   javac Grade.java
   java Grade
