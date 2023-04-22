#include <stdio.h>
int main()
{
    int n, i, j, c = 1;

    scanf("%d", &n);
    for (i = 1; i <= (2 * n) - 1; i++)
    {
        for (j = 1; j <= (2 * n) - 1; j++)
        {
            if (i == j || i + j == 2 * n)
                printf("%d", c);
            else
            {
                printf(" ");
            }
        }

        if (i < n)
            c++;
        else
            c--;
        printf("\n");
    }
    return 0;
}