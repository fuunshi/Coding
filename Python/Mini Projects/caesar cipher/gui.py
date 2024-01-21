import tkinter as tk
from tkinter import ttk
from main import encrypt, decrypt

def welcome():
    return """
    ----------------------------------------
    Hello Welcome To Caesar Cipher In Python
    ----------------------------------------
    """

def encrypt_decrypt_choice():
    choice_label = ttk.Label(root, text="Would you like to encrypt or decrypt?")
    choice_label.grid(column=0, row=0, columnspan=2, pady=10)

    choice_var = tk.StringVar()
    choice_combobox = ttk.Combobox(root, textvariable=choice_var, values=["Encrypt", "Decrypt"])
    choice_combobox.grid(column=0, row=1, columnspan=2, pady=10)
    choice_combobox.set("Encrypt")

    return choice_var

def message_entry():
    message_label = ttk.Label(root, text="Enter the message:")
    message_label.grid(column=0, row=2, columnspan=2, pady=10)

    message_var = tk.StringVar()
    message_entry = ttk.Entry(root, textvariable=message_var, width=30)
    message_entry.grid(column=0, row=3, columnspan=2, pady=10)

    return message_var

def shift_entry():
    shift_label = ttk.Label(root, text="Enter the shift number:")
    shift_label.grid(column=0, row=4, columnspan=2, pady=10)

    shift_var = tk.StringVar()
    shift_entry = ttk.Entry(root, textvariable=shift_var, width=5)
    shift_entry.grid(column=0, row=5, columnspan=2, pady=10)

    return shift_var

def result_label():
    result_label = ttk.Label(root, text="Result:")
    result_label.grid(column=0, row=6, pady=10)

    result_var = tk.StringVar()
    result_entry = ttk.Entry(root, textvariable=result_var, width=30, state="readonly")
    result_entry.grid(column=0, row=7, pady=10)

    return result_var

def continue_button(choice_var, message_var, shift_var, result_var):
    def process():
        choice = choice_var.get().lower()[0]
        message = message_var.get()
        shift = int(shift_var.get())

        if choice == 'e':
            result = encrypt(message, shift)
        else:
            result = decrypt(message, shift)

        result_var.set(result)

    continue_button = ttk.Button(root, text="Continue", command=process)
    continue_button.grid(column=0, row=8, columnspan=2, pady=10)

def quit_button():
    def quit_program():
        root.destroy()

    quit_button = ttk.Button(root, text="Quit", command=quit_program)
    quit_button.grid(column=0, row=9, columnspan=2, pady=10)

root = tk.Tk()
root.title("Caesar Cipher GUI")

welcome_label = ttk.Label(root, text=welcome())
welcome_label.grid(column=0, row=0, columnspan=2, pady=10)

choice_var = encrypt_decrypt_choice()
message_var = message_entry()
shift_var = shift_entry()
result_var = result_label()

continue_button(choice_var, message_var, shift_var, result_var)
quit_button()

root.mainloop()
