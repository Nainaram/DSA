#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node* next;
};
void linkedListTraversal(struct Node* ptr){
    while (ptr != NULL){
        printf("Element %d\n",ptr->data);
        ptr = ptr->next;
    }
}
int main(){
    struct Node* second;
    struct Node* third;
    struct Node* head;
    struct Node* fourth;
    // allocate the memory  for the nodes in linkedlist in heap
    head = (struct Node*)malloc(sizeof(struct Node));
    second = (struct Node*)malloc(sizeof(struct Node));
    third = (struct Node*)malloc(sizeof(struct Node));
    fourth = (struct Node*)malloc(sizeof(struct Node));
    // link  first and second node

    head->data =7;
    head->next = second;
    // link  second and third node
    second -> data =11;
    second -> next = third;
    // link  third and fourth node
    third -> data =56;
    third -> next = fourth;
    // link  fourth and  Null node
    fourth -> data =78;
    fourth -> next = NULL;
    linkedListTraversal(head);

    return 0;
}