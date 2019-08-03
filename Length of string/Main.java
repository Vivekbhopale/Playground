#include<stdio.h>
#include<string.h>
int main()
{
  char s[20];
  scanf("%[^\n]s",s);
  int l=strlen(s);
  printf("%d",l);
  return 0;
}
