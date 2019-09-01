#include<stdio.h>
#include<math.h>
int main()
{
  //type your code here
  int i,j=1,k=1,n;
  scanf("%d",&n);
  int arr[n];
  arr[0]=1;
  arr[1]=1;
  for(i=2;i<n;i++)
  {
    if(i%2==0)
    {
      arr[i]=pow(2,j);
      j++;
    }
    else
    {
      arr[i]=pow(3,k);
      k++;
    }
  }
  for(i=0;i<n;i++)
  {
    if(i==n-1)
    {
      printf("%d",arr[n-1]);
    }
  }
  return 0;
}