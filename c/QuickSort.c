#include<stdio.h>
#include<conio.h>
int partition(int a[],int start, int end){
    int pivot = a[end];
    int i = (start-1);
    for(int j=start; j<=end; j++){
        if(a[j]<pivot){
            i++;
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
    }
    int t=a[i+1];
    a[i+1]=a[end];
    a[end]=t;
    return (i+1);
}
void quick(int a[],int start, int end){
    if(start<end){
        int p=partition(a,start,end);
        quick(a,start,p-1);
        quick(a,p+1,end);
    }
}
void printArr(int a[],int n){
    for(int i=0; i<n; i++){
        printf("%d\n",a[i]);
    }
}
void main(){
    int a[5] = {22,4,11,12,14};
    int n = sizeof(a)/sizeof(a[0]);
    printf("Before sorting array eleents are:\n");
    printArr(a,n);
    quick(a,0,n-1);
    printf("After sorting array elements are:\n");
    printArr(a,n);
    getch();

}