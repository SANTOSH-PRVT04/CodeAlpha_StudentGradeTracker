


// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).


import java.util.ArrayList;
import java.util.Scanner;

public class grade {
   public grade() {
   }

   private static final class Student {
      private final int studentNumber;
      private final String name;
      private final double score;
      private final String letterGrade;
      private final String result;

      private Student(int studentNumber, String name, double score, String letterGrade, String result) {
         this.studentNumber = studentNumber;
         this.name = name;
         this.score = score;
         this.letterGrade = letterGrade;
         this.result = result;
      }
   }

   private static String getLetterGrade(double var0) {
      if (var0 >= (double)80.0F) {
         return "A";
      } else if (var0 >= (double)60.0F) {
         return "B";
      } else {
         return var0 >= (double)30.0F ? "C" : "D";
      }
   }

   private static String getResult(double var0) {
      return var0 < (double)30.0F ? "Fail" : "Pass";
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      ArrayList<Student> var2 = new ArrayList<>();
      System.out.print("Enter number of students: ");
      int var5 = var1.nextInt();
      var1.nextLine();

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var6 + 1;
         System.out.println("\nStudent " + var7);

         while(true) {
            System.out.print("Enter student name: ");
            String var8 = var1.nextLine().trim();
            if (var8.isEmpty()) {
               System.out.println("Name cannot be empty. Try again.");
            } else {
               System.out.print("Enter the score: ");
               double var19 = var1.nextDouble();
               var1.nextLine();
               String var11 = getLetterGrade(var19);
               String var12 = getResult(var19);
               var2.add(new Student(var7, var8, var19, var11, var12));
               break;
            }
         }
      }

      if (var2.isEmpty()) {
         System.out.println("\nNo student data available.");
         var1.close();
      } else {
         double var17 = var2.get(0).score;
         double var18 = var2.get(0).score;
         int var20 = 0;
         int var22 = 0;
         int var23 = 0;
         int var13 = 0;

         for(Student var15 : var2) {
            if (var15.score > var17) {
               var17 = var15.score;
            }

            if (var15.score < var18) {
               var18 = var15.score;
            }

            if (var15.letterGrade.equals("A")) {
               ++var20;
            } else if (var15.letterGrade.equals("B")) {
               ++var22;
            } else if (var15.letterGrade.equals("C")) {
               ++var23;
            } else {
               ++var13;
            }
         }

         System.out.println("\n===== Student Summary Report =====");
         String var24 = "+------------+----------------------+----------+-------+--------+";
         System.out.println(var24);
         System.out.printf("| %-10s | %-20s | %-8s | %-5s | %-6s |\n", "Student No", "Name", "Score", "Grade", "Result");
         System.out.println(var24);

         for(Student var16 : var2) {
            System.out.printf("| %-10d | %-20s | %-8.2f | %-5s | %-6s |\n", var16.studentNumber, var16.name, var16.score, var16.letterGrade, var16.result);
         }

         System.out.println(var24);
         System.out.println("\nHighest Score: " + var17);
         System.out.println("Lowest Score: " + var18);
         System.out.println("\nGrade Count:");
         System.out.println("A: " + var20);
         System.out.println("B: " + var22);
         System.out.println("C: " + var23);
         System.out.println("D: " + var13);
         var1.close();
      }
   }
}

