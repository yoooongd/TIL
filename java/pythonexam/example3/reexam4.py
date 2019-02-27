import re
r=re.compile("a.c") #a와 c사이에 가운데 임의의 문자 존재
# 못찾으면 None
print(r.search("abc")) 
print(r.search("afc")) 
print(r.search("ac")) 
print("---------------------------")
r=re.compile("ck?w") #?:0번이나 1번 *:0번 이상 +: 1번이상
# 못찾으면 None
print(r.search("cw")) 
print(r.search("ckw")) 
print(r.search("ckkw")) 
print(r.search("ckk")) 
print(r.search("kkkw")) 
print("---------------------------")
r=re.compile("ck*w")
# 못찾으면 None
print(r.search("cw")) 
print(r.search("ckw")) 
print(r.search("ckkw")) 
print(r.search("ckk")) 
print(r.search("kkkw")) 
print("---------------------------")
r=re.compile("ck+w")
# 못찾으면 None
print(r.search("cw")) 
print(r.search("ckw")) 
print(r.search("ckkw")) 
print(r.search("ckk")) 
print(r.search("kkkw")) 

