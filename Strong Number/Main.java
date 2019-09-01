#include <stdio.h>
int facto(int n)
{
  int i,fact=1;
  for(i=n;i>=1;i--)
  {
    fact=fact*i;
  }
  return fact;
}
int main() {
	//Type your code
  int n,sum=0,t,ld;
  scanf("%d",&n);
  t=n;
  while(n!=0)
  {
    ld=n%10;
    sum=sum+facto(ld);
    n=n/10;
  }
  if(sum==t)
    printf("Yes");
  else
    printf("No");
	return 0;
}