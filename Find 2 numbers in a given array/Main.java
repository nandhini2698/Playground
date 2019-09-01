#include<stdio.h>
int main()
{
  	//type your code here
  int n,result1,result2,find1,find2;
  scanf("%d",&n);
  int arr[n],i;
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d %d",&find1,&find2);
  result1=findele(n,find1,arr);
  result2=findele(n,find2,arr);
  printf("Element 1 index = %d",result1);
  printf("\nElement 2 index = %d",result2);
}
int findele(int size,int element,int arr[])
{
  int i,index=0,pos;
  for(i=0;i<size;i++)
  {
    if(arr[i]==element)
    {
      index=1;
      pos=i;
      break;
    }
  }
  if(index==1)
  {
    return pos;
  }
  else
  {
    return -1;
  }
}
  