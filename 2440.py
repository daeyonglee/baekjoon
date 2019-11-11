
def main():
  n = input()
  n = int(n)

  if n < 1 or n > 100:
    return
  
  output = ''
  bc = 1

  for i in range(1, n+1):
    while i <= n:
      if i >= bc:
        output += '*'
      else:
        output += ' '
      
      i += 1
    print(output)
    bc += 1
    output = ''

if __name__ == '__main__':
    main()
    