#include<stdio.h>
void add(int a, int b){
   printf("%d\n",(a+b));
 }
 void sub(int a, int b){
   printf("%d\n",(a-b));
 }  
 void multiplication(int a, int b){
     printf("%d\n",(a*b));
 }
 void main(){
    add(20,10);
    sub(20,10);
    multiplication(20,10);
 }