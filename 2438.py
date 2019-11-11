

def main():
  n = input()
  n = int(n)

  if n < 1 or n > 100:
    return

  output = ''

  for i in range(0, n):
    output += '*'
    print(output)

if __name__ == '__main__':
    main()
    