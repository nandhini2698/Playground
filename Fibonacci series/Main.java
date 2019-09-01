#include<stdio.h>
int main()
{
  //Type your code here
  int n,a=0,b=1,i,next;
  scanf("%d",&n);
  printf("%d %d",a,b);
  for(i=3;i<=n;i++)
  {
    next=a+b;
    printf(" %d",next);
    a=b;
    b=next;
  }
    
  return 0;
}