// Example program
#include <iostream>
#include <string>

void reverse(char *str) {
    char* end = str;
    char tmp;

    while (*end) {
        ++end;
    }
    --end;

    while (str < end) {
        tmp      = *str;
        *str++ = *end;
        *end--   = tmp;
    
    }
}


int main()
{
char test[] = "abc";
char* str = test;
reverse(str);
std::cout << str;
return 0;
}