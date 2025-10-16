#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef int element;

typedef struct StackNode {
    element data;
    struct StackNode *link;
} StackNode;

typedef struct {
    StackNode *top;
} LinkedStackType;

void init(LinkedStackType *s) {
    s->top = NULL;
}

static int is_empty(LinkedStackType *s) {  
    return s->top == NULL;
}

void push(LinkedStackType *s, element item) {
    StackNode *temp = (StackNode *)malloc(sizeof(StackNode));
    if (!temp) { perror("malloc"); exit(1); }
    temp->data = item;
    temp->link = s->top;
    s->top = temp;
}

element pop(LinkedStackType *s) {
    if (is_empty(s)) {
        printf("-1\n");
        return -1;
    }
    StackNode *temp = s->top;
    int data = temp->data;
    s->top = temp->link;
    free(temp);
    printf("%d\n", data);
    return data;
}

void size(LinkedStackType *s) {
    int count = 0;
    for (StackNode *p = s->top; p != NULL; p = p->link) {
        count++;
    }
    printf("%d\n", count);
}

element top(LinkedStackType *s) {
    if (is_empty(s)) {
        printf("-1\n");
        return -1;
    }
    printf("%d\n", s->top->data);
    return s->top->data;
}

int empty(LinkedStackType *s) {
    int e = is_empty(s);
    printf("%d\n", e ? 1 : 0);
    return e;
}

int main(void) {
    LinkedStackType s;
    init(&s);

    int n;
    if (scanf("%d", &n) != 1) return 0;

    for (int i = 0; i < n; i++) {
        char menu[16];             
        if (scanf("%15s", menu) != 1) break;

        if (strcmp(menu, "push") == 0) {
            int num;
            if (scanf("%d", &num) != 1) num = 0;
            push(&s, num);
        } else if (strcmp(menu, "pop") == 0) {
            pop(&s);
        } else if (strcmp(menu, "size") == 0) {
            size(&s);
        } else if (strcmp(menu, "top") == 0) {
            top(&s);
        } else if (strcmp(menu, "empty") == 0) {
            empty(&s);
        }
    }

    return 0;
}
