#include<stdio.h>
int main()
{
 int dec,oct=0,i=1,r;
  scanf("%d",&dec);
  while(dec!=0)
  {
    r=dec%8;
    oct=oct+(i*r);
    dec=dec/8;
    i=i*10;
  }
  printf("%d",oct);
  return 0;
}