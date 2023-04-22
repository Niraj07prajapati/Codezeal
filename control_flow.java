// CONTROL FLOW
/*IF
 Syntax:- 
 if(condition){
    // Works only if comdition is true
 }
 */
/*
 if else:- 
 if(condition){
    //True
 }else{
//False
 }
 */
/*Nested:-
   Syntax:-
   if(condition1){

   }
   else if(condition2){

   }else if(condition3){

   }else{

   }
 */
/*
 FOR LOOP
 Syntax:- 
 for(int i;i<10;i++)
 {
    sop("Message");
 }
___________________

for(Declaration;condition/tempN;Increment/decrement){

}
 */
import java.util.Scanner;

import javax.swing.plaf.basic.BasicComboBoxUI.FocusHandler;

public class control_flow {
    public static void main(String[] args) {
      /*  int age= 18;
        if (age>18){
            System.out.println("You can vote");
        }else{
            System.out.println("You can not vote");
            }
            */
         /*   Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if(n%2 == 0){
                System.out.println("Even");    
            }else{
                System.out.println("Odd");
            }
            */
         /*  Scanner sc = new Scanner(System.in);
            System.out.println("Enter a month");
            String month = sc.nextLine();

            if(month.equals("January")){
                System.out.println("January");
            }
            else if(month.equals("February")){
                System.out.println("February");
            }
            else if(month.equals("March")){
                System.out.println("March");
            }
            else if(month.equals("April")){
                System.out.println("April");
            }
            else if(month.equals("May")){
                System.out.println("May");
            }
            else if(month.equals("June")){
                System.out.println("June");
            }
            else if(month.equals("July")){
                System.out.println("July");
            }
            else if(month.equals("August")){
                System.out.println("August");
            }
            else if(month.equals("September")){
                System.out.println("September");
            }
            else if(month.equals("October")){
                System.out.println("October");
            }
            else if(month.equals("November")){
                System.out.println("November");
            }
            else if(month.equals("December")){
                System.out.println("December");
            }
            else{
                System.out.println("Input is wrong");
            }
            */
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of n");
            int n = sc.nextInt();
          /*  System.out.println("Table of 19");
            for(int i =1;i<=n;i++){
                
                System.out.println("19*"+i+" = "+19*i);
            }
            */
            for(int i =1;i<=n;i++){
                for(int j =1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        }
    
