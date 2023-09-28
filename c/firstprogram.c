#include<stdio.h>
#include<conio.h>
void print(int a[], int n){
    for(int i=0; i<n; i++){
        printf("%d\n",a[i]);
    }
}

void bubble(int a[],int n){
    int i,j,temp;
    for( i=0; i<n; i++){
        for(j=i+1; j<n; j++){
            if(a[j]<a[i]){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

    }
}

void main(){
    int i,j,twmp;
    int a[5] = {10,35,32,13,36};
    int n = sizeof(a)/sizeof(a[0]);
    
    printf("Before sorting array are:\n");
    print(a,n);
    bubble(a,n);
    printf("After sorting array elements are:\n");
    print(a,n);
    getch();
}