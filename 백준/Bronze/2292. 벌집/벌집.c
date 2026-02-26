#include <stdio.h>

int main(void) {
    int rc = 1;
    int i = 2;
    int j = 6;
    int num;
    scanf("%d", &num);
    while(i <= num && num != 1) {
        rc++;
        int p = i + j;
        for (int x = i; x < p; x++) {
            if (x == num) break;
        }
        i = p;
        j = j + 6;
    }

    printf("%d", rc);
}