#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char a[50];
  scanf("%[^\n]s",a);
  int length,i;
  for(i=0;a[i]!='\0';i++)
  {
    length++;
  }
  printf("%d",length);
    
  return 0;
}