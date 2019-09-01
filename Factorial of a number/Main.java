#include <stdio.h>
int main() {
	//Type your code
  int n,i,fact=1;
  scanf("%d",&n);
  for(i=n;i>=1;i--)
  {
    fact=fact*i;
  }
  printf("%d",fact);
	return 0;
}