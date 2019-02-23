```python
import random

#res=["파파존스","BBQ","바스버거"]
#name=random.choice(res)

dic={
  "파파존스":"010-1111-2222",
  "BBQ":"1111-1111-1111",
  "바스버거":"1111-1122-3333"
}

#number = dic[name]
#print(f"{name}의 전화번호는 {number} 입니다.")

name=random.choice(list(dic.keys()))
number = dic[name]

print(name,number)
```

- PYTHON dictionary 실습예제



## 웹 API 받아오기

요청과 응답

