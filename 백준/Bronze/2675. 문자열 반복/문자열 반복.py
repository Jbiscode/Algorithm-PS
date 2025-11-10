n = int(input())

for i in range(n):
    num, text = input().split()
    result = ''.join(int(num) * char for char in text)
    print(result)