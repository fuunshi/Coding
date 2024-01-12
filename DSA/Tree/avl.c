#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node* left;
    struct node* right;
    int ht;
};

struct node* root = NULL;

struct node* create(int);
struct node* insert(struct node*, int);
struct node* deleteNode(struct node*, int);
struct node* search(struct node*, int);
struct node* rotate_left(struct node*);
struct node* rotate_right(struct node*);
int balance_factor(struct node*);
int height(struct node*);
void inorder(struct node*);
void preorder(struct node*);
void postorder(struct node*);

int main() {
    int user_choice, data;
    char user_continue = 'y';
    struct node* result = NULL;

    while (user_continue == 'y' || user_continue == 'Y') {
        printf("\n\n------- AVL TREE --------\n");
        printf("\n1.Insert\n2.Delete\n3.Search\n4.Inorder\n5.Preorder\n6.Postorder\n7.EXIT");
        printf("\n\nEnter Your Choice: ");
        scanf("%d", &user_choice);

        switch (user_choice) {
            case 1:
                printf("\nEnter data: ");
                scanf("%d", &data);
                root = insert(root, data);
                break;

            case 2:
                printf("\nEnter data to delete: ");
                scanf("%d", &data);
                root = deleteNode(root, data);
                break;

            case 3:
                printf("\nEnter data to search: ");
                scanf("%d", &data);
                result = search(root, data);
                if (result == NULL) {
                    printf("\nNode not found!");
                } else {
                    printf("\nNode found");
                }
                break;

            case 4:
                printf("\nInorder traversal: ");
                inorder(root);
                break;

            case 5:
                printf("\nPreorder traversal: ");
                preorder(root);
                break;

            case 6:
                printf("\nPostorder traversal: ");
                postorder(root);
                break;

            case 7:
                printf("\nProgram Terminated\n");
                return 0;

            default:
                printf("\nInvalid Choice\n");
        }

        printf("\n\nDo you want to continue? (y/n): ");
        scanf(" %c", &user_continue);
    }

    return 0;
}

struct node* create(int data) {
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    if (new_node == NULL) {
        printf("\nMemory allocation error\n");
        return NULL;
    }
    new_node->data = data;
    new_node->left = NULL;
    new_node->right = NULL;
    new_node->ht = 1; // Initialized height as 1
    return new_node;
}

// Delete a node from the AVL tree
struct node* deleteNode(struct node* root, int x) {
    if (root == NULL) {
        return root;
    }

    if (x < root->data) {
        root->left = deleteNode(root->left, x);
    } else if (x > root->data) {
        root->right = deleteNode(root->right, x);
    } else {
        if (root->left == NULL || root->right == NULL) {
            struct node* temp = root->left ? root->left : root->right;

            if (temp == NULL) {
                temp = root;
                root = NULL;
            } else {
                *root = *temp;
            }
            free(temp);
        } else {
            struct node* temp = root->right;
            while (temp->left != NULL) {
                temp = temp->left;
            }
            root->data = temp->data;
            root->right = deleteNode(root->right, temp->data);
        }
    }

    if (root == NULL) {
        return root;
    }

    root->ht = 1 + height(root->left) > height(root->right) ? height(root->left) : height(root->right);

    int balance = balance_factor(root);

    if (balance > 1 && balance_factor(root->left) >= 0) {
        return rotate_right(root);
    }

    if (balance < -1 && balance_factor(root->right) <= 0) {
        return rotate_left(root);
    }

    if (balance > 1 && balance_factor(root->left) < 0) {
        root->left = rotate_left(root->left);
        return rotate_right(root);
    }

    if (balance < -1 && balance_factor(root->right) > 0) {
        root->right = rotate_right(root->right);
        return rotate_left(root);
    }

    return root;
}
