
def main():
  n = input()
  n = int(n)
  if n < 1 or n > 9:
    return

  print('{} * 1 = {}'.format(n, n*1))
  print('{} * 2 = {}'.format(n, n*2))
  print('{} * 3 = {}'.format(n, n*3))
  print('{} * 4 = {}'.format(n, n*4))
  print('{} * 5 = {}'.format(n, n*5))
  print('{} * 6 = {}'.format(n, n*6))
  print('{} * 7 = {}'.format(n, n*7))
  print('{} * 8 = {}'.format(n, n*8))
  print('{} * 9 = {}'.format(n, n*9))


if __name__ == '__main__':
    main()
    