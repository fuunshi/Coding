from os.path import exists

def main():
    welcome() 
    while True:
        mode, word, shift = prompt_console()
        if mode == 'e':
            result = encrypt(word, shift)
        else:
            result = decrypt(word, shift)
        print(f"Result: { result }")
        check = input("Would you like to continue y/n? ").lower()
        if check != "y":
            break



def welcome():
    print(f"""
            ----------------------------------------
            Hello Welcome To Caesar Cipher In Python
            ----------------------------------------
          """)
    
def prompt_console():
    while True:
        choice = input("Would you like to encrypt (e) or decrypt (d): ").lower()

        if choice in ['e', 'd']:
            break
        else:
            print("Invalid input. Please enter 'e' for encrypt or 'd' for decrypt.")

    choice_str = "encrypt" if choice == 'e' else "decrypt"
    string = input(f"What message would you like to {choice_str}: ")

    while True:
        try:
            shift = int(input("What is the shift number: "))
            break
        except ValueError:
            print("Invalid input. Please enter a valid integer for the shift.")


    return choice, string, shift

# def prompt_file():
#     while True:
#         choice = input("Would you like to encrypt (e) or decrypt (d): ").lower()

#         if choice in ['e', 'd']:
#             break
#         else:
#             print("Invalid input. Please enter 'e' for encrypt or 'd' for decrypt.")

#     choice_str = "encrypt" if choice == 'e' else "decrypt"
#     while True:
#         filename = input(f"Which file would you like to {choice_str}: ")
#         if not is_file(filename):
#             print("Invalid Filename")
#         else:
#             break
#     while True:
#         try:
#             shift = int(input("What is the shift number: "))
#             break
#         except ValueError:
#             print("Invalid input. Please enter a valid integer for the shift.")
    
#     return choice, filename, shift


def encrypt(str, shift):
    encrypted = ""
    for char in str:
        if char.isalpha():
            is_upper = char.isupper()
            shifted = chr((ord(char) + shift - ord('A' if is_upper else 'a')) % 26 + ord('A' if is_upper else 'a'))
            encrypted += shifted
        else:
            encrypted += char
    return encrypted

def decrypt(str, shift):
    return encrypt(str, -shift)

def is_file(filename):
    return exists(filename)


if __name__ == "__main__":
    main()