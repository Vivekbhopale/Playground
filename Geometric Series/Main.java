#include<stdio.h>
#include<math.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n%2==0)
  {
    int p=n/2;
    int m=pow(3,p-1);
    printf("%d",m);
  }
  else
  {
    int p=n/2 +1;
    int m=pow(2,p-1);
    printf("%d",m);
  }
  return 0;
}