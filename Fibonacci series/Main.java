#include<stdio.h>
int main()
{
  int n,t1=0,t2=1,i,next;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    if(i<=1)
      next=i;
    else
    {
      next=t1+t2;
      t1=t2;
      t2=next;
    }
    printf("%d ",next);
  }
    return 0;
  }