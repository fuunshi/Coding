from os.path import exists

def welcome():
    print("Welcome to the Caesar Cipher\nThis program encrypts and decrypts text with the Caesar Cipher.")

def encrypt(word,shift):
    result=""
    for char in word:
        if char.isalpha():
            shifted=chr((ord(char)+shift-ord("A"))%26+ord("A"))
            result+=shifted
        else:
            result+=char
    return result

def decrypt(word, shift):
    return encrypt(word, -shift)

def enter_message():
    while True:
        encryptDecrypt=input("Would you like to encrypt(e) or decrypt(d):").lower()
        if encryptDecrypt in ["e","d"]:
            break
        else:
            print("Invalid mode")

    # Message to encrypt decrypt
    mode_str="encrypt" if encryptDecrypt=="e" else "decrypt"
    message=input(f"What message would you like to {mode_str}:")

    while True:
        try:
            shift=int(input("What is the shift number:"))
            break
        except ValueError:
            print("Invalid shift")
    return encryptDecrypt,message.upper(),shift

def message_or_file():
    while True:
        mode = input("Would you like to encrypt (e) or decrypt (d)? ").lower()
        if mode in ['e', 'd']:
            break
        else:
            print("Invalid Mode")

    source_type = input("Would you like to read from a file (f) or the console (c)? ").lower()

    if source_type == 'c':
        while True:
            message = input("What message would you like to {}: ".format("encrypt" if mode == 'e' else "decrypt")).upper()
            shift = input("What is the shift number: ")
            if shift.isdigit():
                return mode, message, None, int(shift)
            else:
                print("Invalid Shift")
    elif source_type == 'f':
        while True:
            filename = input("Enter a filename: ")
            if is_file(filename):
                break
            else:
                print("Invalid Filename")

        shift = input("What is the shift number: ")
        if shift.isdigit():
            return mode, None, filename, int(shift)
        else:
            print("Invalid Shift")

def is_file(filename):
    return exists(filename)

def process_file(filename, mode, shift):
    with open(filename, 'r') as file:
        messages = [line.strip().upper() for line in file]
        
        if mode == 'e':
            return [encrypt(message, shift) for message in messages]
        elif mode == 'd':
            return [decrypt(message, shift) for message in messages]
        
def write_messages(messages):
    with open('results.txt', 'w') as file:
        for message in messages:
            file.write(message + '\n')
    print("Output written to results.txt")

def main():
    welcome()

    while True:
        mode, message, filename, shift = message_or_file()

        if filename:
            # Process messages from file
            messages = process_file(filename, mode, shift)
            for msg in messages:
                print(msg)
            write_messages(messages)
        elif message:
            # Process a single message from the console
            if mode == 'e':
                result = encrypt(message, shift)
                print(result)
            else:
                result = decrypt(message, shift)
                print(result)

        if input("Would you like to encrypt or decrypt another message? (y/n): ").lower() != 'y':
            break

if __name__ == "__main__":
    main()