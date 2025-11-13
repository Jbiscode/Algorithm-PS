people = int(input())
cloth_size = list(map(int, input().split(" ")));
T,P = list(map(int,input().split(" ")));

cloth_answer = 0

for num in cloth_size:
  if num > 0:
    cloth_answer += (num + T -1 )//T

print(cloth_answer)
print(f"{people // P} {people % P}")