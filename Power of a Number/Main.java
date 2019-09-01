#include <stdio.h>
#include <math.h>
int main()
{
  	//Your code here    
  int base,exp,i,power;
  scanf("%d %d",&base,&exp);
  if(exp<0)
    printf("Wrong input");
  else
  {
    power=pow(base,exp);
    printf("%d",power);
  }
    
    return 0;
}