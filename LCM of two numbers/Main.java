#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,lcm,gcd,i;
  scanf("%d %d",&a,&b);
  for(i=1;i<=a&&i<=b;i++)
  {
    if(a%i==0&&b%i==0)
    {
      gcd=i;
    }
  }
  lcm=(a*b)/gcd;
  printf("%d",lcm);
  return 0;
}