import random
import os.path
import json
random.seed()

def draw_board(board):
    for i, row in enumerate(board):
        modified_row = [cell if cell != " " else " " for cell in row]
        print(" | ".join(modified_row))
        if i < len(board) - 1:
            print("---------")

def welcome(board):
    print(f'Welcome To Noughts and Crosses game.')
    draw_board(board)
    return

def initialise_board(board):
    for index in range(len(board)):
        board[index] = [" "] * len(board)
    return board
    
def get_player_move(board):
    while True:
        try:
            move = int(input("Where would you like to put your move: "))
            row = (move - 1) // 3
            col = (move - 1) % 3
            if 1 <= move <= 9 and board[row][col] == " ":
                return row, col
            else:
                print("Not a valid Move. Please enter (1-9)")
        except ValueError:
            print("Invalid input. Please enter a number")

def choose_computer_move(board):
    while True:
        row = random.randint(0, 2)
        col = random.randint(0, 2)
        
        if board[row][col] == " ":
            return row, col



def check_for_win(board, mark):
    # Check rows
    for row in board:
        if all(cell == mark for cell in row):
            return True

    # Check columns
    for col in range(len(board[0])):
        if all(board[row][col] == mark for row in range(len(board))):
            return True

    # Check main diagonal
    if all(board[i][i] == mark for i in range(len(board))):
        return True

    # Check anti-diagonal
    if all(board[i][len(board) - 1 - i] == mark for i in range(len(board))):
        return True

    return False


def check_for_draw(board):
    for row in board:
        for cell in row:
            if cell == " ":
                return False
    return True
        
def play_game(board):
    board = initialise_board(board)
    draw_board(board)

    while True:
        player_row, player_col = get_player_move(board)
        board[player_row][player_col] = "X"
        draw_board(board)

        if check_for_win(board, "X"):
            print("You WINNNN")
            return 1
        elif check_for_draw(board):
            print("Its a draw :c")
            return 0
        
        comp_row, comp_col = choose_computer_move(board)
        board[comp_row][comp_col] = "O"
        draw_board(board)

        if check_for_win(board, "O"):
            print("You Loseeee :c")
            return -1
        elif check_for_draw(board):
            print("Its a draw :c")
            return 0
                    
                
def menu():
    while True:
        print(f'''
                Select a choice:
                1. Play the game
                2. Save score
                3. Display Scores
                q. End the game
              ''')
        choice = input("Your choice: ")
        if choice not in ['1', '2', '3', 'q']:
            print(f'{choice} is not an option. Please choose a valid option.')
        else:
            return choice

def load_scores():
    leaders = {}
    if os.path.isfile('leaderboard.txt'):
        with open('leaderboard.txt', 'r') as file:
            try:
                leaders = json.load(file)
            except json.JSONDecodeError:
                print("Error decoding JSON. Leaderboard reset.")
    return leaders
    
def save_score(score):
    player_name = input("Enter your name: ")
    leaders = load_scores()
    leaders[player_name] = score
    with open('leaderboard.txt', 'w') as file:
        json.dump(leaders, file)
    return


def display_leaderboard(leaders):
    print("Leaderboard:")
    for name, score in sorted(leaders.items(), key=lambda x: x[1], reverse=True):
        print(f"{name}: {score}")
