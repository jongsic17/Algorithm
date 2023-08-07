N = int(input())
b = []
dp = [ 0 * N for _ in range(N+1)]
for i in range(N):
    T, P = map(int, input().split())
    b.append([T,P])

for i in range(N-1, -1, -1):
    if b[i][0] + i > N:
        dp[i] = dp[i+1]
    else:
        dp[i] = max(dp[i+1],b[i][1] + dp[i + b[i][0]] )
print(dp[0])