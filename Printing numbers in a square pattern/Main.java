#include <stdio.h>
int main(){
	// Type your code here
  int n,i,j;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=n;j>=1;j--)
    {
      printf("%d",i);
    }
    printf("\n");
  }
  	return 0;
}