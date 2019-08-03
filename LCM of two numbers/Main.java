#include<stdio.h>
int main()
{
 int x,y,hcf,lcm,i;
  scanf("%d %d",&x,&y);
  for(i=1;i<=x && i<=y; i++)
  {
    if(x%i==0 && y%i==0)
      hcf=i;
  }
  lcm=(x*y)/hcf;
  printf("%d",lcm);
  return 0;
}