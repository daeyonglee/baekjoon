n, m = map(int, input().split())

arr = [0] + [i for i in range(1,n+1)]

for _ in range(m):
	i, j = map(int, input().split())
	arr[i], arr[j] = arr[j], arr[i]
 
print(" ".join(map(str, arr[1:])))