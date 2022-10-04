#include <stdio.h>
int main() 
  {  
      char c;

      printf("Enter a character: ");
      scanf("%c", &c);  

      // %d displays the integer value of a character

      printf("ASCII value of %c = %d", c, c); // %c displays the actual character

      return 0;
  }
