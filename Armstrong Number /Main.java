#include <stdio.h>
#include <math.h>
int main() {
	//Type your code
  int n,ld,sum=0,x;
  scanf("%d",&n);
  int t=n;
  while(n>0)
  {
    ld=n%10;
    sum=sum+(ld*ld*ld);
  	n=n/10;
  }
  if(sum==t)
  {
    printf("Armstrong Number");
  }
  else
    printf("Not an Armstrong Number");
	return 0;
}