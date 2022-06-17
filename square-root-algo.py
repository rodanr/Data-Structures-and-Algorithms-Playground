from random import randint


def square_root(n):
    if type(n) == type(""):
        try:
            n = int(n)
        except ValueError:
            print("Input should be a integer\n")
    guess = randint(1, 10)
    while(True):

        if round(guess*guess, 4) == n:
            return round(guess, 4)
        else:
            guess = (guess + (n/guess))/2


n = input("Enter a number to find square root or enter 'q' to exit\n")
if (n == 'q'):
    quit()
print(f"Square root of {n} is {square_root(n)}")
