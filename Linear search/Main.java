#include<stdio.h>
int main()
{
  //Type your code here
  int size,i,find;
  scanf("%d",&size);
  int arr[size];
  for(i=0;i<size;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&find);
  for(i=0;i<size;i++)
  {
    if(arr[i]==find)
    {
      printf("%d",i+1);
      break;
    }
    if(i==size-1)
    {
      printf("%d isn't present in the array.",find);
    }
  }
  return 0;
}