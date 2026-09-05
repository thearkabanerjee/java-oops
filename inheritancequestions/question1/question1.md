Create a class Person with:

name
age
method displayPerson() that prints the name and age.

Create a class Student that extends Person and adds:

rollNo
method displayStudent() that prints the roll number.

Your main() should do:

Student s = new Student();

s.name = "Arka";
s.age = 20;
s.rollNo = 101;

s.displayPerson();
s.displayStudent();

Expected output:

Name: Arka
Age: 20
Roll No: 101