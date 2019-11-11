

def main():
    n1 = input()
    n2 = input()
    n2len = len(n2)

    while n2len != 0:
        a = n2[n2len - 1]
        print(int(n1) * int(a))
        n2len = n2len - 1
    else:
        print(int(n1) * int(n2))

if __name__ == '__main__':
    main()