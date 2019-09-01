#include<stdio.h>
int main()
{
  float radius,cangle,arc,pi=3.14;
  scanf("%f %f",&radius,&cangle);
  arc=(2*pi*radius)*(cangle/360);
  printf("%.2f",arc);
  return 0;
}