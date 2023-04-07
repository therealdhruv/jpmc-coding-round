def solve(s,n,i):
    if(n < 0): return 0 
    return (ord(s[n])-ord('a')+1)*(20**i)+solve(s,n-1,i+1)
s=input()
n=len(s) 
print(solve(s,n-1,0))