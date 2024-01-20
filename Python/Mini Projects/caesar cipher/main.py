def main():
    welcome()
    prompt()
    print(encrypt('hehe', 4))

def welcome():
    print(f"""
            ----------------------------------------
            Hello Welcome To Caesar Cipher In Python
            ----------------------------------------
          """)
    
def prompt():
    choice = input("Would you like to encrypt(e) or decrypt(d): ").lower()
    choice_str = "encrypt" if choice == 'e' else "decrypt"
    string = input(f"What message would you like to {choice_str}")
    shift = int(input("What is the shift number: "))
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