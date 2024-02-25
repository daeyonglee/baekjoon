arr = [i for i in range(31)]
for i in range(28):
    sin = int(input())
    arr[sin] = 0
    
for a in arr:
    if a != 0:
        print(a)