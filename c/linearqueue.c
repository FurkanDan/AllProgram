#include<stdio.h>
#include<stdlib.h>
#define MAXSIZE 10
int Q[MAXSIZE],front=-1,rear=-1;
void qinsert(int x)
{
	if(rear==MAXSIZE-1)
		printf("\n Queue is Full.");
	else if(front==-1)
	{
		front=0;
		rear=0;
		Q[front]=x;	
	}
	else
	{
		rear++;
		Q[rear]=x;
	}
}
void qdelete()
{
	if(front==-1)
		printf("\n Queue is Empty.");
	else if(front==rear)
	{
		printf("\n %d is removed from Queue.",Q[front]);
		front=-1;
		rear=-1;
	}
	else
	{
		printf("\n %d is deleted from Queue.",Q[front]);
		front++;
	}
}
void display()
{
	int i;
	printf("\n The Queue elements are...\n");
	if(front==-1)
		printf("\n No elements in Queue.");
	else
	{
		for(i=front;i<=rear;i++)
			printf(" %d ",Q[i]);
	}
}
int main()
{
	int choice,x;
	while(1)
	{
		printf("\n 1.Data insert\n 2.Data Delete\n 3.Data Display\n 4.Exit");
		printf("\n Please, Enter your choice : ");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1: printf("\n Please, Enter the element : ");
					scanf("%d",&x);
					qinsert(x);
					break;
			case 2: qdelete();
					break;
			case 3: display();
					break;
			case 4: exit(0);
			default : printf("\n wrong Choice.");
		}
	}
}