#include<stdio.h>
int main()
{
int n;
  scanf("%d",&n);
  if(n%2==0)
  {
    int m=n/2;
    int p=2*(m-1);
    int o=p/2;
    printf("%d",o);
  }
  else
  {
    int m=n/2 +1;
    int p=2*(m-1);
    int o=p;
    printf("%d",o);
  }
  return 0;
}