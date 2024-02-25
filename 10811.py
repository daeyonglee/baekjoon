n, m = map(int,input().split())

arr = [0] + [i for i in range(1, n+1)]

for _ in range(m):
	i, j = map(int,input().split())
	a,b,c = arr[:i], arr[i:j+1], arr[j+1:]
	b.reverse()
	arr = a + b + c

arr.pop(0)
print(" ".join(map(str,arr)))
		