#include<stdio.h>
int main()
{
 int dec,i=1,bin=0,r;
  scanf("%d",&dec);
  while(dec!=0)
  {
    r=dec%2;
    bin=bin+(i*r);
    dec=dec/2;
    i=i*10;
  }
  printf("%d",bin);
  return 0;
}