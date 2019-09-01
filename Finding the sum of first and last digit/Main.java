#include <stdio.h>
int main() {
	//Type your code
  int num,ld,sum=0;
  scanf("%d",&num);
  ld=num%10;
  while(num>=10)
  {
    num/=10;
  }
  sum=ld+num;
  printf("%d",sum);
	return 0;
}