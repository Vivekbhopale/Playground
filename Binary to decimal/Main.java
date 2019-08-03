#include<stdio.h>
int main()
{
  int dec=0,bin,r,i=1;
  scanf("%d",&bin);
  while(bin!=0)
  {
    r=bin%10;
    dec=dec+(i*r);
    bin=bin/10;
    i=i*2;
}
  printf("%d",dec);
  return 0;
}