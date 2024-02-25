n = int(input())
items = list(map(int,input().split()))
v = int(input())

result = 0
for item in items:
  result += 1 if item == v else 0
  
print(result)