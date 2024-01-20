def main():
    print(encrypt('hehe', 4))


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