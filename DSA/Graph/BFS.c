//PROGRAM TO IMPLEMENT BFS USING QUEUE
#include <stdio.h>
#include <stdlib.h>
 
struct node
{
    int vertex;
    struct node *next;
};
 
struct Graph
{
    int numVertices;
    struct node **adjLists;
    int *visited;
};
 
struct node *createNode(int v);
struct Graph *createGraph(int vertices);
void addEdge(struct Graph *graph, int src, int dest);
void printGraph(struct Graph *graph);
void bfs(struct Graph *graph, int startVertex);
int isEmpty(struct node *queue);
void enqueue(struct node **queue, int value);
int dequeue(struct node **queue);
void printQueue(struct node *queue);
 
struct node *createNode(int v)
{
    struct node *newNode = malloc(sizeof(struct node));
    newNode->vertex = v;
    newNode->next = NULL;
    return newNode;
}
 
struct Graph *createGraph(int vertices)
{
    struct Graph *graph = malloc(sizeof(struct Graph));
    graph->numVertices = vertices;
 
    graph->adjLists = malloc(vertices * sizeof(struct node*));
    graph->visited = malloc(vertices * sizeof(int));
 
    int i;
    for (i = 0; i < vertices; i++)
    {
        graph->adjLists[i] = NULL;
        graph->visited[i] = 0;
    }
 
    return graph;
}
 
void addEdge(struct Graph *graph, int src, int dest)
{
    // Add edge from src to dest
    struct node *newNode = createNode(dest);
    newNode->next = graph->adjLists[src];
    graph->adjLists[src] = newNode;
 
    // Add edge from dest to src
    newNode = createNode(src);
    newNode->next = graph->adjLists[dest];
    graph->adjLists[dest] = newNode;
}
 
void printGraph(struct Graph *graph)
{
    int v;
    for (v = 0; v < graph->numVertices; v++)
    {
        struct node *temp = graph->adjLists[v];
        printf("Adjacency list of vertex %d :", v);
        while (temp)
        {
            printf("%d -> ", temp->vertex);
            temp = temp->next;
        }
        printf("\n");
    }
}
 
void bfs(struct Graph *graph, int startVertex)
{
    struct node *queue = NULL;
    graph->visited[startVertex] = 1;
    enqueue(&queue, startVertex);
 
    while (!isEmpty(queue))
    {
        printQueue(queue);
        int currentVertex = dequeue(&queue);
        printf("Visited %d ", currentVertex);
 
        struct node *temp = graph->adjLists[currentVertex];
 
        while (temp)
        {
            int adjVertex = temp->vertex;
 
            if (graph->visited[adjVertex] == 0)
            {
                graph->visited[adjVertex] = 1;
                enqueue(&queue, adjVertex);
            }
            temp = temp->next;
        }
    }
}
 
int isEmpty(struct node *queue)
{
    return queue == NULL;
}
 
void enqueue(struct node **queue, int value)
{
    struct node *newNode = createNode(value);
    if (isEmpty(*queue))
    {
        *queue = newNode;
    }
    else
    {
        struct node *temp = *queue;
        while (temp->next)
        {
            temp = temp->next;
        }
        temp->next = newNode;
    }
}
 
int dequeue(struct node **queue)
{
    if (isEmpty(*queue))
    {
        return -1;
    }
    else
    {
        struct node *temp = *queue;
        *queue = (*queue)->next;
        int value = temp->vertex;
        free(temp);
        return value;
    }
}
 
void printQueue(struct node *queue)
{
    struct node *temp = queue;
    while (temp)
    {
        printf("%d ", temp->vertex);
        temp = temp->next;
    }
    printf("\n");
}
 
int main(void)
{
    printf("Enter number of vertices: ");
    int vertices;
    scanf("%d", &vertices);
 
    struct Graph *graph = createGraph(vertices);
 
    int choice;
    do
    {
        printf("\nWhat do you want to do? \n");
        printf(" 1. Add edge\t 2. Print graph\t 3. BFS\t 4. Exit\t");
        printf("Enter your choice: ");
        scanf("%d", &choice);
 
        switch (choice)
        {
            case 1:
                printf("Enter source and destination: ");
                int src, dest;
                scanf("%d %d", &src, &dest);
                addEdge(graph, src, dest);
                break;
            case 2:
                printGraph(graph);
                break;
            case 3:
                printf("Enter starting vertex: ");
                int startVertex;
                scanf("%d", &startVertex);
                bfs(graph, startVertex);
                break;
            case 4:
                break;
            default:
                printf("Invalid choice");
        }
    }
    while (choice != 4);
 
    return 0;
}