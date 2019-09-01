#include<stdio.h>
int main()
{
	//type your code here
  int n,a,d,t1,t2,next;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=0,d=2;
    t1=(n+1)/2;
    next= a+ (t1-1)*d;
    printf("%d",next);
  }
  else
  {
    a=0,d=1;
    t2=n/2;
    next=a+(t2-1)*d;
    printf("%d",next);
  }
  return 0;
}