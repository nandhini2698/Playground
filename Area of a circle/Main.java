#include<stdio.h>
int main()
{
  //Type your code here
  int diameter;
  scanf("%d",&diameter);
  float radius,pi=3.14,area;
  radius=(float)diameter/2;
  area=pi*radius*radius;
  printf("%.2f",area);
  return 0;
}