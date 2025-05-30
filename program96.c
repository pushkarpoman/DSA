#include<stdio.h>
#include<stdlib.h>

void ReverseDisplay(int Arr[], int iSize)
{
    int iCnt = 0;

    for(iCnt = iSize-1; iCnt >= 0; iCnt--)
    {
        printf("%d\n",Arr[iCnt]);
    }
}

int main()
{
    int *ptr = NULL;
    int iLength = 0, iCnt = 0;

    printf("Enter number of elements : \n");
    scanf("%d",&iLength);

    ptr = (int *)malloc(iLength * sizeof(int));

    printf("Enter the elements : \n");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }
    ReverseDisplay(ptr,iLength);

    free(ptr);

    return 0;
}

/*
    Step 1 : Accept the number of elements form user
    Step 2 : Allocate that memory dynamically
    Step 3 : Accept the values and store into the dynamic memory
    Step 4 : Perform the operations (Logic)
    Step 5 : Deallocate that memory 
*/