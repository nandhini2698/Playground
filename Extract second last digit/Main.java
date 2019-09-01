#include<stdio.h>
int main()
{
  //Type your code here
  int n,last,slast;
  scanf("%d",&n);
  last=n%100;
  slast=last/10;
  printf("%d",slast);
  return 0;
}