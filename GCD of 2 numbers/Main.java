// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int x,y,hcf,i;
  scanf("%d\n%d",&x,&y);
  for(i=1;i<=x && i<=y;i++)
  {
if(x%i==0 && y%i==0)
  hcf=i;
  }
  printf("%d",hcf);
  return 0;
}