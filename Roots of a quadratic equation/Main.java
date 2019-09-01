#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float a,b,c,det,r1,r2,real,img;
  scanf("%f %f %f",&a,&b,&c);
  det= b*b- 4*a*c;
  if(det>0)
  {
    r1= (-b + sqrt(det))/(2*a);
    r2= (-b - sqrt(det))/(2*a);
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
  else if(det==0)
  {
    r1=r2= -b/ (2*a);
    printf("root1 = %.2f  root2 = %.2f",r1,r2);
  }
  else
  {
    real= -b/(2*a);
    img= sqrt(-det)/ (2*a);
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",real,img,real,img);
  }
}