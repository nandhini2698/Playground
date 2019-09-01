#include<stdio.h>
#include<string.h>
int main()
{
  // type your code here
  char s1[20],s2[20],s3[20],s4[20];
  int i,a,b,c;
  scanf("%s %s %s",s1,s2,s3);
  a=strlen(s1);
  b=strlen(s2);
  c=strlen(s3);
  for(i=0;i<a;i++)
  {
    if(s1[i]=='A'||s1[i]=='a'||s1[i]=='E'||s1[i]=='e'||s1[i]=='I'||s1[i]=='i'||s1[i]=='O'||s1[i]=='o'||s1[i]=='U'||s1[i]=='u')
    {
      s1[i]='$';
    }
  }
  for(i=0;i<b;i++)
  {
    if(s2[i]=='A'||s2[i]=='a'||s2[i]=='E'||s2[i]=='e'||s2[i]=='I'||s2[i]=='i'||s2[i]=='O'||s2[i]=='o'||s2[i]=='U'||s2[i]=='u')
	 continue;
    else
    {
      s2[i]='#';
    }
  }
  for(i=0;s3[i]!='\0';i++)
  {
    if(s3[i]>='a' && s3[i]<='z')
    {
      s3[i]=s3[i]-32;
    }
  }
  
  printf("%s%s%s",s1,s2,s3);
}