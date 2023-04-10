#include <stdio.h>

int main() {
    int a;
    float b;
    char c, dummy;
    char d[100];
    scanf("%d%f %c%c%[^\n]", &a, &b, &c, &dummy, d);
    printf("%d%f%c%s\n", a, b, c, d);
    printf("%d\011%f\011%c\011%s\n", a, b, c, d);
    printf("%10d%10.6f%10c%10s\n", a, b, c, d);
    return 0;
}