def run():
  a = input()
  b = input()
  
  if int(a) <= 0:
    return

  if int(b) >= 10:
    return

  print(int(a) + int(b))

if __name__ == "__main__":
    run()