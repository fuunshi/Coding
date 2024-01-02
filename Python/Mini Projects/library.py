def add():
    title = input("Enter title:")
    author = input("Enter author's name:")
    year = int(input("Enter year published:"))
    books.append({"title":title,"author":author,"year":year})
    print("Adding successfull!")

def remove():
    title = input("Enter title:")

    for book in books:
        if book["title"] == title:
            books.remove(book)
            print(f"{title} has been removed")
        else:
            print(f"{title} was not found")
        return

def search_title():
    title = input("Enter title:")
    for book in books:
        if title.lower() in book["title"].lower():
            print(book)


def search_author():
    author = input("Enter author:")
    for book in books:
        if author.lower() in book["author"].lower():
            print(book)

def display():
    for book in books:
        print(book)

def main():
    global books
    books = [
        {"title":"The Great Gatsby","author":"F. Scott Fitzgerakd","year":1925},
        {"title":"The Hobbit","author":"J.R.R. Tolkien","year":1937},
        {"title":"The Lord of the Rings","author":"J.R.R. Tolkien","year":1954},
        {"title":"The Da Vinci Code","author":"Dan Brown","year":2003},
    ]
    print(f"""
          1. Add a new book
          2. Remove a book
          3. Search for a book by title
          4. Search for a book by author
          5. List all the books
          6. Quit
          """)
    while True:
        choice = int(input("Enter your choice:"))
        if choice == 1:
            add()
        elif choice == 2:
            remove()
        elif choice == 3:
            search_title()
        elif choice == 4:
            search_author()
        elif choice == 5:
            display()
        elif choice == 6:
            break

if __name__ == "__main__":
    main()