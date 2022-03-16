package com.example.android.myapplication;

public class Student {

   private String studentName;
   private int studentAge;
   private int StudentGrade;
   private int studentImg;

   public String getStudentName() {
      return studentName;
   }

   public void setStudentName(String studentName) {
      this.studentName = studentName;
   }

   public int getStudentAge() {
      return studentAge;
   }

   public void setStudentAge(int studentAge) {
      this.studentAge = studentAge;
   }

   public int getStudentGrade() {
      return StudentGrade;
   }

   public void setStudentGrade(int studentGrade) {
      StudentGrade = studentGrade;
   }

   public int getStudentImg() {
      return studentImg;
   }

   public void setStudentImg(int studentImg) {
      this.studentImg = studentImg;
   }

   public Student(String studentName, int studentAge, int studentGrade, int studentImg) {
      this.studentName = studentName;
      this.studentAge = studentAge;
      StudentGrade = studentGrade;
      this.studentImg = studentImg;
   }
}
