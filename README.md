### Student Management System

This project is a simple implementation of a Student Management System in Java. It allows you to add, retrieve, and remove students from a collection.

### Features:

- Add new students with unique IDs
- Retrieve student information by ID
- Remove students by ID
- Display all students currently in the system

### Implementation Details:

- **Student Class**: Represents a student entity with properties such as ID, name, age, and course. Provides getter methods for accessing these properties.
- **StudentManagementSystem Class**: Manages a collection of students using a HashMap. It provides methods to add, retrieve, and remove students, as well as display all students.
- **Main Class**: Contains the main method where an instance of the StudentManagementSystem is created. It demonstrates adding, retrieving, and removing students, as well as displaying all students.

### Usage:

1. Compile the Java files: `javac Main.java`
2. Run the compiled class: `java Main`

### Example:

```
Student{id=1, name='John Doe', age=20, course='Computer Science'}
Student{id=2, name='Jane Smith', age=21, course='Mathematics'}
Student{id=3, name='Alice Johnson', age=19, course='Physics'}

Retrieving student with ID 2:
Student{id=2, name='Jane Smith', age=21, course='Mathematics'}

Students after removal:
Student{id=2, name='Jane Smith', age=21, course='Mathematics'}
Student{id=3, name='Alice Johnson', age=19, course='Physics'}

```

### Dependencies:

- None

### Contributors:

- Jeel patel
