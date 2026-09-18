# 🏥 Hospital Management System

## 1. Project Title

**Hospital Management System**

## 2. Overview

The Hospital Management System is a **Java-based application** developed to manage basic hospital activities. It helps maintain patient and doctor information, book appointments, and search patient records.

The project is designed using **Core Java and Object-Oriented Programming (OOP)** concepts and provides a simple menu-driven interface.

## 3. Objectives

* To maintain patient records efficiently.
* To manage doctor information.
* To book and manage appointments.
* To search patient information quickly.
* To reduce manual record management.
* To demonstrate practical use of Java programming concepts.

## 4. Features

### Patient Management

* Add new patients.
* Store patient ID, name, age, gender, and disease.
* View all registered patients.
* Search patients using Patient ID.

### Doctor Management

* Add doctors.
* Store Doctor ID, name, and specialization.
* View all registered doctors.

### Appointment Management

* Book appointments between patients and doctors.
* Store appointment date.
* View all booked appointments.
* Validate patient and doctor IDs before booking.

### User Interface

* Simple console-based menu.
* Easy-to-use options.
* Clear messages for successful and invalid operations.

## 5. Technologies/Tools Used

| Technology/Tool | Purpose                   |
| --------------- | ------------------------- |
| Java            | Main programming language |
| VS Code         | Development environment   |
| JDK             | Compilation and execution |
| ArrayList       | Store records             |
| Scanner         | User input                |
| OOP             | Program structure         |

## 6. Java Concepts Used

The project demonstrates the following Core Java concepts:

* Classes and Objects
* Encapsulation
* Constructors
* Methods
* Inheritance concepts
* ArrayList
* Loops
* Conditional statements
* Switch statements
* Exception handling
* User input using Scanner

## 7. Project Structure

```text
HospitalManagementSystem/
│
└── HospitalManagementSystem.java
```

The Java file contains:

```text
Patient
Doctor
Appointment
HospitalManagementSystem
```

## 8. Installation Requirements

Before running the project, make sure you have:

* Java JDK installed.
* VS Code installed.
* Java Extension Pack installed in VS Code.
* A computer with Windows/Linux/macOS.

Check Java installation using:

```bash
java --version
```

Check the Java compiler using:

```bash
javac --version
```

## 9. Steps to Install & Run

### Step 1: Download/Clone the Project

Download the project files and open the project folder in VS Code.

### Step 2: Open the Java File

Open:

```text
HospitalManagementSystem.java
```

### Step 3: Compile

Open the VS Code terminal and run:

```bash
javac HospitalManagementSystem.java
```

### Step 4: Run

Run the following command:

```bash
java HospitalManagementSystem
```

### Step 5: Use the Menu

The application will display:

```text
======================================
       HOSPITAL MANAGEMENT SYSTEM
======================================
1. Add Patient
2. Add Doctor
3. View Patients
4. View Doctors
5. Book Appointment
6. View Appointments
7. Search Patient
8. Exit
======================================
```

Enter the required option and follow the instructions.

## 10. Instructions for Testing

The following test cases can be used to verify the application.

### Test Case 1: Add Patient

Select:

```text
1. Add Patient
```

Enter valid patient details.

Expected result:

```text
Patient added successfully!
```

### Test Case 2: Add Doctor

Select:

```text
2. Add Doctor
```

Enter valid doctor details.

Expected result:

```text
Doctor added successfully!
```

### Test Case 3: View Patients

Select:

```text
3. View Patients
```

The system should display all registered patients.

### Test Case 4: View Doctors

Select:

```text
4. View Doctors
```

The system should display all registered doctors.

### Test Case 5: Book Appointment

Select:

```text
5. Book Appointment
```

Enter an existing Patient ID and Doctor ID.

Expected result:

```text
Appointment booked successfully!
```

### Test Case 6: Search Patient

Select:

```text
7. Search Patient
```

Enter a valid Patient ID.

Expected result:

```text
Patient Found!
```

For an invalid ID:

```text
Patient not found!
```

## 11. Sample Input

```text
Patient ID: 101
Name: Kulvinder
Age: 19
Gender: Male
Disease: Fever
```

Doctor:

```text
Doctor ID: 201
Name: Dr. Sharma
Specialization: Cardiologist
```

Appointment:

```text
Patient ID: 101
Doctor ID: 201
Date: 20-09-2026
```

## 12. Sample Output

```text
Patient added successfully!

Doctor added successfully!

Appointment booked successfully!
```

## 13. Limitations

* The current version is console-based.
* Data is stored temporarily using ArrayList.
* Data may be lost when the program is closed.
* No online database is connected.
* It does not provide online appointment booking.

## 14. Future Enhancements

The project can be improved by adding:

* Java Swing/JavaFX GUI.
* File-based permanent data storage.
* User login and authentication.
* Patient billing system.
* Medicine management.
* Room management.
* Appointment cancellation.
* Doctor availability.
* Admin dashboard.
* Report generation.

## 15. Conclusion

The Hospital Management System provides a simple way to manage basic hospital records using Java. The project demonstrates practical implementation of **Core Java, OOP, collections, user input, and menu-driven programming**.

## 17. Author

**Name:** Kulvinder Krishan Jhorar
**Course:** B.Tech Artificial Intelligence & Machine Learning
**Year:** 2nd Year
