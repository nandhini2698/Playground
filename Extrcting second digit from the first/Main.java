#include <stdio.h>
int main() {
	//Type your code
  int n,ld;
    scanf("%d",&n);
  while(n>=100)
  {
    n/=10;
  }
  ld=n%10;
  printf("%d",ld);
	return 0;
}