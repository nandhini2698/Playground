#include<stdio.h>
int main()
{
  //Type your code here
  int num,last,first;
  scanf("%d",&num);
  first=num/10;
  last=num%10;
  printf("%d",first+last);
  return 0;
}