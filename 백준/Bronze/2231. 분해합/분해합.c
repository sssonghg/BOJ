#include <stdio.h>

int arr[7];

int main(void) {
    int num;
    scanf("%d", &num);

    for (int i=1; i < num; i++) {
        for (int k = 0; k < 7; k++) arr[k] = 0; 
        arr[0] = i;
        
        int temp1 = i;
        int x = 0;
        while (temp1 != 0) {
            x++;
            temp1 = temp1 / 10;
        }
        
        int temp2 = i;
        for (int j=1; j<=x; j++) {
            if (temp2 > 0) {
                arr[j] = temp2 % 10;
                temp2 = temp2 / 10;
            }
        }
        
        int sum = 0;
        for (int j=0; j<=x; j++) {
            sum = sum + arr[j];
        }
        if (num == sum) {
            printf("%d", arr[0]);
            return 0;
        }
        
    }
    printf("%d", 0);
}