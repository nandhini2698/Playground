#include<stdio.h>
int main()
{
  int num=365,quotient=0, remainder;
  quotient=num/4;
  remainder=num%4;
  printf("Quotient: %d",quotient);
  printf("\nRemainder: %d",remainder);
  return 0;
}