total_amount = int(input())
count = int(input())

acc_amount = 0 

for _ in range(count):
    a, b = tuple(map(int,input().split()))
    acc_amount += a * b
    
if total_amount == acc_amount:
    print("Yes")
else:
    print("No")

