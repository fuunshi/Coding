def main():
    welcome()
    while True:
        prompted = prompt()
        if prompted[0] == 'e':
            result = encrypt(prompted[1], prompted[2])
        else:
            result = decrypt(prompted[1], prompted[2])
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
    
def prompt():
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


    return (choice, string, shift)

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
    decrypted = ""
    for char in str:
        if char.isalpha():
            is_upper = char.isupper()
            shifted = chr((ord(char) - shift - ord('A' if is_upper else 'a')) % 26 + ord('A' if is_upper else 'a'))
            decrypted += shifted
        else:
            decrypted += char
    return decrypted

if __name__ == "__main__":
    main()