def play_game():
    game_board = [[1,1,1],
                  [1,1,1],
                  [1,1,1]]
    moves = 0
    used_moves = set()

    print("Initial board:")
    for row in game_board:
        print(row)
    
    while True:
        row = int(input("Enter row index (0-2):"))
        column = int(input("Enter column index (0-2):"))
        moves += 1
        if not (0 <= row <= 2) or not (0 <= column <= 2):
                print("Invalid input. Please enter values between 0 and 2.")
                continue
        if (row, column) in used_moves:
            print("This move is already used, Please enter another move:")
        else:
            game_board[row][column] = 'X'
            used_moves.add((row, column))
            

            print("Updated Game board:")
            for row in game_board:
                print(row)

            if len(used_moves) == 9:
                print(f"Congratulation you finished the game with {moves} number of moves")
                break;

if __name__  == "__main__":
     play_game()