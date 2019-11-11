def main():
  n = input()

  n = int(n)
  if n > 100000:
    return

  while n > 0:
    print(n)
    n = n - 1

if __name__ == '__main__':
    main()
    