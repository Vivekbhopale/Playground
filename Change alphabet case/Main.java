#include <stdio.h>
int main() {
	char c;
  scanf("%c",&c);
  if('a'<=c && c<='z')
  {
    printf("%c",'A'+(c-'a'));
  }
  if('A'<=c && c<='Z')
  {
    printf("%c",'a'+(c-'A'));
  }
  return 0;
}