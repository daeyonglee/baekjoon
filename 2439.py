
def main():

  n = input()
  n = int(n)

  if n < 1 or n > 100:
    return

  output = ''
  sc = 1
  while n >= sc:
    j = n
    while j > 0:
      if sc >= j:
        output += '*'
      else:
        output += ' '
      j = j - 1
    print(output)
    sc = sc + 1
    output = ''
    

if __name__ == '__main__':
    main()
    