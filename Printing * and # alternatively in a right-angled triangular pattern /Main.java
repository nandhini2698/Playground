#include <stdio.h>
int main(){
	// Type your code here
  int n,i,turn=0,j;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(turn==0)
      {
        printf("*");
      	turn=1;
      }
      else
      {
        printf("#");
      	turn=0;
      }
    }
    printf("\n");
  }
  	return 0;
}