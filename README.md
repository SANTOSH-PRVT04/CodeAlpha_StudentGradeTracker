# Student Grade Management (CodeAlpha Project 1)

This project is a console-based Java application that collects student names and scores, assigns grades, determines pass or fail status, and prints a formatted summary report.

## Project Overview

The program allows a user to:

1. Enter the number of students.
2. Enter each student's name and score.
3. Automatically calculate:
	- Letter grade (`A`, `B`, `C`, `D`)
	- Result (`Pass` or `Fail`)
4. Display a summary table for all students.
5. Show class-level statistics:
	- Highest score
	- Lowest score
	- Number of students in each grade category

The source code is located in [students_grade/grade.java](students_grade/grade.java).

## Features

- Interactive command-line input.
- Input validation for empty student names.
- Automatic grade assignment based on score ranges.
- Automatic pass/fail calculation.
- Formatted tabular report output.
- Grade distribution count (`A`, `B`, `C`, `D`).

## Grading Rules

Letter grades are assigned using the following score ranges:

- `A`: score >= 80
- `B`: score >= 60 and < 80
- `C`: score >= 30 and < 60
- `D`: score < 30

Result rules:

- `Pass`: score >= 30
- `Fail`: score < 30

## Tech Stack

- Language: Java
- Input Handling: `java.util.Scanner`
- Data Structure: `java.util.ArrayList`

## Project Structure

```
CodeAlpha_project1-/
├── README.md
└── students_grade/
	 └── grade.java
```

## How to Compile and Run

From the project root:

1. Go to the source folder:

```powershell
cd students_grade
```

2. Compile the Java file:

```powershell
javac grade.java
```

3. Run the program:

```powershell
java grade
```

## Example Input / Output

Example session:

```text
Enter number of students: 3

Student 1
Enter student name: Asha
Enter the score: 87

Student 2
Enter student name: Ravi
Enter the score: 62

Student 3
Enter student name: Mohan
Enter the score: 28

===== Student Summary Report =====
+------------+----------------------+----------+-------+--------+
| Student No | Name                 | Score    | Grade | Result |
+------------+----------------------+----------+-------+--------+
| 1          | Asha                 | 87.00    | A     | Pass   |
| 2          | Ravi                 | 62.00    | B     | Pass   |
| 3          | Mohan                | 28.00    | D     | Fail   |
+------------+----------------------+----------+-------+--------+

Highest Score: 87.0
Lowest Score: 28.0

Grade Count:
A: 1
B: 1
C: 0
D: 1
```

## Program Flow

1. Read number of students.
2. For each student:
	- Ask for a non-empty name.
	- Read score.
	- Compute grade and result.
	- Store student record.
3. If no data exists, print a message and exit.
4. Otherwise:
	- Compute highest and lowest score.
	- Count grades.
	- Print student table and summary statistics.

## Notes

- The class name is `grade` (lowercase), so run command is `java grade`.
- Ensure Java is installed and available in your system `PATH`.

## Future Improvements

- Validate score range (for example, enforce `0` to `100`).
- Handle non-numeric score input safely.
- Export report to a text or CSV file.
- Refactor class name to `Grade` to match Java naming conventions.
